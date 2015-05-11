import java.util.Scanner;
public class Tarea3 {

	public static void main(String[] args) {
		int a=0;
		System.out.println("Ingrese un número:");
		Scanner S = new Scanner(System.in);
		a=S.nextInt();
		if (a%2==0){
			System.out.println("El número es par.");
		}else{
			System.out.print("El número es impar.");
		}
		
	}

}
