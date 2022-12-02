package uc.lp3.grupoCC.utilidades;

import java.util.ArrayList;
import java.util.List;

import uc.lp3.grupoCC.clases.Impuesto;
import uc.lp3.grupoCC.clases.Producto;

public class Utils {
	
	Double calcularImpuesto(Producto p1, Impuesto i1) {
		Double totalImpuesto = p1.precio_total * i1.porcentaje_a_cobrar;
		return totalImpuesto;
	}
	
	Boolean tieneDescuento(Producto p1) { // retorna true si es un producto del Mercosur y false en caso contrario
		Boolean esMercosur = false;
		String[] mercosur = {"Argentina", "Paraguay", "Brasil", "Bolivia", "Uruguay", "Venezuela"};
		for(int i=0; i<5; i++) {
			if(p1.procedencia==mercosur[i]) {
				esMercosur=true;
				break;
			}
		}
		return esMercosur;
	}
	
}
