package repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import clases.Usuario;

@Repository
@RepositoryRestResource(path="/usuario")
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long>{

}
