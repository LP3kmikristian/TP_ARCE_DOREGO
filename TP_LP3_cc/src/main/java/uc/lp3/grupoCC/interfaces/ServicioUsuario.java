package uc.lp3.grupoCC.interfaces;

import java.util.List;

import uc.lp3.grupoCC.clases.Usuario;
import uc.lp3.grupoCC.clases.personas.Administrador;
import uc.lp3.grupoCC.clases.personas.Auditor;
import uc.lp3.grupoCC.clases.personas.Despachante;
import uc.lp3.grupoCC.clases.personas.Transportista;

public interface ServicioUsuario {
	
	//@get -> devuelve una lista de todas las usuarios
	List<Usuario> getUsuarios(); // sistema/usuarios
	
	//@get -> devuelve una sola usuario
	Usuario getUsuarios(int ci); // sistema/usuarios
	
	//@post -> crea una usuario
	Boolean crearUsuario(Usuario p1); // sistema/usuarios
	
	//@Put -> edita una usuario
	Boolean editarUsuario(Usuario p1); // sistema/usuarios
	
	//@Delete -> elimina un usuario 
	Boolean eliminarUsuario(int ci); // sistema/usuarios
	
	
	Boolean crearAdministrador(Administrador a1);
	
	Boolean crearAuditor(Auditor a1);
	
	Boolean crearDespachante(Despachante d1);
	
	Boolean crearTransportista(Transportista t1);
}
