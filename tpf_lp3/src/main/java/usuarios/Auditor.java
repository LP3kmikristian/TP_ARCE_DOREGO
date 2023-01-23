package usuarios;

import clases.Usuario;
import javax.persistence.Entity;

@Entity
public class Auditor extends Usuario{
	public Auditor() {
		super();
		this.rol = "AU";
	}
}
