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
import tpf.lp3.clases.Impuesto;
import tpf.lp3.interfaces.ServicioImpuesto;

@RestController
@RequestMapping(ApiPaths.IMPUESTO)
public class ImpuestoController {
	@Autowired
	private ServicioImpuesto servicioImp;
	
	@RequestMapping(value="/listarImpuestos", method=RequestMethod.GET)
	public List<Impuesto> listarImpuesto() {
		try {
		return servicioImp.listarImpuesto();}
		catch(Exception e) {
			System.out.println("listarImpuesto: Error al realizar operacion \n");
			return null;
			}
	}
	
	@RequestMapping(value="/buscarImpuesto/{id}", method=RequestMethod.GET)
	public Impuesto buscarImpuesto(@PathVariable("id") Long id) {
		try {
		return servicioImp.buscarImpuesto(id);}
		catch(Exception e) {
			System.out.println("buscarImpuesto: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PostMapping("/crearImpuesto")
	public Boolean crearImpuesto(@RequestBody Impuesto i1) {
		try {
		return servicioImp.crearImpuesto(i1);}
		catch(Exception e) {
			System.out.println("crearImpuesto: Error al realizar operacion \n");
			return null;
			}
	}
	
	@PutMapping("/editarImpuesto")
	public Boolean editarImpuesto(@RequestBody Impuesto i1) {
		try {
		return servicioImp.editarImpuesto(i1);}
		catch(Exception e) {
			System.out.println("editarImpuesto: Error al realizar operacion \n");
			return null;
			}
	}
	
	@DeleteMapping("/eliminarImpuesto/{id}")
	public Boolean eliminarImpuesto(@PathVariable("id") Long id) {
		try {
		return servicioImp.eliminarImpuesto(id);}
		catch(Exception e) {
			System.out.println("eliminarrImpuesto: Error al realizar operacion \n");
			return null;
			}
	}
	

}
