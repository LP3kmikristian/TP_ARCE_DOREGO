package usuarios;

import clases.Ubicacion;
import clases.Usuario;
import clases.Producto;

import java.util.List;

import javax.persistence.Entity;

/* Recibe un pedido de transporte e informa de su ubicación 
 y la lista de materiales con sus cantidades que está transportando */

@Entity
public class Transportista extends Usuario{
	long id_pedido;
	Ubicacion miUbicacion;
	List<Producto> listaDeProductosTransportando;
	
	// funcion para asignar el rol de transportista
	public Transportista() {
		super();
		this.rol="TR";
	}
	
	public long getId_pedido() {
		return id_pedido;
	}
	
	public void setId_pedido(long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Ubicacion getMiUbicacion() {
		return miUbicacion;
	}

	public void setMiUbicacion(Ubicacion miUbicacion) {
		this.miUbicacion = miUbicacion;
	}

	public List<Producto> getListaDeProductosTransportando() {
		return listaDeProductosTransportando;
	}

	public void setListaDeProductosTransportando(List<Producto> listaDeProductosTransportando) {
		this.listaDeProductosTransportando = listaDeProductosTransportando;
	}
	
	
	

}
