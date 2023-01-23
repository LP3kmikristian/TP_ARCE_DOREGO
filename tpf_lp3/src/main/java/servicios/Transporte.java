package servicios;

import clases.Servicio;
import javax.persistence.Entity;

@Entity
public class Transporte extends Servicio{
	String medio_transporte;
	Double precio_por_peso;
	Double precio_por_distancia;
	public Transporte() {
		super();
		this.tipo="tr";
	}
	
	public String getMedio_transporte() {
		return medio_transporte;
	}

	public void setMedio_transporte(String medio_transporte) {
		this.medio_transporte = medio_transporte;
	}

	public Double getPrecio_por_peso() {
		return precio_por_peso;
	}
	public void setPrecio_por_peso(Double precio_por_peso) {
		this.precio_por_peso = precio_por_peso;
	}
	public Double getPrecio_por_distancia() {
		return precio_por_distancia;
	}
	public void setPrecio_por_distancia(Double precio_por_distancia) {
		this.precio_por_distancia = precio_por_distancia;
	}
	

}
