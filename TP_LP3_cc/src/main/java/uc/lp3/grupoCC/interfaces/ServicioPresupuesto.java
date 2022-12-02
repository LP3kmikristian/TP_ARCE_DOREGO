package uc.lp3.grupoCC.interfaces;

import java.util.List;

import uc.lp3.grupoCC.clases.Impuesto;
import uc.lp3.grupoCC.clases.Producto;
import uc.lp3.grupoCC.clases.servicios.Almacenamiento;
import uc.lp3.grupoCC.clases.servicios.Transporte;

public interface ServicioPresupuesto {
		//@get -> devuelve la lista del pedido de productos
		List<Producto> getPresupuestos();
				
		//@post -> crea un nuevo producto
		Double crearPresupuestos(List<Producto> l1, String nombre_presupuesto);
				
		//@delete -> elimina un producto
		Boolean eliminarPresupuestos(String nombre_presupuesto);
						
		//@get -> devuelve el presupuesto total de un pedido
		Double definirPresupuestos(Producto p1, Almacenamiento a1, Transporte t1, Impuesto i1);
}
