package tpf.lp3.servicios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import tpf.lp3.clases.Servicio;

@Entity
public class Transporte {//extends Servicio{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public Long id;
	public String medio;
	public Double precio_por_peso;
	public String nombre_transporte;
	public Double peso_maximo;
	public String chapa;
	

	public String getChapa() {
		return chapa;
	}

	public void setChapa(String chapa) {
		this.chapa = chapa;
	}

	public String getMedio() {
		return medio;
	}
	
	public void setMedio(String medio) {
		this.medio = medio;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrecio_por_peso() {
		return precio_por_peso;
	}
	public void setPrecio_por_peso(Double precio_por_peso) {
		this.precio_por_peso = precio_por_peso;
	}

	public String getNombre_transporte() {
		return nombre_transporte;
	}

	public void setNombre_transporte(String nombre_transporte) {
		this.nombre_transporte = nombre_transporte;
	}

	public Double getPeso_maximo() {
		return peso_maximo;
	}

	public void setPeso_maximo(Double peso_maximo) {
		this.peso_maximo = peso_maximo;
	}

}
