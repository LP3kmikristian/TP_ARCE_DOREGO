package uc.lp3.grupoCC.interfaces;

import java.util.List;

import uc.lp3.grupoCC.clases.Impuesto;
import uc.lp3.grupoCC.clases.Producto;

public interface TipoImpuestos {
	//@get -> devuelve la lista de los diferentes tipos de impuestos
		List<Impuesto> getImpuestos();
		
		//@post -> definir un impuesto nuevo en la lista de impuestos
		Impuesto postImpuestos(Impuesto i1);
		
		//@put -> editar un impuesto en la lista de impuestos
		Impuesto putImpuestos(Impuesto i1);
		
		//@delete -> eliminar un impuesto en la lista de impuestos
		Impuesto deleteImpuestos(Impuesto i1);
}
