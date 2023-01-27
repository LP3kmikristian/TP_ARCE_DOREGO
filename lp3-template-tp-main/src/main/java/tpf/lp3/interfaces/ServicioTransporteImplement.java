package tpf.lp3.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.repositorios.TransporteRepositorio;
import tpf.lp3.servicios.Transporte;
@Service
public class ServicioTransporteImplement implements ServicioTransporte{
	@Autowired
	private TransporteRepositorio repoAgenciaTransport;
	
	@Override
	public Transporte crearTransporte(Transporte t1) {
		repoAgenciaTransport.save(t1);
		return null;
	}
	
	@Override
	public Boolean editarTransporte(Transporte t1) {
		Optional<Transporte> transporteActual= repoAgenciaTransport.findById(t1.getId());
		// si existe entonces se actualiza y se retorna true
		if (!transporteActual.isEmpty()){
			repoAgenciaTransport.save(t1);
			return true;	
		}
		else return false;
	}

	@Override
	public Boolean eliminarTransporte(Long id) {
		repoAgenciaTransport.deleteById(id);
		return true;	
	}

	@Override
	public List<Transporte> todosTransporte() {
		return repoAgenciaTransport.findAll();
	}
	
	@Override
	public Transporte buscarTransporte(Long id) {
		Optional<Transporte> t1= repoAgenciaTransport.findById(id);
		if(!t1.isEmpty()) {
			return t1.get();
		}
		System.out.println("No se encontro el transporte");
		return null;
	}
		
		
	

}
