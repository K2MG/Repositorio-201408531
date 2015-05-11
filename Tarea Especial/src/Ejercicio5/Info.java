package Ejercicio5;

public class Info {
	
/*este metodo sirve para consultar la informacion de un objeto de arte
 * segun el tipo. De esta manera se ordena mejor el programa.
 */
	
	public String info(String tipo){
		if(tipo=="pintura")
			return "Tipo de pintura: ... \n Soporte: lienzo \n Estilo:...";
		else if(tipo=="escultura")
			return "Material:... \n Altura:... \n Peso... \n Estilo:...";
		return"";
	}

}
