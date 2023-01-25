package clases;

import java.util.ArrayList;
import java.util.List;


public class Presupuesto {
	long id_pedido;
	Double total_impuestos;
	Double sub_total;
	ArrayList<String> opcionesTransporte;
	ArrayList<String> opcionesAlmacenamiento;
	

	public long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Double getTotal_impuestos() {
		return total_impuestos;
	}

	public void setTotal_impuestos(Double total_impuestos) {
		this.total_impuestos = total_impuestos;
	}

	public Double getSub_total() {
		return sub_total;
	}

	public void setSub_total(Double sub_total) {
		this.sub_total = sub_total;
	}

	public ArrayList<String> getOpcionesTransporte() {
		return opcionesTransporte;
	}

	public void setOpcionesTransporte(ArrayList<String> opcionesTransporte) {
		this.opcionesTransporte = opcionesTransporte;
	}

	public ArrayList<String> getOpcionesAlmacenamiento() {
		return opcionesAlmacenamiento;
	}

	public void setOpcionesAlmacenamiento(ArrayList<String> opcionesAlmacenamiento) {
		this.opcionesAlmacenamiento = opcionesAlmacenamiento;
	}
	
	
	
	
	
	
}
