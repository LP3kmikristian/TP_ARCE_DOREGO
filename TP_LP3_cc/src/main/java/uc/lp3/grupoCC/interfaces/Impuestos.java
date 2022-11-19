package uc.lp3.grupoCC.interfaces;

import java.util.List;

public interface Impuestos {
	
	//@get -> devuelve la lista de los diferentes tipos de impuestos
	List<Impuestos> getImpuestos();
	
	//@post -> definir un impuesto nuevo en la lista de impuestos
	Impuestos postImpuestos(Impuestos i1);
	
	//@put -> editar un impuesto en la lista de impuestos
	Impuestos putImpuestos(Impuestos i1);
	
	//@delete -> eliminar un impuesto en la lista de impuestos
	Impuestos deleteImpuestos(Impuestos i1);
	
	// calcular el impuesto total de un pedido
	Impuestos ImpuestoTotal(List<Productos> p1);
	

}
