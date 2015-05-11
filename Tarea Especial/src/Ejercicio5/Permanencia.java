package Ejercicio5;

public class Permanencia {
	String estado;
	Estado es = new Estado();
	
/*este metodo sirve para obtener el estado de un objeto de arte
 * segun su numero de identificacion y muesta la informacion respectiva almacenada en la clase "Estado".
 */
	
	protected void estado(int identificacion){
		if(identificacion==1){
			estado= "prestamo";
			System.out.println(estado);
			System.out.println(es.info(estado));
		}
		else if(identificacion==2){
			estado= "permanente";
			System.out.println(estado);
			System.out.println(es.info(estado));
		}
	}
	
	
	
	


}
