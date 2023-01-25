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

import clases.Impuesto;
import interfaces.ServicioImpuesto;


@RestController
public class ImpuestoController {
	@Autowired
	private ServicioImpuesto servicioImp;
	
	@GetMapping("/listarImpuesto")
	public List<Impuesto> listarImpuesto(HttpServletResponse httpResponse) throws Exception {
		httpResponse.sendRedirect("/impuesto");
		return null;
	}
	
	@GetMapping("/buscarImpuesto/{tipo}")
	public Impuesto buscarImpuesto(@PathVariable long i1) {
		return servicioImp.buscarImpuesto(i1);
	}
	
	@PutMapping(
			value = "/crearImpuesto",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean crearImpuesto(@RequestBody Impuesto i1) {
		servicioImp.crearImpuesto(i1);
		return true;
	}
	
	@PutMapping(
			value = "/editatImpuesto",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean editarImpuesto(@RequestBody Impuesto i1) {
		servicioImp.editarImpuesto(i1);
		return true;
	}
	
	@DeleteMapping("/eliminarImpuesto/{id}")
	public void eliminarImpuesto(@PathVariable Long id_Impuesto) {
		servicioImp.eliminarImpuesto(id_Impuesto);
	}
	

}