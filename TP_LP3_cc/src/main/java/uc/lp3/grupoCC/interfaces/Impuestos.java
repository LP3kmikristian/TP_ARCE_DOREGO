package uc.lp3.grupoCC.interfaces;

import java.util.List;

public interface Impuestos {
	
	//@get -> devuelve la lista de los diferentes tipos de impuestos
	List<Impuestos> getImpuestos();
	
	//@post -> definir un impuesto nuevo
	Impuestos crearImpuestos(Impuestos i1);
	
	//@put -> editar un impuesto
	Impuestos editarImpuestos(Impuestos i1);
	
	//@delete -> eliminar un impuesto
	Impuestos eliminarImpuestos(Impuestos i1);
	

}
