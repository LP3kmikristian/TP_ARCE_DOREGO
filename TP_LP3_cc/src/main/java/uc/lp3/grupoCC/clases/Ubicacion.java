package uc.lp3.grupoCC.clases;

public class Ubicacion {
	Double latitud;
	Double longitud;
	
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	public String miUbicacion() {
		return "latitud: " + latitud + ", " + "longitud: " + longitud;
	}
	
}
