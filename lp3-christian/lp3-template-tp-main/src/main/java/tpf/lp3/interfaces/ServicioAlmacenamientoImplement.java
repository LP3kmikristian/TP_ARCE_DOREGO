package tpf.lp3.interfaces;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.repositorios.AlmacenamientoRepositorio;

import tpf.lp3.servicios.Almacenamiento;
@Service
public class ServicioAlmacenamientoImplement implements ServicioAlmacenamiento{
	@Autowired
	private AlmacenamientoRepositorio repoAlmacenamiento;
	// ALMACENAMIENTO
		@Override
		public Boolean crearAlmacenamiento(Almacenamiento a1) {
			repoAlmacenamiento.save(a1);
			return true;
		}

		@Override
		public Boolean editarAlmacenamiento(Almacenamiento a1) {
			Optional<Almacenamiento> almacenamientoActual=repoAlmacenamiento.findById(a1.getId());
			if(almacenamientoActual.isPresent()) {
				repoAlmacenamiento.save(a1);
				return true;
			}
			else return false;
		}

		@Override
		public Boolean eliminarAlmacenamiento(Long id) {
			Optional<Almacenamiento> almacenamientoActual=repoAlmacenamiento.findById(id);
			if(almacenamientoActual.isPresent()) {
				repoAlmacenamiento.deleteById(id);
				return true;
			}
			return false;
		}

		@Override
		public ArrayList<Almacenamiento> todosAlmacenamiento() {
			
			return repoAlmacenamiento.findAll();
		}

		@Override
		public Almacenamiento buscarAlmacenamiento(Long id) {
			Optional<Almacenamiento> a1=repoAlmacenamiento.findById(id);
			if(a1.isPresent()) {
				return a1.get();
			}
			else return null;
		}
}
