package tpf.lp3.clases;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public long id;
	
	/* ADMINISTRADOR -> "AD", AUDITOR -> "AU", TRANSPORTISTA -> "TR", DESPACHANTE -> "DE" */
	
	public String nombre;
	//public long id_organizacion;
	protected String rol; 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getNombre_usuario() {
		return nombre;
	}
	public void setNombre_usuario(String nombre) {
		this.nombre = nombre;
	}
	/*public long getId_organizacion() {
		return id_organizacion;
	}
	public void setId_organizacion(long id_organizacion) {
		this.id_organizacion = id_organizacion;
	}*/

	
	
}
