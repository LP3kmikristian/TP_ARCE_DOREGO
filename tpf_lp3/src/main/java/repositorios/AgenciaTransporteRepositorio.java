package repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import clases.Servicio;
import servicios.Transporte;
import servicios.Almacenamiento;


@Repository
@RepositoryRestResource(collectionResourceRel = "agenciaTransporte", path = "agenciaTransporte")
public interface AgenciaTransporteRepositorio extends CrudRepository<Servicio, Long>{
	Optional<Transporte> findByChapa(String chapa_transporte);
	void deleteByChapa(String chapa_transporte);
	List<Transporte> findAllTransporte();
	
	Optional<Almacenamiento> findByIdAlmacenamiento(long id_almacenamiento);
	void deleteByIdAlmacenamiento(long id_almacenamiento);
	List<Almacenamiento> findAllAlmacenamiento();

}

