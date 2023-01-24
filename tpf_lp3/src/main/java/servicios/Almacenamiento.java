package servicios;

import clases.Servicio;
import javax.persistence.Entity;

@Entity
public class Almacenamiento extends Servicio{
	long id_almacenamiento;
	Double precio_por_tipo_mercaderia;
	Double precio_por_dia;
	public Almacenamiento() {
		super();
		this.tipo="al";
	}
	
	
	public long getId_almacenamiento() {
		return id_almacenamiento;
	}


	public void setId_almacenamiento(long id_almacenamiento) {
		this.id_almacenamiento = id_almacenamiento;
	}


	public Double getPrecio_por_tipo_mercaderia() {
		return precio_por_tipo_mercaderia;
	}
	public void setPrecio_por_tipo_mercaderia(Double precio_por_tipo_mercaderia) {
		this.precio_por_tipo_mercaderia = precio_por_tipo_mercaderia;
	}
	public Double getPrecio_por_dia() {
		return precio_por_dia;
	}
	public void setPrecio_por_dia(Double precio_por_dia) {
		this.precio_por_dia = precio_por_dia;
	}
	

}
