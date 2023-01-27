package tpf.lp3.clases;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public Long id;
	@OneToMany(targetEntity=Producto.class)
	private List<Producto> lista;
	public String procedencia_pedido;
	public String destino_pedido;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id_presupesto) {
		this.id = id_presupesto;
	}
	
	public List<Producto> getLista() {
		return lista;
	}
	public void setLista(List<Producto> lista) {
		this.lista = lista;
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
