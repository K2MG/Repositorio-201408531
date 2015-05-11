//tabla de multiplicar entre 0 y 10
import java.util.Scanner;
public class E7 {
	public void ejecutarE7(String[] args){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int x=0;
		System.out.println("Ingrese un numero entre 0 y 10");
		x=s.nextInt();
		if(x>0 && x<10){
			for(int i=10;i>0;i--)
				System.out.println(x+"*"+(i)+" = "+(x*i));
			
		}else
			System.out.println("numero no valido");
	}

}
