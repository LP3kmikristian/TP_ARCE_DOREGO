package interfaces;

import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import clases.Impuesto;

@Repository
@RepositoryRestResource(path="/impuesto")

public interface ServicioImpuesto {
	//@get -> devuelve la lista de los diferentes tipos de impuestos
			List<Impuesto> getImpuestos(); // sistema/impuestos
			
			//@post -> definir un impuesto nuevo en la lista de impuestos
			Boolean postImpuestos(Impuesto i1); // sistema/impuestos
			
			//@put -> editar un impuesto en la lista de impuestos
			Boolean putImpuestos(Impuesto i1); // sistema/impuestos
			
			//@delete -> eliminar un impuesto en la lista de impuestos
			Boolean deleteImpuestos(Impuesto i1); //sistema/impuestos
}
