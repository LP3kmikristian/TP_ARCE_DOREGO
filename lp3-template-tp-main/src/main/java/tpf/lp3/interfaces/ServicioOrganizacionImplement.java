package tpf.lp3.interfaces;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Organizacion;
import tpf.lp3.repositorios.OrganizacionRepositorio;
		/* IMPLEMENTACION DE LAS FUNCIONES DECLARADAS EN ServicioOrganizacion PARA EL USO DE LAS OPERACIONES DE CRUD*/
//se marca como @Servicio para que se reconozca en el escaneo
@Service
public class ServicioOrganizacionImplement implements ServicioOrganizacion{
	@Autowired
	private OrganizacionRepositorio repoOrganizacion; // repositorio de organizacion
	
	@Override
	public List<Organizacion> listarOrganizacion() {
		// retornamos la lista de todos las organizaciones en el repositorio
		List<Organizacion> todasOrganizaciones = repoOrganizacion.findAll();
		return todasOrganizaciones;
	}

	@Override
	public List<Organizacion> buscarOrganizacionPorTipo(String tipo) {
		// retornamos la lista de todos las organizaciones en el repositorio del tipo solicitado
		return repoOrganizacion.findByTipo(tipo);
	}

	@Override
	public Organizacion crearOrganizacion(Organizacion o1) {
		// guardamos la nueva organizacion en el repositorio
		return repoOrganizacion.save(o1);
		
	}

	@Override
	public Organizacion editarOrganizacion(Organizacion o1) {
		// buscamos la organizacion que se quiere editar
		Optional<Organizacion> organizacionActual= repoOrganizacion.findById(o1.getId());
		// si existe entonces se actualiza y se retorna true
		if (organizacionActual.isPresent()){
			return repoOrganizacion.save(o1);
				
		}
		else return null;
	}

	@Override
	public Boolean eliminarOrganizacion(Long id_organizacion) {
		// buscamos la organizacion por id
		Optional<Organizacion> buscarOrganizacion= repoOrganizacion.findById(id_organizacion);
		// si existe entonces se elimina y se retorna true si no se retorna false
		if(buscarOrganizacion.isPresent()) {
			repoOrganizacion.deleteById(id_organizacion);
			return true;
		}
		else return false;
	}


}
