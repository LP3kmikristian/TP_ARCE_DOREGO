package servicios;

import clases.Servicio;
import javax.persistence.Entity;

@Entity
public class Transporte extends Servicio{
	public Transporte() {
		super();
		this.tipo="tr";
	}

}
