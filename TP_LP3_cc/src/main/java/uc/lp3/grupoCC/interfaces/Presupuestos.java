package uc.lp3.grupoCC.interfaces;

import java.util.List;

public interface Presupuestos {
	//@get -> devuelve la lista del pedido de productos
	List<Productos> getPresupuestos();
			
	//@post -> crea un nuevo producto
	Presupuestos crearPresupuestos(List<Productos> p1, String nombre_presupuesto);
			
	//@delete -> elimina un producto
	Presupuestos eliminarPresupuestos(String nombre_presupuesto);
			
			
	//@get -> devuelve el presupuesto total de un pedido
	Double definirPresupuestos(List<Productos> p1, Almacenamiento a1, Transporte t1, Impuestos i1);
			
}
