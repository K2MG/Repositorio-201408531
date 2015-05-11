package Ejercicio6;

public class Trabajo {
	int Identificador = 0;
	String tipo;
	String descripcion;
	double horasTrabajadas = 0;
	boolean finalizado = false;
	double material = 0;
	double base=horasTrabajadas*30;
	Cobro cobro = new Cobro();
	public void main(String[] args){
		if(finalizado==true){
			System.out.println(cobro.obtenerCobro(base, tipo, material));
		}else
			System.out.println("En proceso");
	}
	

}
