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
		try {
		return servicioAlmacenam.todosAlmacenamiento();}
		catch(Exception e){
			System.out.println("listarAlmacenamiento: Error al realizar operacion \n");
			return null;
		}
	}
	@RequestMapping(value="/buscarAlmacenamiento/{id}", method=RequestMethod.GET)
	public Almacenamiento buscarAlmacenamiento(@PathVariable("id") long id) {
		try {
		return servicioAlmacenam.buscarAlmacenamiento(id);}
	catch(Exception e) {
		System.out.println("buscarAlmacenamiento: Error al realizar operacion \n");
		return null;
		}
	}
	@PostMapping("/crearAlmacenamiento")
	public Boolean crearAlmacenamiento(@RequestBody Almacenamiento a1) {
		try {
		servicioAlmacenam.crearAlmacenamiento(a1);
		return true;}
		catch(Exception e) {
			System.out.println("crearAlmacenamiento: Error al realizar operacion \n");
			return null;
		}
		
	}
	@PutMapping("/editarAlmacenamiento")
	public Boolean editarAlmacenamiento(@RequestBody Almacenamiento a1) {
		try {
		return servicioAlmacenam.editarAlmacenamiento(a1);}
		catch(Exception e) {
			System.out.println("editarAlmacenamiento: Error al realizar operacion \n");
			return null;
		}
	}
		
	@DeleteMapping("/eliminarAlmacenamiento/{id}")
	public Boolean eliminarAlmacenamiento(@PathVariable("id") long id_almacenamiento) {
		try {
		return servicioAlmacenam.eliminarAlmacenamiento(id_almacenamiento);
		}
		catch(Exception e) {
			System.out.println("eliminarAlmacenamiento: Error al realizar operacion \n");
			return null;
		}
	}
}
