package tpf.lp3.Utilidades;

import org.springframework.beans.factory.annotation.Autowired;

import tpf.lp3.clases.Impuesto;
import tpf.lp3.clases.Producto;
import tpf.lp3.repositorios.ImpuestoRepositorio;
import tpf.lp3.repositorios.ProductosRepositorio;
import tpf.lp3.repositorios.ServiciosRepositorio;
import tpf.lp3.servicios.Almacenamiento;
import tpf.lp3.servicios.Transporte;

//@Component
public class Utils {
	@Autowired
	private ServiciosRepositorio repoServicios;
	private ImpuestoRepositorio repoImpuesto;
	private ProductosRepositorio repoProducto;
	
	public static Double calcularImpuesto(Producto p1, Impuesto i1) {
		Double totalImpuestoPedido=(double) 0;
		/*/Optional<Impuesto> i1=repoImpuesto.findById(p1.getId_impuesto());
		//Impuesto impuesto_del_pedido=new Impuesto();
		//Optional<Producto> produ;
		//Producto producto=new Producto();
		//if(i1.isPresent()) {
		//	impuesto_del_pedido=i1.get();
		//}
		//List<Long> productos=p1.getLista();
		for(int i=0; i<productos.size(); i++) {
			produ=repoProducto.findById(productos.get(i));
			if(produ.isPresent()) {
				producto=produ.get();
			}
			// se calcula el impuesto sobre el producto y se suma al total
			totalImpuestoPedido+=producto.getPrecio_total()*impuesto_del_pedido.getPorcentaje_a_cobrar();
		}
		
		return totalImpuestoPedido;*/
		return p1.getPrecio_total()*i1.getPorcentaje_a_cobrar();
	}
	/*
	public static Double calcularPesoPedido(Pedido p1) {
		// se hace un for y por cada producto del pedido, se obtiene el peso_unitario y la cantidad
		// se calcula y se suma el peso total del pedido
		Double peso_pedido=(double) 0;
		Optional<Producto> produ;
		Producto producto=new Producto();
		for(int i=0; i<p1.getLista().size(); i++) {
			produ=repoProducto.findById(p1.getLista().get(i));
			if(produ.isPresent()) {
				producto=produ.get();
			}
			peso_pedido+=producto.getPeso_unitario()*producto.getCantidad();
		}
		return peso_pedido;
	}*/
	public static Double calcularPrecioTransporte(Double peso, Transporte t1) {
		// se obtiene el peso total del pedido
		/*Double peso=calcularPesoPedido(p1);
		Optional<Servicio> transport=repoServicios.findById(p1.getId_transporte());
		Servicio t1=new Transporte();
		if(transport.isPresent()) {
			t1=transport.get();
		}*/
		Double precio_por_peso = t1.getPrecio() * peso;
		return precio_por_peso;
	}
	public static Double calcularPrecioAlmacenamiento(Double peso, Almacenamiento a1) {
		/*Double peso=calcularPesoPedido(p1);
		Optional<Servicio> almacenam=repoServicios.findById(p1.getId_almacenamiento());
		Servicio t1=new Almacenamiento();
		if(almacenam.isPresent()) {
			t1=almacenam.get();
			//if(t1.getTipo())
		}*/
		Double precio_por_peso = a1.getPrecio() * peso;
		return precio_por_peso;
		
	}
	/*
	public static Double calcularSubTotal(Pedido p1) {
		Optional<Producto> produ;
		Producto producto=new Producto();
		Double sub_total_pedido=(double) 0;
		for(int i=0; i<p1.getLista().size();i++) {
			produ=repoProducto.findById(p1.getLista().get(i));
			if(produ.isPresent()) {
				producto=produ.get();
			}
			sub_total_pedido+=producto.getPrecio_total()*producto.getPeso_unitario();
		}
		
		return sub_total_pedido;
		
	}*/
	/*
	public static Presupuesto generarPresupuesto(Pedido p1){
		Presupuesto presu1=new Presupuesto();
		System.out.print(p1.getId_impuesto());
		System.out.print(p1.getId_transporte());
		System.out.print(p1.getId_almacenamiento());
		Double sub_total=calcularSubTotal(p1);
		
		presu1.setTotal_impuestos(calcularImpuesto(p1));
		presu1.setSub_total(calcularSubTotal(p1));
		presu1.setId(p1.getId());
		
		return presu1;
	}
	*/
	

}
