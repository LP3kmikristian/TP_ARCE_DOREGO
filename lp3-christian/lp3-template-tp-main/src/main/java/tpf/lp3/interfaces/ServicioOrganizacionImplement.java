package tpf.lp3.interfaces;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Organizacion;
import tpf.lp3.repositorios.OrganizacionRepositorio;

@Service
public class ServicioOrganizacionImplement implements ServicioOrganizacion{
	@Autowired
	private OrganizacionRepositorio repoOrganizacion;
	
	@Override
	public List<Organizacion> listarOrganizacion() {
		List<Organizacion> todasOrganizaciones = repoOrganizacion.findAll();
		return todasOrganizaciones;
	}

	@Override
	public List<Organizacion> buscarOrganizacionPorTipo(String tipo) {
		return repoOrganizacion.findByTipo(tipo);
	}

	@Override
	public Boolean crearOrganizacion(Organizacion o1) {
		repoOrganizacion.save(o1);
		return true;
	}

	@Override
	public Boolean editarOrganizacion(Organizacion o1) {
		// buscamos la organizacion que se quiere editar
		Optional<Organizacion> organizacionActual= repoOrganizacion.findById(o1.getId());
		// si existe entonces se actualiza y se retorna true
		if (organizacionActual.isPresent()){
			repoOrganizacion.save(o1);
			return true;	
		}
		else return false;
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
