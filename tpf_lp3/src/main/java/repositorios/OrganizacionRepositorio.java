package repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import clases.Organizacion;

@Repository
@RepositoryRestResource(path="/organizacion")
public interface OrganizacionRepositorio extends CrudRepository<Organizacion, Long>{
	List<Organizacion> findAll();
	List<Organizacion> organizacionPorTipo(String tipo);
}
