package clases;
import javax.persistence.Entity;

@Entity
public class Servicio {
	public String tipo; // El servicio puede ser de Almacenamiento ("al") o de Transporte ("tr")
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
