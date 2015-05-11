package Ejercicio5;

public class Estado {
	
/*este metodo sirve para consultar la informacion de una objeto de arte
 * segun el estado. De esta manera se ordena mejor el programa.
 */
	protected String info(String estado){
		if(estado=="prestamo")
			return "Coleccion: ... \n se recibio: .... \n fecha de devolucion:...";
		else if(estado=="permanente")
			return "Fecha de adquisicion:... \n Coste:... \n Exposicion";
		return"";
	}
	

}
