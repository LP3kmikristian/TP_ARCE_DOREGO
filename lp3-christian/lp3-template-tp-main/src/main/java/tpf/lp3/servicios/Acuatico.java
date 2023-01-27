package tpf.lp3.servicios;
import javax.persistence.Entity;

@Entity
public class Acuatico extends Transporte{
	public Acuatico() {
		super();
		this.medio="acuatico";
	}

}
