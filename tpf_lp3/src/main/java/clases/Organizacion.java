package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organizacion {
	String nombre_organizacion;
	String tipo_organizacion;
	String direccion;
	int telefono;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_organizacion;
	
	public String getTipo_organizacion() {
		return tipo_organizacion;
	}
	public void setTipo_organizacion(String tipo_organizacion) {
		this.tipo_organizacion = tipo_organizacion;
	}
	public String getNombre_organizacion() {
		return nombre_organizacion;
	}
	public void setNombre_organizacion(String nombre_organizacion) {
		this.nombre_organizacion = nombre_organizacion;
	}
	public long getId_organizacion() {
		return id_organizacion;
	}
	public void setId_organizacion(long id_organizacion) {
		this.id_organizacion = id_organizacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
