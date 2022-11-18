
public class Producto {
	String nombre_producto;
	int id;
	String descripcion;
	double peso_unitario;
	double posicion_arancelaria;
	boolean produccion_mercosur;
	
	
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso_unitario() {
		return peso_unitario;
	}
	public void setPeso_unitario(double peso_unitario) {
		this.peso_unitario = peso_unitario;
	}
	public double getPosicion_arancelaria() {
		return posicion_arancelaria;
	}
	public void setPosicion_arancelaria(double posicion_arancelaria) {
		this.posicion_arancelaria = posicion_arancelaria;
	}
	public Boolean getProduccion_mercosur() {
		return produccion_mercosur;
	}
	public void setProduccion_mercosur(Boolean produccion_mercosur) {
		this.produccion_mercosur = produccion_mercosur;
	}
}
