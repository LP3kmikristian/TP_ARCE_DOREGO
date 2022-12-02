package uc.lp3.grupoCC.clases.personas;


import java.util.List;

import uc.lp3.grupoCC.clases.Impuesto;
import uc.lp3.grupoCC.clases.Organizacion;
import uc.lp3.grupoCC.clases.Producto;
import uc.lp3.grupoCC.clases.Usuario;
import uc.lp3.grupoCC.clases.servicios.Almacenamiento;
import uc.lp3.grupoCC.clases.servicios.Transporte;
import uc.lp3.grupoCC.interfaces.ServicioOrganizaciones;
import uc.lp3.grupoCC.interfaces.ServicioPresupuesto;
import uc.lp3.grupoCC.interfaces.ServicioUsuario;
import uc.lp3.grupoCC.interfaces.TipoImpuestos;

public abstract class Auditor extends Usuario implements ServicioPresupuesto, ServicioOrganizaciones, ServicioUsuario, TipoImpuestos{
	
                        /* El auditor puede observar todos los datos en modo lectura */
	
	@Override
	public List<Impuesto> getImpuestos() { // lista de los impuestos
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getUsuarios() { // lista de usuarios
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUsuarios(int ci) { // lista de un usuario especifico
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Organizacion> getOrganizaciones() { // lista de todas las organizaciones
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Organizacion> getOrganizaciones(String tipo) { // lista de las organizaciones por tipo
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> getPresupuestos() { // lista de los presupuestos cargados
		// TODO Auto-generated method stub
		return null;
	}


}
