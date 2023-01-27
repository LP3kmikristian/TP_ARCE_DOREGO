package tpf.lp3.repositorios;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import tpf.lp3.clases.Presupuesto;
@Repository
//@RepositoryRestResource(collectionResourceRel = "presupuesto", path = "presupuesto")

public interface PresupuestoRepositorio extends CrudRepository<Presupuesto, Long>{
	List<Presupuesto> findAll();

}
