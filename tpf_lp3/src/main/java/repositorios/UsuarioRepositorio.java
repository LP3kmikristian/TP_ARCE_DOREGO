package repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import clases.Usuario;

@Repository
@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario")
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long>{
	List<Usuario> usuarioPorRol(String rol); // se devuelve la lista de usuarios que tienen el mismo rol
	
}
