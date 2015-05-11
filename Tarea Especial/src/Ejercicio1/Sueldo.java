package Ejercicio1;

public class Sueldo {
	final static int base=700;
//Metodo calcular que sirve para caluclar el sueldo total del conductor
	protected static double calcular(int horas, String transporte,int tonelada,int transRealizado){
		if (transporte=="colectivo"){
			return (base+(horas*5)+horas);
		}else if(transporte=="no colectivo"){
			return (base+(horas*5)+(horas*0.5));
		}else if(transporte=="mercancias"){
			return (base+(tonelada*2));
		}else{
			return (base+(tonelada*2)+(transRealizado*0.5));
		}
		
	}

}
