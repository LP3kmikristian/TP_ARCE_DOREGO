package tpf.lp3.Utilidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import tpf.lp3.clases.Impuesto;
import tpf.lp3.clases.Pedido;
import tpf.lp3.clases.Producto;
import tpf.lp3.repositorios.AlmacenamientoRepositorio;
import tpf.lp3.repositorios.ImpuestoRepositorio;
import tpf.lp3.repositorios.TransporteRepositorio;
import tpf.lp3.servicios.Almacenamiento;
import tpf.lp3.servicios.Transporte;
import tpf.lp3.clases.Presupuesto;

//@Component
public class Utils {
	@Autowired
	private static TransporteRepositorio repoTransport;
	private static AlmacenamientoRepositorio repoAlmacenam;
	private static ImpuestoRepositorio repoImpuesto;
	
	public static Double calcularImpuesto(Pedido p1) {
		Double totalImpuestoPedido=(double) 0;
		Optional<Impuesto> i1;
		Impuesto impuesto_del_producto = new Impuesto();
		long id_producto;
		List<Producto> productos=p1.getLista();
		for(int i=0; i<productos.size(); i++) {
			// se obtiene el id del producto
			id_producto=productos.get(i).getId();
			// se busca el impuesto que se aplica sobre el producto
			i1=repoImpuesto.findById(id_producto);
			if(i1.isPresent()) {
				impuesto_del_producto=i1.get();
			}
			// se calcula el impuesto sobre el producto y se suma al total
			totalImpuestoPedido+=productos.get(i).getPrecio_total()*impuesto_del_producto.getPorcentaje_a_cobrar();
		}
		
		return totalImpuestoPedido;
	}
	
	public static Boolean tieneDescuento(Pedido p1) { // retorna true si es un producto del Mercosur y false en caso contrario
		Boolean esMercosur = false;
		String[] mercosur = {"Argentina", "Paraguay", "Brasil", "Bolivia", "Uruguay", "Venezuela"};
		for(int i=0; i<5; i++) {
			if(p1.procedencia_pedido==mercosur[i]) {
				esMercosur=true;
				break;
			}
		}
		return esMercosur;
	}
	public static Double calcularPesoPedido(Pedido p1) {
		// se hace un for y por cada producto del pedido, se obtiene el peso_unitario y la cantidad
		// se calcula y se suma el peso total del pedido
		Double peso_pedido=(double) 0;
		List<Producto> productos=p1.getLista();
		for(int i=0; i<productos.size(); i++) {
			peso_pedido+=productos.get(i).getPeso_unitario()*productos.get(i).getCantidad();
		}
		return peso_pedido;
	}
	public static Double calcularPrecioTransporte(Transporte t1, Pedido p1) {
		// se obtiene el peso total del pedido
		Double peso=calcularPesoPedido(p1);
		Double precio_por_peso = t1.getPrecio_por_peso() * peso;
		//Double precio_por_distancia = t1.getPrecio_por_distancia();
		return precio_por_peso; //+ precio_por_distancia);
	}
	public static Double calcularPrecioAlmacenamiento(Almacenamiento a1, Pedido p1) {
		return null;
	}
	
	public static Presupuesto generarPresupuesto(Pedido p1){
		Presupuesto presu1=new Presupuesto();
		ArrayList<String> precios_transportes = new ArrayList<String>();
		ArrayList<String> precios_almacenamientos = new ArrayList<String>();
		// se obtiene la lista de los transportes y almacenamientos disponibles
		List<Transporte> transporteDisponible = repoTransport.findAll();
		List<Almacenamiento> almacenamientoDisponible = repoAlmacenam.findAll();
		Double total_impuestos=calcularImpuesto(p1);
		Double sub_total_pedido=total_impuestos;
		long id_pedido=p1.getId();
		
		for(int i=0; i<transporteDisponible.size(); i++) {
			Transporte t=transporteDisponible.get(i);
			Double precio_t=calcularPrecioTransporte(t, p1);
			String opcion_t = "TRANSPORTE: " + t.toString() + ", PRECIO: " + precio_t.toString();
			precios_transportes.add(opcion_t);
		}
		for(int i=0; i<almacenamientoDisponible.size(); i++) {
			Almacenamiento a = almacenamientoDisponible.get(i);
			Double precio_a=calcularPrecioAlmacenamiento(a, p1);
			String opcion_a="ALMACENAMIENTO: "+a.toString()+", PRECIO POR DIA: "+precio_a.toString();
			precios_almacenamientos.add(opcion_a);
		}
		for(int i=0; i<p1.getLista().size();i++) {
			sub_total_pedido+=p1.getLista().get(i).precio_total;
		}
		
		//presu1.setOpcionesTransporte(precios_transportes);
		///presu1.setOpcionesAlmacenamiento(precios_almacenamientos);
		presu1.setTotal_impuestos(total_impuestos);
		presu1.setSub_total(sub_total_pedido);
		presu1.setId(id_pedido);
		
		return presu1;
	}
	
	

}
