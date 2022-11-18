import interfaces.Transporte;

public class Avion implements Transporte{
	double cargo_total;
	double peso_total;
	int precio_por_peso = 20000;
	public double definir_precio(){
		return cargo_total=precio_por_peso*peso_total;
		
	}
}
