package Ejercicio4;

public class Base {

	/*se crea este metodo para obtener el sueldo de un empleado ahorrandose lineas de codigo 
	 ya que en una empresa existen muchos empleados y es mas practico
	 llamar a este metodo en lugar de escrbir miles de veces el codigo que contiene
	 
	 */

	protected static int sueldoBase(String tipo){
		if(tipo=="limpiador"){
			return 1800;
		}else if(tipo=="comercial"){
			return 2000;
		}else if(tipo=="encargado"){
			return 3000;
		}else
			return 2500;
	}

}
