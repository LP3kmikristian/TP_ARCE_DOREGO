package uc.lp3.grupoCC.interfaces;

import java.util.List;

public interface Servicios {
	
	//@get -> devuelve una lista con todos los servicios
	List<Servicios> getServicios();
	
	//@get -> devuelve una lista de todos los servicios de tipo "tipo"
	List<Servicios> getServicios(String tipo);
	
	//@post -> crear un servicio
	Servicios crearServicios(Servicios s1);
	
	//@put -> editar un servicio
	Servicios editarServicios(Servicios s1);
	
	//@delete -> eliminar un servicio
	Servicios eliminarServicios(Servicios s1);
}
