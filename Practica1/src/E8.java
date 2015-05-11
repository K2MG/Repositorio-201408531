//Numeros a letras
import java.util.Scanner;
import java.util.Random;
public class E8 {
	public void ejecutarE8(String[] args){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int a=0;
		int b=0;
		int z=0;
		String u[] = {"Cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
		String d[] = {"Diez","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa","Cien"};
		String d1[] = {"Once","Doce","Trece","Catorce","Quince","Dieciséis","Diecisiete","Dieciocho","Diecinueve"};
		System.out.println("Ingrese limites:");
		a=s.nextInt();
		b=s.nextInt();
//comprobando limites
		if(a<101 && b<101){
			z=r.nextInt(b-a)+a;
			System.out.println(z);
//convirtiendo a letras
			if(z<10){
				System.out.println(u[z]);
			}else if(z%10==0){
				System.out.println(d[(z/10)-1]);
			}else if(z<20){
				System.out.println(d1[z-11]);
			}else if(z<30){
				System.out.println("Veinti"+u[z-20]);
			}else{
				System.out.println((d[(z/10)-1])+" y "+(u[z%10]));
			}
			
			
		}else
			System.out.println("Limites no validos");
		
	}

}
