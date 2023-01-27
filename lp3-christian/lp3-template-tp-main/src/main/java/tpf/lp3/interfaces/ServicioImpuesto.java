package tpf.lp3.interfaces;

import java.util.List;

import tpf.lp3.clases.Impuesto;


public interface ServicioImpuesto {
	List<Impuesto> listarImpuesto();
	
	Impuesto buscarImpuesto(Long id);
			
	Boolean crearImpuesto(Impuesto i1);
			
	Boolean editarImpuesto(Impuesto i1); 
			
	Boolean eliminarImpuesto(Long id); 
}
