package uc.lp3.grupoCC.interfaces;

import java.util.List;

public interface  Organizaciones{
	
	//@get -> devuelve una lista con todas las Organizaciones
	List<Organizaciones> getOrganizaciones();
	
	//@get -> devuelve una lista de todas las Organizaciones de tipo "tipo"
	List<Organizaciones> getOrganizaciones(String tipo);
	
	//@post -> crear una organizacion
	Organizaciones crearOrganizaciones(List<Personas> g1, String nombre_organizaciones);
	
	//@put -> editar una organizacion
	Organizaciones editarOrganizaciones(String nombre_organizacion);
	
	//@delete -> eliminar una organizacion
	Organizaciones eliminarOrganizaciones(String nombre_organizacion);
}

