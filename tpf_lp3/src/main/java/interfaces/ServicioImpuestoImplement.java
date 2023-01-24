package interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import clases.Impuesto;
import repositorios.ImpuestoRepositorio;

public class ServicioImpuestoImplement implements ServicioImpuesto{
	
	@Autowired
	private ImpuestoRepositorio repoImpuesto;
	
	@Override
	public List<Impuesto> listarImpuesto() {
		// retornamos la lista de todos los impuestos
		List<Impuesto> todosImpuestos = repoImpuesto.findAll();
		return todosImpuestos;
	}
	@Override
	public Impuesto buscarImpuesto(long id_impuesto) {
		// retorna el impuesto solicitado
		Optional<Impuesto> i1= repoImpuesto.findById(id_impuesto);
		if (i1.isPresent()) {
			return i1.get();
		}
		else return null;
	}
	@Override
	public Boolean crearImpuesto(Impuesto i1) {
		// guardamos el nuevo impuesto
		repoImpuesto.save(i1);
		return true;
	}

	@Override
	public Boolean editarImpuesto(Impuesto i1) {
		// buscamos el impuesto que se quiere actualizar
		Optional<Impuesto> impuestoActual= repoImpuesto.findById(i1.getId_impuesto());
		// si existe entonces se actualiza y se retorna true
		if (impuestoActual.isPresent()){
			repoImpuesto.save(i1);
			return true;	
		}
		else return false;
	}

	@Override
	public Boolean eliminarImpuesto(long id_impuesto) {
		// buscamos el impuesto por id
		Optional<Impuesto> buscarImpuesto= repoImpuesto.findById(id_impuesto);
		// si existe entonces se elimina y se retorna true si no se retorna false
		if(buscarImpuesto.isPresent()) {
			repoImpuesto.deleteById(id_impuesto);
			return true;
		}
		else return false;
	}

	

}
