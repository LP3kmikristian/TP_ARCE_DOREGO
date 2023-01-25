package clases;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import servicios.Almacenamiento;
import servicios.Transporte;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_pedido;
	public Long idUsuario; // debe ser un despachante
	public List<Producto> pedido;
	public String procedencia_pedido;
	public String destino_pedido;
	
	public Long getIdUsuario() {
		return getIdUsuario();
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(Long id_presupesto) {
		this.id_pedido = id_presupesto;
	}
	
	public List<Producto> getPedido() {
		return pedido;
	}
	public void setPedido(List<Producto> pedido) {
		this.pedido = pedido;
	}
	public String getProcedencia_pedido() {
		return procedencia_pedido;
	}
	public void setProcedencia_pedido(String procedencia_pedido) {
		this.procedencia_pedido = procedencia_pedido;
	}
	public String getDestino_pedido() {
		return destino_pedido;
	}
	public void setDestino_pedido(String destino_pedido) {
		this.destino_pedido = destino_pedido;
	}	
	
	
}
