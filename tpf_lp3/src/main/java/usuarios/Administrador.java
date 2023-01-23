package usuarios;

import clases.Usuario;
import javax.persistence.Entity;

@Entity
public class Administrador extends Usuario{
	
	public  Administrador() {
		super(); // se invoca al constructor de Usuario
		this.rol = "AD"; // se establece el rol de administrador
	}

}
