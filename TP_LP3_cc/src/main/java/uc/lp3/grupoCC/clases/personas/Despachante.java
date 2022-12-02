package uc.lp3.grupoCC.clases.personas;

import java.util.List;

import uc.lp3.grupoCC.clases.Impuesto;
import uc.lp3.grupoCC.clases.Producto;
import uc.lp3.grupoCC.clases.Usuario;
import uc.lp3.grupoCC.clases.servicios.Almacenamiento;
import uc.lp3.grupoCC.clases.servicios.Transporte;
import uc.lp3.grupoCC.interfaces.ServicioPresupuesto;

public abstract class Despachante extends Usuario implements ServicioPresupuesto{

	@Override
	public Double crearPresupuestos(List<Producto> p1, String nombre_presupuesto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double definirPresupuestos(ServicioPresupuesto p1, Almacenamiento a1, Transporte t1, Impuesto i1) {
		// TODO Auto-generated method stub
		return null;
	}

}
