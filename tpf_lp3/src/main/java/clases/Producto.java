package clases;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
	public String nombre;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public Double precio_total;
	public String tipo_producto;
	public String descripcion;
	public Double peso_unitario;
	public int cantidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Double getPrecio_total() {
		return precio_total;
	}
	public void setPrecio_total(Double precio_total) {
		this.precio_total = precio_total;
	}
	public String getTipo_producto() {
		return tipo_producto;
	}
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPeso() {
		return peso_unitario;
	}
	public void setPeso(Double peso) {
		this.peso_unitario = peso;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
