package repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import clases.Presupuesto;

public interface PresupuestoRepositorio extends CrudRepository<Presupuesto, Long>{
	List<Presupuesto> findAll();

}
