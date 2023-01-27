package tpf.lp3.interfaces;

import java.util.ArrayList;

import tpf.lp3.clases.Pedido;
import tpf.lp3.clases.Presupuesto;

public interface ServicioPresupuesto {
	
	ArrayList<Presupuesto> listarPresupuesto();
	
	Presupuesto buscarPresupuesto(long id_presupuesto);
	
	Presupuesto crearPresupuesto(Pedido p1);
	
	//Boolean editarPresupuesto(Presupuesto p1);
	
	Boolean eliminarPresupuesto(long id_presupuesto);

}
