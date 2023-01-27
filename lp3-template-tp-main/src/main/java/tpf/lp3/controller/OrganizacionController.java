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
		try {
		return servicioOrg.listarOrganizacion();}
		catch(Exception e) {
			System.out.println("listarOrganizacion: Error al realizar operacion \n");
			return null;
			}
	}
	
	@RequestMapping(value="/buscarOrganizacion/{tipo}", method=RequestMethod.GET)
	public List<Organizacion> buscarOrganizacion(@PathVariable("tipo") String tipo) {
		try {
		return servicioOrg.buscarOrganizacionPorTipo(tipo);}
		catch(Exception e) {
			System.out.println("buscarOrganizacion: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PostMapping("/crearOrganizacion")
	public Boolean crearOrganizacion(@RequestBody Organizacion o1) {
		try {
		servicioOrg.crearOrganizacion(o1);
		return true;}
		catch(Exception e) {
			System.out.println("crearOrganizacion: Error al realizar operacion \n");
			return false;
			}
	}
	
	@PutMapping("/editarOrganizacion")
	public Boolean actualizarOrganizacion(@RequestBody Organizacion o1) {
		try {
		servicioOrg.editarOrganizacion(o1);
		return true;}
		catch(Exception e) {
			System.out.println("editarOrganizacion: Error al realizar operacion \n");
			return null;
			}
	}
	
	@DeleteMapping("/eliminarOrganizacion/{id}")
	public void eliminarOrganizacion(@PathVariable("id") Long id) {
		try {
		servicioOrg.eliminarOrganizacion(id);}
		catch(Exception e) {
			System.out.println("eliminarOrganizacion: Error al realizar operacion \n");
			}
	}

}
