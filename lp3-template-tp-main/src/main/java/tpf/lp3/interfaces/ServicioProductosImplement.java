package tpf.lp3.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Producto;
import tpf.lp3.repositorios.ProductosRepositorio;
@Service
public class ServicioProductosImplement implements ServicioProductos{
	@Autowired
	private ProductosRepositorio repoProduct;

	@Override
	public List<Producto> listarProductos() {
		return repoProduct.findAll();
	}

	@Override
	public Producto buscarProducto(Long id) {
		Optional<Producto> t1= repoProduct.findById(id);
		if(!t1.isEmpty()) {
			return t1.get();
		}
		System.out.println("No se encontro el producto");
		return null;
	}

	@Override
	public Producto crearProducto(Producto produ) {
		return repoProduct.save(produ);
	}

	@Override
	public Producto editarProducto(Producto produ) {
		Optional<Producto> transporteActual= repoProduct.findById(produ.getId());
		// si existe entonces se actualiza y se retorna true
		if (!transporteActual.isEmpty()){
			return repoProduct.save(produ);
				
		}
		else return null;
	}

	@Override
	public Boolean eliminarProducto(Long id) {
		repoProduct.deleteById(id);
		return true;
	}
	

}
