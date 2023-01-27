package tpf.lp3.interfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpf.lp3.clases.Pedido;
import tpf.lp3.clases.Presupuesto;
import tpf.lp3.clases.Producto;
import tpf.lp3.clases.Usuario;
import tpf.lp3.repositorios.ImpuestoRepositorio;
import tpf.lp3.repositorios.PresupuestoRepositorio;
import tpf.lp3.repositorios.UsuarioRepositorio;
import tpf.lp3.Utilidades.Utils;

@Service
public class ServicioPresupuestoImplement implements ServicioPresupuesto{
	@Autowired
	private PresupuestoRepositorio repoPresupuesto;
	
	@Autowired
	private ImpuestoRepositorio repoImpuesto;
	
	@Autowired
	private UsuarioRepositorio repoUsuario;
	
	@Override
	public ArrayList<Presupuesto> listarPresupuesto() {
		// retornamos la lista de todos los presupuestos
		return (ArrayList<Presupuesto>) repoPresupuesto.findAll();
	}
	
	@Override
	public Presupuesto buscarPresupuesto(long id_pedido) {
		// retorna el impuesto solicitado
		Optional<Presupuesto> p1= repoPresupuesto.findById(id_pedido);
		if (p1.isPresent()) {
			return p1.get();
		}
		else return null;
	}

	@Override
	public Presupuesto crearPresupuesto(Pedido p1) {
		// se debe verificar que el usuario que crea el Presupuesto es un Despachante
		/*Optional<Usuario> usuario_N = repoUsuario.findById(p1.getIdUsuario());
		// si no se encuentra el usuario no se crea el presupuesto
		if(usuario_N.isEmpty()) {
			System.out.println("Se necesitan permisos de Despachante para crear presupuestos");
		}
		// existe el usuario entonces se obtienen todos sus datos
		Usuario usuario = usuario_N.get();
		
		// se verifica el rol del usuario
		if(Objects.equals(usuario.getRol(), "DE")) {
			Presupuesto presu1 = new Presupuesto();
			presu1=Utils.generarPresupuesto(p1);
			repoPresupuesto.save(presu1);
			return presu1;
			}*/
		Presupuesto presu1 = new Presupuesto();
		presu1=Utils.generarPresupuesto(p1);
		repoPresupuesto.save(presu1);
		return presu1;
		//return null;
	}

	@Override
	public Boolean eliminarPresupuesto(long id_presupuesto) {
		// buscamos el presupuesto por id
		Optional<Presupuesto> buscarPresupuesto= repoPresupuesto.findById(id_presupuesto);
		// si existe entonces se elimina y se retorna true si no se retorna false
		if(buscarPresupuesto.isPresent()) {
			repoPresupuesto.deleteById(id_presupuesto);
			return true;
		}
		else return false;
	}

}
