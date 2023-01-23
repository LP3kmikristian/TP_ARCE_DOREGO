package repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import clases.Impuesto;

@Repository
@RepositoryRestResource(path="/organizacion")

public interface ImpuestoRepositorio extends CrudRepository<Impuesto, Long>{
	List<Impuesto> findAll();

}
