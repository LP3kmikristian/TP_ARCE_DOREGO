package usuarios;

import clases.Usuario;
import javax.persistence.Entity;

@Entity
public class Transportista extends Usuario{
	
	public Transportista() {
		super();
		this.rol="TR";
	}

}
