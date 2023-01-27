package tpf.lp3.usuarios;

import tpf.lp3.clases.Usuario;
import tpf.lp3.clases.Producto;

import java.util.ArrayList;

import javax.persistence.Entity;

/* Recibe un pedido de transporte e informa de su ubicación 
 y la lista de materiales con sus cantidades que está transportando */

@Entity
public class Transportista extends Usuario{
	public String miUbicacion;
	public ArrayList<Producto> listaDeProductosTransportando;
	
	// funcion para asignar el rol de transportista
	public Transportista() {
		super();
		this.rol="TR";
	}


	public String getMiUbicacion() {
		return miUbicacion;
	}

	public void setMiUbicacion(String miUbicacion) {
		this.miUbicacion = miUbicacion;
	}

	public ArrayList<Producto> getListaDeProductosTransportando() {
		return listaDeProductosTransportando;
	}

	public void setListaDeProductosTransportando(ArrayList<Producto> listaDeProductosTransportando) {
		this.listaDeProductosTransportando = listaDeProductosTransportando;
	}
	

}
