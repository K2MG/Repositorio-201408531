package Ejercicio1;

public class Conductor {
	String DPI;
	int horas=0;
	String transporte;
	int tonelada=0;
	int transRealizado=0;
	public static void main(String[] args){
		Sueldo sueldo =new Sueldo(); //Conductor se compone de Sueldo, tienen el mismo ciclo de vida
		sueldo.calcular(horas, transporte, tonelada, transRealizado);
		
	}

	

}
