package interfaces;

import java.util.List;

import clases.Presupuesto;


public interface ServicioPresupuesto {
	//@get -> devuelve la lista del pedido de productos
	List<Presupuesto> getPresupuestos();
					
	//@post -> crea un nuevo producto
	Boolean crearPresupuestos(Presupuesto p1);
	
	//@put
	Boolean actualizarPresupuesto(Presupuesto p1);
	
	//@delete -> elimina un producto
	Boolean eliminarPresupuestos(long id_presupuesto);

}
