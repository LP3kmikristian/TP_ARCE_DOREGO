package uc.lp3.grupoCC.interfaces;

import java.util.List;

import uc.lp3.grupoCC.clases.Impuesto;
import uc.lp3.grupoCC.clases.Producto;

public interface TipoImpuestos {
	//@get -> devuelve la lista de los diferentes tipos de impuestos
		List<Impuesto> getImpuestos(); // sistema/impuestos
		
		//@post -> definir un impuesto nuevo en la lista de impuestos
		Boolean postImpuestos(Impuesto i1); // sistema/impuestos
		
		//@put -> editar un impuesto en la lista de impuestos
		Boolean putImpuestos(Impuesto i1); // sistema/impuestos
		
		//@delete -> eliminar un impuesto en la lista de impuestos
		Boolean deleteImpuestos(Impuesto i1); //sistema/impuestos
}
