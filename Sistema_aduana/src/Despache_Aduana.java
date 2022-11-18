
public class Despache_Aduana extends Producto{
	Producto p1;
	int cantidad_producto;
	double peso_total = p1.peso_unitario * cantidad_producto;
	double descuento_mercosur = 0.1;
	double precio_impuesto_total = peso_total * 10000;
	
	
	public Producto getP1() {
		return p1;
	}
	public void setP1(Producto p1) {
		this.p1 = p1;
	}
	public int getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public double getPeso_total() {
		return peso_total;
	}
	public void setPeso_total(double peso_total) {
		this.peso_total = peso_total;
	}
	public double getDescuento_mercosur() {
		return descuento_mercosur;
	}
	public void setDescuento_mercosur(double descuento_mercosur) {
		this.descuento_mercosur = descuento_mercosur;
	}
	public double getPrecio_impuesto_total() {
		return precio_impuesto_total;
	}
	public void setPrecio_impuesto_total(double precio_impuesto_total) {
		this.precio_impuesto_total = precio_impuesto_total;
	} 
	
	//if(p1.produccion_mercosur) {
	//	precio_impuesto_total *= descuento_mercosur;
	//}	
}
