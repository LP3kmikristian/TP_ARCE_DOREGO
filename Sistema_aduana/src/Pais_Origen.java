import interfaces.Definir_pais;

public class Pais_Origen implements Definir_pais {
	String continente;
	String nombre_pais;

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getNombre_pais() {
		return nombre_pais;
	}

	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}
	
	public Boolean isAmericaS(String continente) {
		if(continente=="America") return true;
		else return false;
	}
}