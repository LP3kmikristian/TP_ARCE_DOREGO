package tpf.lp3.interfaces;

import java.util.List;

import tpf.lp3.clases.Organizacion;

public interface ServicioOrganizacion {
	List<Organizacion> listarOrganizacion();
	
	//@get -> devuelve una lista de todas las Organizaciones de tipo "tipo"
	List<Organizacion> buscarOrganizacionPorTipo(String tipo);
	
	//@post -> crear una organizacion
	Boolean crearOrganizacion(Organizacion o1);
	
	//@put -> editar una organizacion: se devuelve verdadero o falso
	Boolean editarOrganizacion(Organizacion o1); 
	
	//@delete -> eliminar una organizacion
	Boolean eliminarOrganizacion(Long id_organizacion);
	
	
}
