package tpf.lp3.interfaces;

import java.util.List;

import tpf.lp3.clases.Producto;

public interface ServicioProductos {
	List<Producto> listarProductos();
	
	Producto buscarProducto(Long id);
			
	Producto crearProducto(Producto produ);
			
	Producto editarProducto(Producto produ); 
			
	Boolean eliminarProducto(Long id);

}
