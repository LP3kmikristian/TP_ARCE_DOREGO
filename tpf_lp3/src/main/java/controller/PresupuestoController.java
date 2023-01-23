package controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import clases.Presupuesto;
import interfaces.ServicioPresupuesto;
@RestController
public class PresupuestoController {
	
	@Autowired
	private ServicioPresupuesto servicioPresu;
	
	@GetMapping("/listarPresupuestos")
	public List<Presupuesto> listarPresupuestos(HttpServletResponse httpResponse) throws Exception {
		httpResponse.sendRedirect("/presupuesto");
		return null;
	}
	
	@PutMapping(
			value = "/crearPresupuesto",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean crearPresupuesto(@RequestBody Presupuesto p1) {
		servicioPresu.crearPresupuesto(p1);
		return true;
	}
	
	@PutMapping(
			value = "/editarPresupuesto",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Boolean editarPresupuesto(@RequestBody Presupuesto p1) {
		servicioPresu.editarPresupuesto(p1);
		return true;
	}

	@DeleteMapping("/eliminarPresupuesto/{id}")
	public Boolean eliminarPresupuesto(@PathVariable long id_presupuesto) {
		servicioPresu.eliminarPresupuesto(id_presupuesto);
		return true;
	}

}
