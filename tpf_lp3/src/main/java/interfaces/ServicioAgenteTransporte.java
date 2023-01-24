package interfaces;

import java.util.List;

import servicios.Almacenamiento;
import servicios.Transporte;

public interface ServicioAgenteTransporte {
	// Todos las operaciones de transporte
	Transporte crearTransporte(Transporte t1);
	Transporte editarTransporte(Transporte t1);
	Transporte eliminarTRansporte(String chapa_transporte);
	List<Transporte> todosTransporte();
	// Todas las operaciones de Almacenamiento
	Almacenamiento crearAlmacenamiento(Almacenamiento a1);
	Almacenamiento editarAlmacenamieto(Almacenamiento a1);
	Almacenamiento eliminarAlmacenamiento(long id_almacenamiento);
	List<Almacenamiento> buscarAlmacenamiento();
}
