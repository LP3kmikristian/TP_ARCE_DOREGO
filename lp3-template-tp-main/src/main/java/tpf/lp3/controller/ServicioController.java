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
import tpf.lp3.clases.Servicio;
import tpf.lp3.interfaces.ServiciosAgenciaTransporte;
import tpf.lp3.servicios.Almacenamiento;
import tpf.lp3.servicios.Transporte;

@RestController
@RequestMapping(ApiPaths.SERVICIO)
public class ServicioController {
	// TRANSPORTE
	@Autowired
	private ServiciosAgenciaTransporte serviciosAgenTransport;
	
	@RequestMapping(value="/listarTransporte", method=RequestMethod.GET)
	public List<Servicio> todosTransporte(){
		return serviciosAgenTransport.todosTransporte();
	}
	
	@RequestMapping(value="/buscarTransporte/{id}", method=RequestMethod.GET)
	public Servicio buscarTransporte(@PathVariable("id") Long id) {
		return serviciosAgenTransport.buscarTransporte(id);
	}
	@PostMapping("/crearTransporte")
	public Servicio crearTransporte(@RequestBody Transporte t1) {
		serviciosAgenTransport.crearTransporte(t1);
		return t1;
	}
	
	@PutMapping("/editarTransporte")
	public Servicio editarTransporte(@RequestBody Transporte t1) {
		return serviciosAgenTransport.editarTransporte(t1);
		
	}
	
	@DeleteMapping("/eliminarTransporte/{id}")
	public Boolean eliminarTransporte(@PathVariable("id") Long id) {
		serviciosAgenTransport.eliminarTransporte(id);
		return true;
	}
	
	//**** ALMACENAMIENTO ****///
	@RequestMapping(value="/listarAlmacenamiento", method=RequestMethod.GET)
	public List<Servicio> todosAlmacenamiento(){
		return serviciosAgenTransport.todosAlmacenamiento();
	}
	@RequestMapping(value="/buscarAlmacenamiento/{id}", method=RequestMethod.GET)
	public Servicio buscarAlmacenamiento(@PathVariable("id") long id) {
		return serviciosAgenTransport.buscarAlmacenamiento(id);
	}
	@PostMapping("/crearAlmacenamiento")
	public Servicio crearAlmacenamiento(@RequestBody Almacenamiento a1) {
		return serviciosAgenTransport.crearAlmacenamiento(a1);
		
	}
	@PutMapping("/editarAlmacenamiento")
	public Servicio editarAlmacenamiento(@RequestBody Almacenamiento a1) {
		return serviciosAgenTransport.editarAlmacenamiento(a1);
	}
		
	@DeleteMapping("/eliminarAlmacenamiento/{id}")
	public Boolean eliminarAlmacenamiento(@PathVariable("id") long id_almacenamiento) {
		return serviciosAgenTransport.eliminarAlmacenamiento(id_almacenamiento);
	}

}
