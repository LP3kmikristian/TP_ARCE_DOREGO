package uc.lp3.grupoCC.interfaces;

import java.util.List;

import uc.lp3.grupoCC.clases.Organizacion;

public interface ServicioOrganizaciones {
	//@get -> devuelve una lista con todas las Organizaciones
		List<Organizacion> getOrganizaciones();
		
		//@get -> devuelve una lista de todas las Organizaciones de tipo "tipo"
		List<Organizacion> getOrganizaciones(String tipo);
		
		//@post -> crear una organizacion
		Organizacion crearOrganizaciones(Organizacion o1);
		
		//@put -> editar una organizacion
		Boolean editarOrganizaciones(int id_organizacion);
		
		//@delete -> eliminar una organizacion
		Boolean eliminarOrganizaciones(int id_organizacion);
}
