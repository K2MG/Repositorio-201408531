//calcula area y perimetro
import java.util.Scanner;
import java.math.*;
@SuppressWarnings("unused")
public class E4 {
	public void ejecutarE4(String[] args){
		String r;
		String o;
		char p;
		float a=0;
		System.out.println("Calcular area y perimetro para: \n Circulo (C,X) \n Cuadrado (U,X) \n Triangulo (T,X)");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
//recibiendo instruccion
		r=s.next();
//obteniendo al letra
		p=r.charAt(0);
//suprimiendo los caracteres
		o=r.substring(2);
//conviritiendo a float
		a=Float.parseFloat(o);
//Realizando operacion
		if(p=='C'){
			System.out.println("El area es: "+(3.1416*Math.pow(a,2)));
			System.out.println("El perimetro es: "+(2*a*3.1416));
		}else if(p=='U'){
			System.out.println("El area es: "+(a*a));
			System.out.println("El perimetro es: "+(4*a));
		}else if(p=='T'){
			System.out.println("El area es: "+((a*Math.sqrt((a*a)-(Math.pow((a/2), 2))))/2));
			System.out.println("El perimetro es: "+(3*a));
		}else
			System.out.println("Operacion no valida");
			
	}

}
