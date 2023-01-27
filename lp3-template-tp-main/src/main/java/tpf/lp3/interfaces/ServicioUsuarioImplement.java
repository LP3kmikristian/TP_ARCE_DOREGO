package tpf.lp3.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.usuarios.Administrador;
import tpf.lp3.usuarios.Auditor;
import tpf.lp3.usuarios.Despachante;
import tpf.lp3.usuarios.Transportista;
import tpf.lp3.clases.Usuario;
import tpf.lp3.repositorios.UsuarioRepositorio;

/* IMPLEMENTACION DE LAS FUNCIONES DECLARADAS EN ServicioImpuesto PARA EL USO DE LAS OPERACIONES DE CRUD*/
//se marca como @Servicio para que se reconozca en el escaneo
@Service
public class ServicioUsuarioImplement implements ServicioUsuario{
	@Autowired
	private UsuarioRepositorio repoUsuario; // repositorio de usuarios
	
	@Override
	public Usuario crearAdministrador(Administrador a1) {
		// guardamos el nuevo administrador
		return repoUsuario.save(a1); 
		
	}

	@Override
	public Usuario crearAuditor(Auditor a1) {
		// guardamos el nuevo auditor
		return repoUsuario.save(a1); 
		
	}

	@Override
	public Usuario crearDespachante(Despachante d1) {
		// guardamos el nuevo despachante
		return repoUsuario.save(d1); 
		
	}

	@Override
	public Usuario crearTransportista(Transportista t1) {
		// guardamos el nuevo transportista
		return repoUsuario.save(t1); 
		
	}

	@Override
	public Boolean actualizarAdministrador(Administrador a1) {
		// buscamos el administrador que se quiere actualizar
		Optional<Usuario> usuarioActual= repoUsuario.findById(a1.getId());
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
		Optional<Usuario> usuarioActual= repoUsuario.findById(a1.getId());
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
		Optional<Usuario> usuarioActual= repoUsuario.findById(d1.getId());
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
		Optional<Usuario> usuarioActual= repoUsuario.findById(t1.getId());
		// si existe entonces se actualiza y se retorna true
		if (usuarioActual.isPresent()){
			repoUsuario.save(t1);
			return true;	
		}
		else return false;
	}
	
	@Override
	public Boolean eliminarUsuario(Long id) {
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
	public Usuario buscarUsuario(Long id) {
		// buscamos el usuario por id
		Optional<Usuario> buscarUsuario= repoUsuario.findById(id);
		// si existe entonces se retorna y si no se no se retorna nada
		if (buscarUsuario.isPresent()){
			return buscarUsuario.get();
		}
		else return null;
	}

	@Override
	public List<Usuario> todosUsuarios(String rol) {
		List<Usuario> listaUsuarios=repoUsuario.findByRol(rol);
		return listaUsuarios;
	}

}
