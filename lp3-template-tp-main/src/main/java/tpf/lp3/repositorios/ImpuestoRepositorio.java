package tpf.lp3.repositorios;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import tpf.lp3.clases.Impuesto;

@Repository
public interface ImpuestoRepositorio extends PagingAndSortingRepository<Impuesto, Long>{
	List<Impuesto> findAll();
	//Impuesto ImpuestoByIdProducto(long id_producto);

}
