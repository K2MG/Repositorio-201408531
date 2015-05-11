package Ejercicio4;

public class Extras {
	
	/*este metodo fue creado para calcular las horas extras y al igual que el metodo "calcularBase"
	 * ahorra lineas de codigo 
	 */
	protected static double calcular(String tipo,int horasE, int contratos, int empleados, int base){
		if(tipo=="limpiador"){
			return (base*0.005*horasE);
		}else if(tipo=="comercial"){
			return (base*0.01*contratos);
		}else if(tipo=="encargado"){
			return (base*0.01*empleados);
		}else
			return 0;
	}

}
