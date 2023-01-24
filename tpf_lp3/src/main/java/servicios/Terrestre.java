package servicios;
import javax.persistence.Entity;

@Entity
public class Terrestre extends Transporte{
	public Terrestre() {
		super();
		this.medio_transporte="terrestre";
	}
	

}
