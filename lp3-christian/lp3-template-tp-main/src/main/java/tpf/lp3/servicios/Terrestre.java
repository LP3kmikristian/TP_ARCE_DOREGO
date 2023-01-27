package tpf.lp3.servicios;
import javax.persistence.Entity;

@Entity
public class Terrestre extends Transporte{
	public Terrestre() {
		super();
		this.medio="terrestre";
	}
	

}
