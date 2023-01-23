package clases;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	String nombre_usuario;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_usuario;
	public String rol; // {"AD", "AU", "TR", "DE"}
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(long id) {
		this.id_usuario = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
}
