package uc.lp3.grupoCC.interfaces;

import java.util.List;

public interface Productos {
	
	//@get -> devuelve la lista de los productos introducidos
	List<Productos> getProductos();
	
	//@post -> crea un nuevo producto
	Productos crearProductos(Productos p1);
	
	//@delete -> elimina un producto
	Productos eliminarProductos(Productos p1);

}
