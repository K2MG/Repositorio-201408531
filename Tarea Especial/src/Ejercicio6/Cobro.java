package Ejercicio6;

public class Cobro {
	
/*Este metdodo permite conocer el cobro que se le debe hacer la cliente segun el trabajo
 * 
 */
	
	public double obtenerCobro(double base, String tipo, double material) {
		if(tipo=="reparacion mecanica"){
			return (base+(material*2));
		}else if(tipo=="reparacion chapa/pint")
			return (base+(material*3));
		return (base+20);
	}

}
