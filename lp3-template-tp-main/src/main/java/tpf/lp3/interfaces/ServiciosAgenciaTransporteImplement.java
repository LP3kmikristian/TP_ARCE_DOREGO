package tpf.lp3.interfaces;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Servicio;
import tpf.lp3.repositorios.ServiciosRepositorio;
import tpf.lp3.servicios.Almacenamiento;
import tpf.lp3.servicios.Transporte;
@Service
public class ServiciosAgenciaTransporteImplement implements ServiciosAgenciaTransporte{
	@Autowired
	private ServiciosRepositorio repoServicio;
	
	@Override
	public Transporte crearTransporte(Transporte t1) {
		return repoServicio.save(t1);
		
	}
	
	@Override
	public Transporte editarTransporte(Transporte t1) {
		Optional<Servicio> transporteActual= repoServicio.findById(t1.getId());
		// si existe entonces se actualiza y se retorna true
		if (!transporteActual.isEmpty()){
			return repoServicio.save(t1);
				
		}
		else return null;
	}

	@Override
	public Boolean eliminarTransporte(Long id) {
		repoServicio.deleteById(id);
		return true;
	}

	@Override
	public List<Servicio> todosTransporte() {
		return repoServicio.findByTipo("tr");
	}
	
	@Override
	public Servicio buscarTransporte(Long id) {
		Optional<Servicio> t1= repoServicio.findById(id);
		if(!t1.isEmpty()) {
			return t1.get();
		}
		System.out.println("No se encontro el transporte");
		return null;
	}
	// ALMACENAMIENTO
	@Override
	public Servicio crearAlmacenamiento(Almacenamiento a1) {
		return repoServicio.save(a1);
		
	}

	@Override
	public Servicio editarAlmacenamiento(Almacenamiento a1) {
		Optional<Servicio> almacenamientoActual=repoServicio.findById(a1.getId());
		if(almacenamientoActual.isPresent()) {
			return repoServicio.save(a1);
			
		}
		else return null;
	}

	@Override
	public Boolean eliminarAlmacenamiento(Long id) {
		Optional<Servicio> almacenamientoActual=repoServicio.findById(id);
		if(almacenamientoActual.isPresent()) {
			repoServicio.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Servicio> todosAlmacenamiento() {
				
		return repoServicio.findByTipo("al");
	}

	@Override
	public Servicio buscarAlmacenamiento(Long id) {
		Optional<Servicio> a1=repoServicio.findById(id);
		if(a1.isPresent()) {
			return a1.get();
		}
		else return null;
	}
}
