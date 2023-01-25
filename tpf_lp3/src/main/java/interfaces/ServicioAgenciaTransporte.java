package interfaces;

import java.util.List;

import servicios.Almacenamiento;
import servicios.Transporte;


public interface ServicioAgenciaTransporte {
	// Todos las operaciones de transporte
	Transporte crearTransporte(Transporte t1);
	Boolean editarTransporte(Transporte t1);
	Boolean eliminarTRansporte(String chapa_transporte);
	List<Transporte> todosTransporte();
	Transporte buscarTransporte(String chapa_transporte);
	// Todas las operaciones de Almacenamiento
	Almacenamiento crearAlmacenamiento(Almacenamiento a1);
	Boolean editarAlmacenamieto(Almacenamiento a1);
	Boolean eliminarAlmacenamiento(long id_almacenamiento);
	List<Almacenamiento> todosAlmacenamiento();
	Almacenamiento buscarAlmacenamiento(long id_almacenamiento);
	
}
