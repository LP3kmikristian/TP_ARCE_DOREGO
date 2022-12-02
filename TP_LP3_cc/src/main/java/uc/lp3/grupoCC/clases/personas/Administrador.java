package uc.lp3.grupoCC.clases.personas;

import java.util.List;

import uc.lp3.grupoCC.clases.Impuesto;
import uc.lp3.grupoCC.clases.Producto;
import uc.lp3.grupoCC.clases.Usuario;
import uc.lp3.grupoCC.interfaces.ServicioUsuario;
import uc.lp3.grupoCC.interfaces.TipoImpuestos;


public abstract class Administrador extends Usuario implements ServicioUsuario, TipoImpuestos{
		/* Se encarga de manejar los tipos de impuestos y de crear usuarios de las agencias despachantes*/
	@Override
	public List<Impuesto> getImpuestos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean postImpuestos(Impuesto i1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean putImpuestos(Impuesto i1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteImpuestos(Impuesto i1) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean crearDespachante(Despachante d1) {
		// TODO Auto-generated method stub
		return null;
	}

}
