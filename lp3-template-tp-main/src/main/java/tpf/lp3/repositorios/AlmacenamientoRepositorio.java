package tpf.lp3.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import tpf.lp3.servicios.Almacenamiento;

@Repository
public interface AlmacenamientoRepositorio extends PagingAndSortingRepository<Almacenamiento, Long>{
	ArrayList<Almacenamiento> findAll();
}
