
public class Agente_Transporte extends Pais_Origen {
	String contratista;
	Pais_Origen s1;
	String tipo_transporte;
	double precio_distancia;
	double precio_peso;
	boolean se_almacena;
	int dias_almacenamiento;
	int precio_almacenar_dia;
	// falta la posibilidad de almacenar el prducto
	
	public String getContratista() {
		return contratista;
	}
	public void setContratista(String contratista) {
		this.contratista = contratista;
	}
	public Pais_Origen getS1() {
		return s1;
	}
	public void setS1(Pais_Origen s1) {
		this.s1 = s1;
	}
	public String getTipo_transporte() {
		return tipo_transporte;
	}
	public void setTipo_transporte(String tipo_transporte) {
		this.tipo_transporte = tipo_transporte;
	}
	public double getPrecio_distancia() {
		return precio_distancia;
	}
	public void setPrecio_distancia(double precio_distancia) {
		this.precio_distancia = precio_distancia;
	}
	public double getPrecio_peso() {
		return precio_peso;
	}
	public void setPrecio_peso(double precio_peso) {
		this.precio_peso = precio_peso;
	}
	

}
