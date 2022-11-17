
public class Despache_Aduana extends Producto{
	Producto p1;
	int cantidad_producto;
	double peso_total = p1.peso_unitario * cantidad_producto;
	double descuento_mercosur = 0.1;
	double precio_impuesto_total = peso_total * 10000; 
	
	//if(p1.produccion_mercosur) {
	//	precio_impuesto_total *= descuento_mercosur;
	//}
	
	
}
