package tpf.lp3.interfaces;

import java.util.ArrayList;
import java.util.List;

import tpf.lp3.clases.Presupuesto;

public interface ServicioPresupuesto {
	
	ArrayList<Presupuesto> listarPresupuesto();
	
	Presupuesto buscarPresupuesto(long id_presupuesto);
	
	Presupuesto crearPresupuesto(Presupuesto p1);
	
	//Boolean editarPresupuesto(Presupuesto p1);
	
	Boolean eliminarPresupuesto(long id_presupuesto);

}
