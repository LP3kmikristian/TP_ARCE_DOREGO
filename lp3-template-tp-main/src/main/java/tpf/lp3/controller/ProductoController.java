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
import tpf.lp3.clases.Producto;
import tpf.lp3.interfaces.ServicioProductos;

@RestController
@RequestMapping(ApiPaths.PRODUCTO)
public class ProductoController {
	@Autowired
	private ServicioProductos servicioProduct;
	
	@RequestMapping(value="/listarProductos", method=RequestMethod.GET)
	public List<Producto> listarProducto(){
		return servicioProduct.listarProductos();
	}
	
	@RequestMapping(value="/buscarProducto/{id}", method=RequestMethod.GET)
	public Producto buscarProducto(@PathVariable("id") Long id) {
		return servicioProduct.buscarProducto(id);
	}
	@PostMapping("/crearProducto")
	public Producto crearProducto(@RequestBody Producto t1) {
		servicioProduct.crearProducto(t1);
		return t1;
	}
	
	@PutMapping("/editarProducto")
	public Producto editarTransporte(@RequestBody Producto t1) {
		return servicioProduct.editarProducto(t1);
		
	}
	
	@DeleteMapping("/eliminarProducto/{id}")
	public Boolean eliminarProducto(@PathVariable("id") Long id) {
		servicioProduct.eliminarProducto(id);
		return true;
	}

}
