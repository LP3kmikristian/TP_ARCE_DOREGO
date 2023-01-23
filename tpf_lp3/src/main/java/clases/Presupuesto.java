package clases;

import java.util.List;

public class Presupuesto {
	Long id_presupesto;
	List<Producto> pedido;
	
	public Long getId_presupesto() {
		return id_presupesto;
	}
	public void setId_presupesto(Long id_presupesto) {
		this.id_presupesto = id_presupesto;
	}
	
	public List<Producto> getPedido() {
		return pedido;
	}
	public void setPedido(List<Producto> pedido) {
		this.pedido = pedido;
	}
	
	
	
	
	
}
