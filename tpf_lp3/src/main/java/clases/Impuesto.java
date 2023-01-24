package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Impuesto {
	String nombre_impuesto;
	String tipo_producto; // tipo de producto sobre el cual se aplica el impuesto
	public Double porcentaje_a_cobrar;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	public String getNombre_impuesto() {
		return nombre_impuesto;
	}
	public void setNombre_impuesto(String nombre_impuesto) {
		this.nombre_impuesto = nombre_impuesto;
	}
	public String getTipo_producto() {
		return tipo_producto;
	}
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	public Double getPorcentaje_a_cobrar() {
		return porcentaje_a_cobrar;
	}
	public void setPorcentaje_a_cobrar(Double porcentaje_a_cobrar) {
		this.porcentaje_a_cobrar = porcentaje_a_cobrar;
	}
	public long getId_impuesto() {
		return id;
	}
	public void setId_impuesto(long id) {
		this.id = id;
	}
	

}
