package interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import clases.Presupuesto;
import repositorios.PresupuestoRepositorio;


public class ServicioPresupuestoImplement implements ServicioPresupuesto{
	@Autowired
	private PresupuestoRepositorio repoPresupuesto;
	
	@Override
	public List<Presupuesto> listarPresupuestos() {
		// retornamos la lista de todos los presupuestos
		return repoPresupuesto.findAll();
	}

	@Override
	public Boolean crearPresupuesto(Presupuesto p1) {
		// guardamos el nuevo presupuesto y retornamos true
		repoPresupuesto.save(p1);
		return true;
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

	@Override
	public Boolean editarPresupuesto(Presupuesto p1) {
		// buscamos el presupuesto que se quiere actualizar
		Optional<Presupuesto> presupuestoActual= repoPresupuesto.findById(p1.getId_presupesto());
		// si existe entonces se actualiza y se retorna true
		if (presupuestoActual.isPresent()){
			repoPresupuesto.save(p1);
			return true;	
		}
		else return false;
	}

}
