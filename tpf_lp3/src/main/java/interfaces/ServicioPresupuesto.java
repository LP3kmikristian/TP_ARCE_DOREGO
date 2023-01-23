package interfaces;

import java.util.List;

import clases.Presupuesto;


public interface ServicioPresupuesto {
	//@get -> devuelve la lista del pedido de productos
	List<Presupuesto> listarPresupuestos();
					
	//@post -> crea un nuevo producto
	Boolean crearPresupuesto(Presupuesto p1);
	
	//@put
	Boolean editarPresupuesto(Presupuesto p1);
	
	//@delete -> elimina un producto
	Boolean eliminarPresupuesto(long id_presupuesto);

}
