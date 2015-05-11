//piramiede invertida de numeros
import java.util.Scanner;
public class E10 {
	public void ejecutarE10(String[] args){
		int a=0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		a = s.nextInt();
		for(int i=1;i<=a;i++){
			for(int j=i-1;j>0;j--)
				System.out.print(" ");
			for(int k=a+1;k>i;k--)
				System.out.print(i+" ");
			System.out.println("");
		}
		
	}

}
