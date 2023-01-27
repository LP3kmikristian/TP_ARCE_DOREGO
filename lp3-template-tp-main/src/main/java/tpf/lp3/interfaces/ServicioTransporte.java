package tpf.lp3.interfaces;


import java.util.List;

import tpf.lp3.servicios.Transporte;


public interface ServicioTransporte {
	// Todos las operaciones de transporte
	Transporte crearTransporte(Transporte t1);
	Boolean editarTransporte(Transporte t1);
	Boolean eliminarTransporte(Long id);
	List<Transporte> todosTransporte();
	Transporte buscarTransporte(Long id);
	
}
