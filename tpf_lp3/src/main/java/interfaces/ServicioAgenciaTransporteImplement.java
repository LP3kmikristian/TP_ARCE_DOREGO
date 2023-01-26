package interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import repositorios.AgenciaTransporteRepositorio;
import servicios.Almacenamiento;
import servicios.Transporte;

public class ServicioAgenciaTransporteImplement implements ServicioAgenciaTransporte{
	@Autowired
	private AgenciaTransporteRepositorio repoAgenciaTransport;
	@Override
	public Transporte crearTransporte(Transporte t1) {
		repoAgenciaTransport.save(t1);
		return null;
	}
	
	// TRANSPORTE
	@Override
	public Boolean editarTransporte(Transporte t1) {
		Optional<Transporte> transporteActual= repoAgenciaTransport.findByChapa(t1.getChapa_transporte());
		// si existe entonces se actualiza y se retorna true
		if (transporteActual.isPresent()){
			repoAgenciaTransport.save(t1);
			return true;	
		}
		else return false;
	}

	@Override
	public Boolean eliminarTRansporte(String chapa_transporte) {
		Optional<Transporte> t1= repoAgenciaTransport.findByChapa(chapa_transporte);
		// si existe entonces se actualiza y se retorna true
		if (t1.isPresent()){
			repoAgenciaTransport.deleteByChapa(chapa_transporte);
			return true;	
		}
		else return false;
	}

	@Override
	public List<Transporte> todosTransporte() {
		
		return repoAgenciaTransport.findAllTransporte();
	}
	
	@Override
	public Transporte buscarTransporte(String chapa_transporte) {
		Optional<Transporte> t1= repoAgenciaTransport.findByChapa(chapa_transporte);
		if(t1.isPresent()) {
			return t1.get();
		}
		else return null;
	}
	
	// ALMACENAMIENTO
	@Override
	public Almacenamiento crearAlmacenamiento(Almacenamiento a1) {
		repoAgenciaTransport.save(a1);
		return null;
	}

	@Override
	public Boolean editarAlmacenamieto(Almacenamiento a1) {
		Optional<Almacenamiento> almacenamientoActual=repoAgenciaTransport.findByIdAlmacenamiento(a1.getId_almacenamiento());
		if(almacenamientoActual.isPresent()) {
			repoAgenciaTransport.save(a1);
			return true;
		}
		else return false;
	}

	@Override
	public Boolean eliminarAlmacenamiento(long id_almacenamiento) {
		Optional<Almacenamiento> almacenamientoActual=repoAgenciaTransport.findByIdAlmacenamiento(id_almacenamiento);
		if(almacenamientoActual.isPresent()) {
			repoAgenciaTransport.deleteByIdAlmacenamiento(id_almacenamiento);
			return true;
		}
		return false;
	}

	@Override
	public List<Almacenamiento> todosAlmacenamiento() {
		
		return repoAgenciaTransport.findAllAlmacenamiento();
	}

	@Override
	public Almacenamiento buscarAlmacenamiento(long id_almacenamiento) {
		Optional<Almacenamiento> a1=repoAgenciaTransport.findByIdAlmacenamiento(id_almacenamiento);
		if(a1.isPresent()) {
			return a1.get();
		}
		else return null;
	}

}
