package controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import clases.Organizacion;
import interfaces.ServicioOrganizacion;

@RestController
public class OrganizacionController {
	@Autowired
	private ServicioOrganizacion servicioOrg;
	
	@GetMapping("/buscarOrganizacion")
	public List<Organizacion> buscarOrganizacion(HttpServletResponse httpResponse) throws Exception {
		httpResponse.sendRedirect("/organizacion");
		return null;
	}
	
	@GetMapping("/buscarOrganizaciones/{tipo}")
	public List<Organizacion> buscarOrganizacion(@PathVariable String tipo) {
		return servicioOrg.buscarOrganizacionPorTipo(tipo);
	}
	
	@PutMapping(
			value = "/crearOrganizacion",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean crearOrganizacion(@RequestBody Organizacion o1) {
		servicioOrg.crearOrganizacion(o1);
		return true;
	}
	
	@PutMapping(
			value = "/actualizarOrganizacion",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean actualizarOrganizacion(@RequestBody Organizacion o1) {
		servicioOrg.editarOrganizacion(o1);
		return true;
	}
	
	@DeleteMapping("/eliminarOrganizacion/{id}")
	public void eliminarOrganizacion(@PathVariable Long id_organizacion) {
		servicioOrg.eliminarOrganizacion(id_organizacion);
	}
	
	@PostMapping("/agregarUsuario")
	public Boolean agregarUsuario(@RequestBody Map<String, String> json) {
		servicioOrg.agregarUsuario(Long.parseLong(json.get("idUsuario")), Long.parseLong(json.get("idOrg")));
		return true;
	}

}
