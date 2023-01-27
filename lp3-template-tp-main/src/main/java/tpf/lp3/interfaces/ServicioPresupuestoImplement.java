package tpf.lp3.interfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Impuesto;
import tpf.lp3.clases.Presupuesto;
import tpf.lp3.clases.Producto;
import tpf.lp3.clases.Servicio;
import tpf.lp3.clases.Usuario;
import tpf.lp3.repositorios.ImpuestoRepositorio;
import tpf.lp3.repositorios.PresupuestoRepositorio;
import tpf.lp3.repositorios.ProductosRepositorio;
import tpf.lp3.repositorios.ServiciosRepositorio;
import tpf.lp3.repositorios.UsuarioRepositorio;
import tpf.lp3.servicios.Almacenamiento;
import tpf.lp3.servicios.Transporte;
import tpf.lp3.Utilidades.Utils;

@Service
public class ServicioPresupuestoImplement implements ServicioPresupuesto{
	@Autowired
	private PresupuestoRepositorio repoPresupuesto;
	
	@Autowired
	private ImpuestoRepositorio repoImpuesto;
	
	@Autowired
	private ServiciosRepositorio repoServicio;
	
	@Autowired
	private ProductosRepositorio repoProducto;
	
	@Override
	public ArrayList<Presupuesto> listarPresupuesto() {
		// retornamos la lista de todos los presupuestos
		return (ArrayList<Presupuesto>) repoPresupuesto.findAll();
	}
	
	@Override
	public Presupuesto buscarPresupuesto(long id_pedido) {
		// retorna el impuesto solicitado
		Optional<Presupuesto> p1= repoPresupuesto.findById(id_pedido);
		if (p1.isPresent()) {
			return p1.get();
		}
		else return null;
	}

	@Override
	public Presupuesto crearPresupuesto(Presupuesto p1) {
		
		Presupuesto presu1 = new Presupuesto();
		Double sub_total=(double)0, total_impuestos=(double)0, peso=(double)0;
		Producto producto=new Producto();
		Optional<Impuesto> im=repoImpuesto.findById(p1.getId_impuesto());
		Impuesto impuesto_pedido=new Impuesto();
		Optional<Servicio> transport=repoServicio.findById(p1.getId_transporte());
		Servicio t1=new Servicio();
		Optional<Servicio> almacem=repoServicio.findById(p1.getId_almacenamiento());
		Servicio a1=new Servicio();
		if(im.isPresent() && transport.isPresent() && almacem.isPresent()) {
			impuesto_pedido=im.get();
			t1=transport.get();
			a1=almacem.get();
		}
		//presu1=Utils.generarPresupuesto(p1);
		List<Long> lista=p1.getLista();
		for(int i=0; i<lista.size(); i++) {
			Optional<Producto> prod=repoProducto.findById(lista.get(i));
			if(prod.isPresent()) {
				producto=prod.get();
				sub_total+=producto.getPrecio_total();
				peso+=producto.getPeso();
			}
		}
		if(p1.getDestino_pedido()=="Paraguay"||p1.getDestino_pedido()=="paraguay") {
			presu1.setOperacion("Importacion");
		}
		else {
			presu1.setOperacion("Exportacion");
		}
		
		presu1.setTotal_impuestos(sub_total*impuesto_pedido.getPorcentaje_a_cobrar());
		presu1.setTotal_servicios((peso*t1.getPrecio())+(peso*a1.getPrecio()));
		presu1.setSub_total(sub_total);
		//presu1.setId(p1.getId());
		presu1.setTOTAL(sub_total+presu1.getTotal_impuestos()+presu1.getTotal_servicios());
		repoPresupuesto.save(presu1);
		return presu1;
		//return null;
	}

	@Override
	public Boolean eliminarPresupuesto(long id_presupuesto) {
		// buscamos el presupuesto por id
		Optional<Presupuesto> buscarPresupuesto= repoPresupuesto.findById(id_presupuesto);
		// si existe entonces se elimina y se retorna true si no se retorna false
		if(buscarPresupuesto.isPresent()) {
			repoPresupuesto.deleteById(id_presupuesto);
			return true;
		}
		else return false;
	}

}
