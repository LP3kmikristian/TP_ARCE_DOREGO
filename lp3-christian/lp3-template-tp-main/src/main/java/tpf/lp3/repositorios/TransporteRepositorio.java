package tpf.lp3.repositorios;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import tpf.lp3.servicios.Transporte;

@Repository
public interface TransporteRepositorio extends PagingAndSortingRepository<Transporte, Long>{
	List<Transporte> findAll();
	
}

