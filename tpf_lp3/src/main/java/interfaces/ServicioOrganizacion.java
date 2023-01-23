package interfaces;

import java.util.List;

import clases.Organizacion;
import clases.Usuario;

public interface ServicioOrganizacion {
	List<Organizacion> buscarOrganizacion();
	
	//@get -> devuelve una lista de todas las Organizaciones de tipo "tipo"
	List<Organizacion> buscarOrganizacionPorTipo(String tipo);
	
	//@post -> crear una organizacion
	Boolean crearOrganizacion(Organizacion o1);
	
	//@put -> editar una organizacion: se devuelve verdadero o falso
	Boolean editarOrganizacion(Organizacion o1); 
	
	//@delete -> eliminar una organizacion
	Boolean eliminarOrganizacion(Long id_organizacion);
	
	//@put -> se agrega un usuario a la organizacion
	Boolean agregarUsuario(Long id_usuario, Long id_organizacion);
	
	
}
