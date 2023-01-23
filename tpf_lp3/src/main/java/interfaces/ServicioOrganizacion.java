package interfaces;

import java.util.List;

import clases.Organizacion;

public interface ServicioOrganizacion {
	List<Organizacion> buscarOrganizaciones();
	
	//@get -> devuelve una lista de todas las Organizaciones de tipo "tipo"
	List<Organizacion> buscarOrganizaciones(String tipo);
	
	//@post -> crear una organizacion
	Boolean crearOrganizaciones(Organizacion o1);
	
	//@put -> editar una organizacion: se devuelven los datos de la
	Boolean editarOrganizaciones(Organizacion o1); 
	
	//@delete -> eliminar una organizacion
	Boolean eliminarOrganizaciones(long id_organizacion);
}
