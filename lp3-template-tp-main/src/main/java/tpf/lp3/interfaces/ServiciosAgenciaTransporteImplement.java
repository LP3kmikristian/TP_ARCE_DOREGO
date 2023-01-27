package tpf.lp3.interfaces;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Servicio;
import tpf.lp3.repositorios.ServiciosRepositorio;
import tpf.lp3.servicios.Almacenamiento;
import tpf.lp3.servicios.Transporte;

/* IMPLEMENTACION DE LAS FUNCIONES DECLARADAS EN ServiciosAgenciaTransporte PARA EL USO DE LAS OPERACIONES DE CRUD*/

@Service
public class ServiciosAgenciaTransporteImplement implements ServiciosAgenciaTransporte{
	@Autowired
	private ServiciosRepositorio repoServicio; // repositorio de los servicio de la agencia de transporte
	
	/* FUNCIONES DE TRANSPORTES */
	
	@Override
	public Transporte crearTransporte(Transporte t1) {
		// guardamos el nuevo transporte en el repositorio
		return repoServicio.save(t1);
		
	}
	
	@Override
	public Transporte editarTransporte(Transporte t1) {
		// buscamos el transporte que se quiere actualizar en el repositorio
		Optional<Servicio> transporteActual= repoServicio.findById(t1.getId());
		// si existe entonces se actualiza y se retorna true
		if (!transporteActual.isEmpty()){
			return repoServicio.save(t1);
				
		}
		// si no se encuentra se retorna null
		else return null;
	}

	@Override
	public Boolean eliminarTransporte(Long id) {
		// buscamos el transporte por id en el repositorio y lo eliminamos
		repoServicio.deleteById(id);
		return true;
	}

	@Override
	public List<Servicio> todosTransporte() {
		// retornamos la lista de todos los transportes en el repositorio
		return repoServicio.findByTipo("tr");
	}
	
	@Override
	public Servicio buscarTransporte(Long id) {
		// retorna el transporte solicitado si se encuentra en el repositorio
		Optional<Servicio> t1= repoServicio.findById(id);
		if(!t1.isEmpty()) {
			return t1.get();
		}
		// si no se encuentra se retorna null
		return null;
	}
	// ALMACENAMIENTO
	@Override
	public Servicio crearAlmacenamiento(Almacenamiento a1) {
		// guardamos el nuevo almacenamiento en el repositorio
		return repoServicio.save(a1);
		
	}

	@Override
	public Servicio editarAlmacenamiento(Almacenamiento a1) {
		// buscamos el almacenamiento que se quiere actualizar en el repositorio
		Optional<Servicio> almacenamientoActual=repoServicio.findById(a1.getId());
		// si existe entonces se actualiza y se retorna 
		if(almacenamientoActual.isPresent()) {
			return repoServicio.save(a1);
			
		}
		// si no se encuentra se retorna null
		else return null;
	}

	@Override
	public Boolean eliminarAlmacenamiento(Long id) {
		// buscamos el almacenamiento por id en el repositorio y lo eliminamos
		Optional<Servicio> almacenamientoActual=repoServicio.findById(id);
		if(almacenamientoActual.isPresent()) {
			repoServicio.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Servicio> todosAlmacenamiento() {
		// retornamos la lista de todos las opciones de almacenamiento en el repositorio		
		return repoServicio.findByTipo("al");
	}

	@Override
	public Servicio buscarAlmacenamiento(Long id) {
		// retorna el almacenamiento solicitado si se encuentra en el repositorio
		Optional<Servicio> a1=repoServicio.findById(id);
		if(a1.isPresent()) {
			return a1.get();
		}
		// si no se encuentra se retorna null
		else return null;
	}
}
