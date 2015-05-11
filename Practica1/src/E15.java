//cantidad de numeros primos
import java.util.Scanner;
public class E15 {
	public void ejecutarE15(String[] args){
		int n=0;
		int c=0;
		boolean p;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		n=s.nextInt();
	//es primo o no
		
		for(int i=2;i<n;i++){
			p=true;
			int j=2;
			while(j<=i-1 && p==true){
				if(i%j==0)
					p=false;
			j++;
			}
			if(p==true){
				c++;
			}
		}
		
		System.out.println("Entre 1 y "+n+" hay "+c+" numeros primos");
		
	}

}
