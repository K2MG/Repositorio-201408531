package Ejercicio5;

public class Tipo {
	String tipo;
	Info inf = new Info();
	
/*Este metodo recupera el tipo de un objeto de arte, segun su numero de identificacion y
 * muestra la informacion respectiva almacenada en la clase "Info".
 */
	
	public void info(int identificacion){
		if(identificacion==3){
			tipo= "pintura";
			System.out.println(tipo);
			System.out.println(inf.info(tipo));
		}
		else if(identificacion==4){
			tipo= "escultura";
			System.out.println(tipo);
			System.out.println(inf.info(tipo));
		}else if(identificacion==3){
			tipo="otros";
			System.out.println(tipo);
			System.out.println(inf.info(tipo));
		}
	}

}
