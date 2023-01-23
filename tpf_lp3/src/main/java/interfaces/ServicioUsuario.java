package interfaces
;

import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import clases.Usuario;
import usuarios.Administrador;
import usuarios.Auditor;
import usuarios.Despachante;
import usuarios.Transportista;


@Repository
@RepositoryRestResource(path="/usuario")
public interface ServicioUsuario {
	
	// @put
	Boolean crearAdministrador(Administrador a1);
	Boolean crearAuditor(Auditor a1);
	Boolean crearDespachante(Despachante d1);
	Boolean crearTransportista(Transportista t1);
	
	//@update
	Boolean actualizarAdministrador(Administrador a1);
	Boolean actualizarAuditor(Auditor a1);
	Boolean actualizarDespachante(Despachante d1);
	Boolean actualizarTransportista(Transportista t1);
	
	// @get
	Usuario buscarUsuario(long id);
	List<Usuario> buscarUsuarios(String rol);
	 
	//@delete
	Boolean eliminarUsuario(long id);

				

}
