package interfaces;

import java.util.List;

import clases.Impuesto;


public interface ServicioImpuesto {
	List<Impuesto> listarImpuesto();
	
	Impuesto buscarImpuesto(long id_impuesto);
			
	Boolean crearImpuesto(Impuesto i1);
			
	Boolean editarImpuesto(Impuesto i1); 
			
	Boolean eliminarImpuesto(long id_impuesto); 
}
