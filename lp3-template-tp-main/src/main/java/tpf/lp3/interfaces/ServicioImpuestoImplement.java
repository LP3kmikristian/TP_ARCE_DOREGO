package tpf.lp3.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Impuesto;
import tpf.lp3.repositorios.ImpuestoRepositorio;

		/* IMPLEMENTACION DE LAS FUNCIONES DECLARADAS EN ServicioImpuesto PARA EL USO DE LAS OPERACIONES DE CRUD*/

// se marca como @Servicio para que se reconozca en el escaneo
@Service
public class ServicioImpuestoImplement implements ServicioImpuesto{
	
	@Autowired
	private ImpuestoRepositorio repoImpuesto; // repositorio de impuestos
	
	
	
	@Override
	public List<Impuesto> listarImpuesto() {
		// retornamos la lista de todos los impuestos en el repositorio
		List<Impuesto> todosImpuestos = repoImpuesto.findAll();
		return todosImpuestos;
	}
	
	@Override
	public Impuesto buscarImpuesto(Long id) {
		// retorna el impuesto solicitado si se encuentra en el repositorio
		Optional<Impuesto> i1= repoImpuesto.findById(id);
		if (i1.isPresent()) {
			return i1.get();
		}
		// si no se encuentra se retorna null
		else return null;
	}
	
	@Override
	public Impuesto crearImpuesto(Impuesto i1) {
		// guardamos el nuevo impuesto en el repositorio
		return repoImpuesto.save(i1);
		
	}

	@Override
	public Impuesto editarImpuesto(Impuesto i1) {
		// buscamos el impuesto que se quiere actualizar en el repositorio
		Optional<Impuesto> impuestoActual= repoImpuesto.findById(i1.getId());
		// si existe entonces se actualiza y se retorna 
		if (impuestoActual.isPresent()){
			return repoImpuesto.save(i1);
				
		}
		// si no se encuentra se retorna null
		else return null;
	}

	@Override
	public Boolean eliminarImpuesto(Long id) {
		// buscamos el impuesto por id en el repositorio
		Optional<Impuesto> buscarImpuesto= repoImpuesto.findById(id);
		// si existe entonces se elimina y se retorna true si no se retorna false
		if(buscarImpuesto.isPresent()) {
			repoImpuesto.deleteById(id);
			return true;
		}
		else return false;
	}

	

}
