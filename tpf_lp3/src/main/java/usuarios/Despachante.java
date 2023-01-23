package usuarios;

import clases.Usuario;
import javax.persistence.Entity;

@Entity
public class Despachante extends Usuario{
	
	public Despachante() {
		super();
		this.rol="DE";
		}
}
