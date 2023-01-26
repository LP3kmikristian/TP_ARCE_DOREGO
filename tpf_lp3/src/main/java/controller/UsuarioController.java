package controller;

import java.util.List;

//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import interfaces.ServicioUsuario;
import clases.Usuario;
import usuarios.Administrador;
import usuarios.Auditor;
import usuarios.Despachante;
import usuarios.Transportista;
@RestController
public class UsuarioController {
	
	@Autowired
	private ServicioUsuario servicioUsu;
	
	
	@PutMapping(
			value = "/crearAdministrador",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean crearAdministrador(@RequestBody Administrador a1) {
		servicioUsu.crearAdministrador(a1);
		return true;
	}
	
	@PutMapping(
			value = "/crearAuditor",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean crearAuditor(@RequestBody Auditor a1) {
		servicioUsu.crearAuditor(a1);
		return true;
	}
	
	@PutMapping(
			value = "/crearDespachante",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean crearDespachante(@RequestBody Despachante d1) {
		servicioUsu.crearDespachante(d1);
		return true;
	}
	
	@PutMapping(
			value = "/crearTransportista",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean crearTransportista(@RequestBody Transportista t1) {
		servicioUsu.crearTransportista(t1);
		return true;
	}
	
	@PutMapping(
			value = "/actualizarAdministrador",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean actualizarAdministrador(@RequestBody Administrador a1) {
		servicioUsu.actualizarAdministrador(a1);
		return true;
	}
	
	@PutMapping(
			value = "/actualizarAuditor",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean actualizarAuditor(@RequestBody Auditor a1) {
		servicioUsu.actualizarAuditor(a1);
		return true;
	}
	
	@PutMapping(
			value = "/actualizarDespachante",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean actualizarDespachante(@RequestBody Despachante d1) {
		servicioUsu.actualizarDespachante(d1);
		return true;
	}
	
	@PutMapping(
			value = "/actualizarTransportista",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean actualizarTransportista(@RequestBody Transportista t1) {
		servicioUsu.actualizarTransportista(t1);
		return true;
	}
	
	@GetMapping("/buscarUsuario/{id}")
	public Usuario buscarUsuario(@PathVariable long id) {
		servicioUsu.buscarUsuario(id);
		return null;
	}	
	
	@GetMapping("/buscarUsuarios/{rol}")
	public List<Usuario> buscarUsuarios(String rol) {
		servicioUsu.buscarUsuarios(rol);
		return null;
	} 
			
	
	@DeleteMapping("/eliminarUsuario/{id}")
	public Boolean eliminarUsuario(@PathVariable long id) {
		servicioUsu.eliminarUsuario(id);
		return true;
	}

}
