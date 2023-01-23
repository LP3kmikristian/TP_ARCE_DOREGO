package interfaces;

import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import clases.Organizacion;

public interface ServicioOrganizacion {
	List<Organizacion> getOrganizaciones();
	
	//@get -> devuelve una lista de todas las Organizaciones de tipo "tipo"
	List<Organizacion> getOrganizaciones(String tipo);
	
	//@post -> crear una organizacion
	Organizacion crearOrganizaciones(Organizacion o1);
	
	//@put -> editar una organizacion: se devuelven los datos de la
	Organizacion editarOrganizaciones(Organizacion o1); 
	
	//@delete -> eliminar una organizacion
	Boolean eliminarOrganizaciones(int id_organizacion);
}
