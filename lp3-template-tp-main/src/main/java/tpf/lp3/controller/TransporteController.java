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

import tpf.lp3.interfaces.ServicioTransporte;
import tpf.lp3.servicios.Transporte;

@RestController
@RequestMapping(ApiPaths.TRANSPORTE)
public class TransporteController {
	@Autowired
	private ServicioTransporte servicioTransport;
	
	
	@RequestMapping(value="/listarTransporte", method=RequestMethod.GET)
	public List<Transporte> todosTransporte(){
		try {
		return servicioTransport.todosTransporte();}
		catch(Exception e) {
			System.out.println("listarPresupuesto: Error al realizar operacion \n");
			return null;
			}
	}
	
	@RequestMapping(value="/buscarTransporte/{id}", method=RequestMethod.GET)
	public Transporte buscarTransporte(@PathVariable("id") Long id) {
		try {
		return servicioTransport.buscarTransporte(id);}
		catch(Exception e) {
			System.out.println("buscarTransporte: Error al realizar operacion \n");
			return null;
			}
	}
	@PostMapping("/crearTransporte")
	public Transporte crearTransporte(@RequestBody Transporte t1) {
		try {
		servicioTransport.crearTransporte(t1);
		return t1;}
		catch(Exception e) {
			System.out.println("crearTransporte: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PutMapping("/editarTransporte")
	public Boolean editarTransporte(@RequestBody Transporte t1) {
		try {
		servicioTransport.editarTransporte(t1);
		return true;}
		catch(Exception e) {
			System.out.println("editarTransporte: Error al realizar operacion \n");
			return null;
			}
	}
	
	@DeleteMapping("/eliminarTransporte/{id}")
	public Boolean eliminarTransporte(@PathVariable("id") Long id) {
		try {
		servicioTransport.eliminarTransporte(id);
		return true;}
		catch(Exception e) {
			System.out.println("eliminarTransporte: Error al realizar operacion \n");
			return null;
			}
	}
	
}
