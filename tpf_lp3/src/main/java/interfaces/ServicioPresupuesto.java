package interfaces;

import java.util.List;

import clases.Producto;


public interface ServicioPresupuesto {
	//@get -> devuelve la lista del pedido de productos
			List<Producto> getPresupuestos();
					
			//@post -> crea un nuevo producto
			Double crearPresupuestos(List<Producto> l1, String nombre_presupuesto);
					
			//@delete -> elimina un producto
			Boolean eliminarPresupuestos(String nombre_presupuesto);

}
