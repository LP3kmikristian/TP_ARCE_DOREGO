package servicios;
import javax.persistence.Entity;

@Entity
public class Aereo extends Transporte{
	public Aereo() {
		super();
		this.medio_transporte="aereo";
	}

}
