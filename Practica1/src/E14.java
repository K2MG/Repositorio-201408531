//cuadrado de asteriscos
import java.util.Scanner;
public class E14 {
	public void ejecutarE14(String[] args){
		int n=0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		n=s.nextInt();
		for(int i=0;i<n;i++){
			System.out.println();
			for(int j=0;j<n;j++){
				if(i==0 || j==0)
					System.out.print("* ");
				else if(i==n-1 || j==n-1)               
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		}
		System.out.println();
	}
}
