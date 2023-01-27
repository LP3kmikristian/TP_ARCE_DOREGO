package tpf.lp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.constants.ApiPaths;
import tpf.lp3.clases.Organizacion;
import tpf.lp3.interfaces.ServicioOrganizacion;

@RestController
@RequestMapping(ApiPaths.ORGANIZACION)
public class OrganizacionController {
	@Autowired
	private ServicioOrganizacion servicioOrg;
	
	@RequestMapping(value="/listarOrganizacion", method=RequestMethod.GET)
	public List<Organizacion> listarOrganizacion() {
		return servicioOrg.listarOrganizacion();
	}
	
	@RequestMapping(value="/buscarOrganizacion/{tipo}", method=RequestMethod.GET)
	public List<Organizacion> buscarOrganizacion(@PathVariable("tipo") String tipo) {
		return servicioOrg.buscarOrganizacionPorTipo(tipo);
	}
	
	@PostMapping("/crearOrganizacion")
	public Boolean crearOrganizacion(@RequestBody Organizacion o1) {
		servicioOrg.crearOrganizacion(o1);
		return true;
	}
	
	@PutMapping("/editarOrganizacion")
	public Boolean actualizarOrganizacion(@RequestBody Organizacion o1) {
		servicioOrg.editarOrganizacion(o1);
		return true;
	}
	
	@DeleteMapping("/eliminarOrganizacion/{id}")
	public void eliminarOrganizacion(@PathVariable("id") Long id) {
		servicioOrg.eliminarOrganizacion(id);
	}

}
