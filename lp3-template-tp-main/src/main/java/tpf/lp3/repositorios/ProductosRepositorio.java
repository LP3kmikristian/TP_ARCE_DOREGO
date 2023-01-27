package tpf.lp3.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import tpf.lp3.clases.Producto;

public interface ProductosRepositorio extends PagingAndSortingRepository<Producto, Long>{
	List<Producto> findAll();
	
}
