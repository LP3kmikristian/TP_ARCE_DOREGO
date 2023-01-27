package tpf.lp3.clases;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	//@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public Long id;
	
	/* ADMINISTRADOR -> "AD", AUDITOR -> "AU", TRANSPORTISTA -> "TR", DESPACHANTE -> "DE" */
	
	public String nombre;
	public String correo;
	public long id_organizacion;
	protected String rol;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public long getId_organizacion() {
		return id_organizacion;
	}
	public void setId_organizacion(long id_organizacion) {
		this.id_organizacion = id_organizacion;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	} 
	
	
}
