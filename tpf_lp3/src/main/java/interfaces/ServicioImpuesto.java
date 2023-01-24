package interfaces;

import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import clases.Impuesto;

@Repository
@RepositoryRestResource(path="/impuesto")

public interface ServicioImpuesto {
	List<Impuesto> listarImpuesto();
	
	Impuesto buscarImpuesto(long id_impuesto);
			
	Boolean crearImpuesto(Impuesto i1);
			
	Boolean editarImpuesto(Impuesto i1); 
			
	Boolean eliminarImpuesto(long id_impuesto); 
}
