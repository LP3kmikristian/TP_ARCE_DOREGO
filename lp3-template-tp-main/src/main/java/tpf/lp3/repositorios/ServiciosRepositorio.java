package tpf.lp3.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import tpf.lp3.clases.Servicio;

public interface ServiciosRepositorio extends PagingAndSortingRepository<Servicio, Long>{
	List<Servicio> findByTipo(String tipo);

}
