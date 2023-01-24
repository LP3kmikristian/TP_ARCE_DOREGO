package interfaces;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import clases.Presupuesto;
import clases.Producto;
import clases.Usuario;
import repositorios.ImpuestoRepositorio;
import repositorios.PresupuestoRepositorio;
import repositorios.UsuarioRepositorio;


public class ServicioPresupuestoImplement implements ServicioPresupuesto{
	@Autowired
	private PresupuestoRepositorio repoPresupuesto;
	
	@Autowired
	private ImpuestoRepositorio repoImpuesto;
	
	@Autowired
	private UsuarioRepositorio repoUsuario;
	
	@Override
	public List<Presupuesto> listarPresupuesto() {
		// retornamos la lista de todos los presupuestos
		return repoPresupuesto.findAll();
	}
	
	@Override
	public Presupuesto buscarPresupuesto(long id_presupuesto) {
		// retorna el impuesto solicitado
		Optional<Presupuesto> p1= repoPresupuesto.findById(id_presupuesto);
		if (p1.isPresent()) {
			return p1.get();
		}
		else return null;
	}

	@Override
	public Boolean crearPresupuesto(Presupuesto p1) {
		// guardamos el nuevo presupuesto y retornamos true
		//repoPresupuesto.save(p1);
		// se debe verificar que el usuario que crea el Presupuesto es un Despachante
		Optional<Usuario> usuario_N = repoUsuario.findById(p1.getIdUsuario());
		// si no se encuentra el usuario no se crea el presupuesto
		if(usuario_N.isEmpty()) {
			System.out.println("Se necesitan permisos de Despachante para crear presupuestos");
		}
		// existe el usuario
		Usuario usuario = usuario_N.get();
		
		// se verifica el rol del usuario
		if(Objects.equals(usuario.getRol(), "DE")) {
			// se obtiene el id del presupuesto
			
			
			}
		return true;
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

	@Override
	public Boolean editarPresupuesto(Presupuesto p1) {
		// buscamos el presupuesto que se quiere actualizar
		Optional<Presupuesto> presupuestoActual= repoPresupuesto.findById(p1.getId_presupesto());
		// si existe entonces se actualiza y se retorna true
		if (presupuestoActual.isPresent()){
			repoPresupuesto.save(p1);
			return true;	
		}
		else return false;
	}

}
