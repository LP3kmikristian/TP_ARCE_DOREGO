package clases;
import javax.persistence.Entity;

@Entity
public class Servicio {
	public String tipo;
	Double honorarios;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getHonorarios() {
		return honorarios;
	}
	public void setHonorarios(Double honorarios) {
		this.honorarios = honorarios;
	}

}
