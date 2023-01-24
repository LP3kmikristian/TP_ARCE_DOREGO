package interfaces;

import java.util.List;

import clases.Presupuesto;


public interface ServicioPresupuesto {
	
	List<Presupuesto> listarPresupuesto();
	
	Presupuesto buscarPresupuesto(long id_presupuesto);
	
	Boolean crearPresupuesto(Presupuesto p1);
	
	Boolean editarPresupuesto(Presupuesto p1);
	
	Boolean eliminarPresupuesto(long id_presupuesto);

}
