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

import py.edu.uc.lp3.constants.ApiPaths;
import tpf.lp3.interfaces.ServicioAlmacenamiento;
import tpf.lp3.servicios.Almacenamiento;

@RequestMapping(ApiPaths.ALMACENAMIENTO)
public class AlmacenamientoController {
	@Autowired
	private ServicioAlmacenamiento servicioAlmacenam;
	// ALMACENAMIENTO
	@RequestMapping(value="/listarAlmacenamiento", method=RequestMethod.GET)
	public List<Almacenamiento> todosTransporte(){
		return servicioAlmacenam.todosAlmacenamiento();
	}
	@RequestMapping(value="/buscarAlmacenamiento/{id}", method=RequestMethod.GET)
	public Almacenamiento buscarAlmacenamiento(@PathVariable("id") long id) {
		return servicioAlmacenam.buscarAlmacenamiento(id);
	}
	@PostMapping("/crearAlmacenamiento")
	public Boolean crearAlmacenamiento(@RequestBody Almacenamiento a1) {
		return servicioAlmacenam.crearAlmacenamiento(a1);
		
	}
	@PutMapping("/editarAlmacenamiento")
	public Boolean editarAlmacenamiento(@RequestBody Almacenamiento a1) {
		return servicioAlmacenam.editarAlmacenamiento(a1);
	}
		
	@DeleteMapping("/eliminarAlmacenamiento/{id}")
	public Boolean eliminarAlmacenamiento(@PathVariable("id") long id_almacenamiento) {
		return servicioAlmacenam.eliminarAlmacenamiento(id_almacenamiento);
	}
}
