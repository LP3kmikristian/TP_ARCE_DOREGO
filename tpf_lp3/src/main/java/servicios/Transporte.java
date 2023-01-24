package servicios;

import clases.Servicio;
import javax.persistence.Entity;

@Entity
public class Transporte extends Servicio{
	String medio_transporte;
	Double precio_por_peso;
	Double precio_por_distancia;
	String nombre_transporte;
	String chapa_transporte;
	Double peso_maximo;
	Double distancia_maxima;
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

	public String getNombre_transporte() {
		return nombre_transporte;
	}

	public void setNombre_transporte(String nombre_transporte) {
		this.nombre_transporte = nombre_transporte;
	}

	public String getChapa_transporte() {
		return chapa_transporte;
	}

	public void setChapa_transporte(String chapa_transporte) {
		this.chapa_transporte = chapa_transporte;
	}

	public Double getPeso_maximo() {
		return peso_maximo;
	}

	public void setPeso_maximo(Double peso_maximo) {
		this.peso_maximo = peso_maximo;
	}

	public Double getDistancia_maxima() {
		return distancia_maxima;
	}

	public void setDistancia_maxima(Double distancia_maxima) {
		this.distancia_maxima = distancia_maxima;
	}
	
	

}
