package uc.lp3.grupoCC.clases.personas;

import uc.lp3.grupoCC.clases.Ubicacion;
import uc.lp3.grupoCC.clases.Usuario;
import uc.lp3.grupoCC.interfaces.ServicioTransportista;

public abstract class Transportista extends Usuario implements ServicioTransportista{
	
	/* El transportista informa su ubicacion */
	
	@Override
	public Ubicacion postUbicacion(Ubicacion u1) { 
		return null;
	}
}
