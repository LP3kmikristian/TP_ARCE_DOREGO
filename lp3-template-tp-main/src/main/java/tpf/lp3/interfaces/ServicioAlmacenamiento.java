package tpf.lp3.interfaces;

import java.util.ArrayList;

import tpf.lp3.servicios.Almacenamiento;

public interface ServicioAlmacenamiento {
	// Todas las operaciones de Almacenamiento
		Boolean crearAlmacenamiento(Almacenamiento a1);
		Boolean editarAlmacenamiento(Almacenamiento a1);
		Boolean eliminarAlmacenamiento(Long id_almacenamiento);
		ArrayList<Almacenamiento> todosAlmacenamiento();
		Almacenamiento buscarAlmacenamiento(Long id_almacenamiento);
}
