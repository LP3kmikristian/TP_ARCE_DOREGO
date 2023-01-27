package tpf.lp3.controller;

import java.util.List;

//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
import tpf.lp3.interfaces.ServicioUsuario;
import tpf.lp3.clases.Usuario;
import tpf.lp3.usuarios.Administrador;
import tpf.lp3.usuarios.Auditor;
import tpf.lp3.usuarios.Despachante;
import tpf.lp3.usuarios.Transportista;
@RestController
@RequestMapping(ApiPaths.USUARIO)
public class UsuarioController {
	
	@Autowired
	private ServicioUsuario servicioUsu;
	
	@PostMapping(value = "/crearUsuario")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return servicioUsu.crearUsuario(usuario);
	}
	
	@PostMapping(value = "/crearUsuario/administrador")
	public Usuario crearAdministrador(@RequestBody Administrador a1) {
		return servicioUsu.crearAdministrador(a1);
	}
	
	@PostMapping(value = "/crearUsuario/auditor")
	public Usuario crearAuditor(@RequestBody Auditor a1) {
		return servicioUsu.crearAuditor(a1);
	}
	
	@PostMapping(value = "/crearUsuario/despachante")
	public Usuario crearDespachante(@RequestBody Despachante d1) {
		return servicioUsu.crearDespachante(d1);
	}
	
	@PostMapping(value = "/crearUsuario/transportista")
	public Usuario crearTransportista(@RequestBody Transportista t1) {
		return servicioUsu.crearTransportista(t1);
	}
	
	@PutMapping("/editarUsuario/administrador")
	public Boolean actualizarAdministrador(@RequestBody Administrador a1) {
		return servicioUsu.actualizarAdministrador(a1);
		
	}
	
	@PutMapping(value = "/editarUsuario/auditor")
	public Boolean actualizarAuditor(@RequestBody Auditor a1) {
		return servicioUsu.actualizarAuditor(a1);
	}
	
	@PutMapping(value = "/editarUsuario/despachante")
	public Boolean actualizarDespachante(@RequestBody Despachante d1) {
		return servicioUsu.actualizarDespachante(d1);
	}
	
	@PutMapping(value = "/editarUsuario/transportista")
	public Boolean actualizarTransportista(@RequestBody Transportista t1) {
		return servicioUsu.actualizarTransportista(t1);
	}
	
	@GetMapping("/buscarUsuario/{id}")
	public Usuario buscarUsuario(@PathVariable long id) {
		servicioUsu.buscarUsuario(id);
		return null;
	}	
	
	@RequestMapping(value="/listarUsuarios/{rol}", method=RequestMethod.GET)
	public List<Usuario> todosUsuarios(@PathVariable("rol") String rol){
		return servicioUsu.todosUsuarios(rol);
	}
			
	
	@DeleteMapping("/eliminarUsuario/{id}")
	public Boolean eliminarUsuario(@PathVariable("id") long id) {
		servicioUsu.eliminarUsuario(id);
		return true;
	}

}
