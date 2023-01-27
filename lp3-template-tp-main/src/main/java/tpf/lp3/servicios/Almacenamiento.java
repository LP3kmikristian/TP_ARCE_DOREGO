package tpf.lp3.servicios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Almacenamiento{// extends Servicio{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public Long id;
	public Double precio_por_dia;
	
	
	public Double getPrecio_por_dia() {
		return precio_por_dia;
	}
	public void setPrecio_por_dia(Double precio_por_dia) {
		this.precio_por_dia = precio_por_dia;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
