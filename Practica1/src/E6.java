//calculadora
import java.util.Scanner;
public class E6 {
	public void ejecutarE6(String[] args){
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int a=0;
		int b=0;
		char x;
		System.out.println("Ingrese dos numeros: ");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Operacion que desea realizar: \n (s) Suma \n (r) Resta \n (m) Multiplicación \n (d) División");
		x=s.next().charAt(0);
//validando operacion
		switch(x){
		case 's':
			System.out.println(a+b);
			break;
		case 'r':
			System.out.println(a-b);
			break;
		case 'm':
			System.out.println(a*b);
			break;
		case 'd':
			System.out.println(a/b);
			break;
		default:
			System.out.print("Error, operación no valida.");
			break;
		}
	}

}
