package uc.lp3.grupoCC.interfaces;

import java.util.List;

import uc.lp3.grupoCC.clases.Usuario;
import uc.lp3.grupoCC.clases.personas.Administrador;
import uc.lp3.grupoCC.clases.personas.Auditor;
import uc.lp3.grupoCC.clases.personas.Despachante;
import uc.lp3.grupoCC.clases.personas.Transportista;

public interface ServicioUsuario {
	
	Administrador crearAdministrador(Administrador a1);
	
	Auditor crearAuditor(Auditor a1);
	
	Despachante crearDespachante(Despachante d1);
	
	Transportista crearTransportista(Transportista t1);
	//@get -> devuelve una lista de todas las personas
	List<Usuario> getUsuarios();
	
	//@get -> devuelve una sola persona
	Usuario getPersonas(int ci);
	
	//@post -> crea una persona
	Usuario crearPersonas(Usuario p1);
	
	//@Put -> edita una persona
	Usuario editarPersonas(Usuario p1);
}
