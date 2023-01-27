package tpf.lp3.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import tpf.lp3.clases.Usuario;

@Repository
public interface UsuarioRepositorio extends PagingAndSortingRepository<Usuario, Long>{
	ArrayList<Usuario> findByRol(String rol); // se devuelve la lista de usuarios que tienen el mismo rol
	
}
