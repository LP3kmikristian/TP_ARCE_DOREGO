package interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import usuarios.Administrador;
import usuarios.Auditor;
import usuarios.Despachante;
import usuarios.Transportista;
import clases.Usuario;
import repositorios.UsuarioRepositorio;

// se implementan las funciones de la interfaz ServicioUsuario

public class ServicioUsuarioImplement implements ServicioUsuario{
	@Autowired
	private UsuarioRepositorio repoUsuario;
	
	@Override
	public Boolean crearAdministrador(Administrador a1) {
		// guardamos el nuevo administrador
		repoUsuario.save(a1); 
		return true;
		
	}

	@Override
	public Boolean crearAuditor(Auditor a1) {
		// guardamos el nuevo auditor
		repoUsuario.save(a1); 
		return true;
	}

	@Override
	public Boolean crearDespachante(Despachante d1) {
		// guardamos el nuevo despachante
		repoUsuario.save(d1); 
		return true;
	}

	@Override
	public Boolean crearTransportista(Transportista t1) {
		// guardamos el nuevo transportista
		repoUsuario.save(t1); 
		return true;
	}

	@Override
	public Boolean actualizarAdministrador(Administrador a1) {
		// buscamos el administrador que se quiere actualizar
		Optional<Usuario> usuarioActual= repoUsuario.findById(a1.getId_usuario());
		// si existe entonces se actualiza y se retorna true
		if (usuarioActual.isPresent()){
			repoUsuario.save(a1);
			return true;	
		}
		else return false;
	}

	@Override
	public Boolean actualizarAuditor(Auditor a1) {
		// buscamos el auditor que se quiere actualizar
		Optional<Usuario> usuarioActual= repoUsuario.findById(a1.getId_usuario());
		// si existe entonces se actualiza y se retorna true
		if (usuarioActual.isPresent()){
			repoUsuario.save(a1);
			return true;	
		}
		else return false;
	}

	@Override
	public Boolean actualizarDespachante(Despachante d1) {
		// buscamos el despachante que se quiere actualizar
		Optional<Usuario> usuarioActual= repoUsuario.findById(d1.getId_usuario());
		// si existe entonces se actualiza y se retorna true
		if (usuarioActual.isPresent()){
			repoUsuario.save(d1);
			return true;	
		}
		else return false;
	}

	@Override
	public Boolean actualizarTransportista(Transportista t1) {
		// buscamos el transportista que se quiere actualizar
		Optional<Usuario> usuarioActual= repoUsuario.findById(t1.getId_usuario());
		// si existe entonces se actualiza y se retorna true
		if (usuarioActual.isPresent()){
			repoUsuario.save(t1);
			return true;	
		}
		else return false;
	}
	
	@Override
	public Boolean eliminarUsuario(long id) {
		// buscamos el usuario por id
		Optional<Usuario> buscarUsuario= repoUsuario.findById(id);
		// si existe entonces se elimina y se retorna true si no se retorna false
		if(buscarUsuario.isPresent()) {
			repoUsuario.deleteById(id);
			return true;
		}
		else return false;
	}
	
	@Override
	public Usuario buscarUsuario(long id) {
		// buscamos el usuario por id
		Optional<Usuario> buscarUsuario= repoUsuario.findById(id);
		// si existe entonces se retorna y si no se no se retorna nada
		if (buscarUsuario.isPresent()){
			return buscarUsuario.get();
		}
		else return null;
	}

	@Override
	public List<Usuario> buscarUsuarios(String rol) {
		List<Usuario> listaUsuarios=repoUsuario.usuarioPorRol(rol);
		return listaUsuarios;
	}

}
