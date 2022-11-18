package uc.lp3.grupoCC.interfaces;

import java.util.List;

public interface Personas {
	
	//@get -> devuelve una lista de todas las personas
	List<Personas> getPersonas();
	
	//@get -> devuelve una sola persona
	Personas getPersonas(int ci);
	
	//@post -> crea una persona
	Personas crearPersonas(Personas p1);
	
	//@Put -> edita una persona
	Personas editarPersonas(Personas p1);
}
