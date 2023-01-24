package Utilidades;

import clases.Impuesto;
import clases.Producto;
import servicios.Almacenamiento;
import servicios.Transporte;
import clases.Presupuesto;

public class Utils {
	public static Double calcularImpuesto(Producto p1, Impuesto i1) {
		Double totalImpuesto = p1.precio_total * i1.porcentaje_a_cobrar;
		return totalImpuesto;
	}
	
	public static Boolean tieneDescuento(Presupuesto p1) { // retorna true si es un producto del Mercosur y false en caso contrario
		Boolean esMercosur = false;
		String[] mercosur = {"Argentina", "Paraguay", "Brasil", "Bolivia", "Uruguay", "Venezuela"};
		for(int i=0; i<5; i++) {
			if(p1.procedencia_pedido==mercosur[i]) {
				esMercosur=true;
				break;
			}
		}
		return esMercosur;
	}
	public static Double calcularPesoPedido(Presupuesto p1) {
		// se hace un for y por cada producto del pedido, se obtiene el peso_unitario y la cantidad
		// se calcula y se suma el peso total del pedido
		return null;
	}
	
	public static Double calcularPresupuesto(Presupuesto p1, Transporte t1, Almacenamiento a1) {
		// 1) se hace un for y por cada producto del pedido, calcular el impuesto
		// 2) se obtiene el peso total del pedido y se calcula el precio del transporte y de almacenamiento
		//3) se suma todo y se retorna el total
		
		return null;
	}

}
