//Menú del programa
import java.util.Scanner;
public class Practica1 {
	
	public static void main(String[] args) {
		int n=0;
		int e=0;
		String a="---Fin del Programa---";
		System.out.println("Presione el número de nivel al que desea acceder: \n (1) Nivel 1 \n (2) Nivel 2");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		n =s.nextInt();
		if(n==1){
			System.out.println("(1) Ejercicio-1");
			System.out.println("(2) Ejercicio-2");
			System.out.println("(3) Ejercicio-3");
			System.out.println("(4) Ejercicio-4");
			System.out.println("(5) Ejercicio-5");
		}else{
			System.out.println("(1) Ejercicio-6");
			System.out.println("(2) Ejercicio-7");
			System.out.println("(3) Ejercicio-8");
			System.out.println("(4) Ejercicio-9");
			System.out.println("(5) Ejercicio-10");
			System.out.println("(6) Ejercicio-11");
			System.out.println("(7) Ejercicio-12");
			System.out.println("(8) Ejercicio-13");
			System.out.println("(9) Ejercicio-14");
			System.out.println("(10) Ejercicio-15");
		}
//Creando clases de ejercicios
		E1 e1 = new E1();
		E2 e2 = new E2();
		E3 e3 = new E3();
		E4 e4 = new E4();
		E5 e5 = new E5();
		E6 e6 = new E6();
		E7 e7 = new E7();
		E8 e8 = new E8();
		E9 e9 = new E9();
		E10 e10 = new E10();
		E11 e11 = new E11();
		E12 e12 = new E12();
		E13 e13 = new E13();
		E14 e14 = new E14();
		E15 e15 = new E15();
//Menu
		e=s.nextInt();
		switch (n) {
		case 1:
			switch(e){
			case 1:
				e1.ejecutarE1(args);
				System.out.println(a);
				break;
			case 2:
				e2.ejecutarE2(args);
				System.out.println(a);
				break;
			case 3:
				e3.ejecutarE3(args);
				System.out.println(a);
				break;
			case 4:
				e4.ejecutarE4(args);
				System.out.println(a);
				break;
			case 5:
				e5.ejecutarE5(args);
				System.out.println(a);
				break;
			default:
				System.out.println("Numero no valido");
			
			}
			
			break;
			
			
		case 2:
			switch(e){
			case 1:
				e6.ejecutarE6(args);
				System.out.println(a);
				break;
			case 2:
				e7.ejecutarE7(args);
				System.out.println(a);
				break;
			case 3:
				e8.ejecutarE8(args);
				System.out.println(a);
				break;
			case 4:
				e9.ejecutarE9(args);
				System.out.println(a);
				break;
			case 5:
				e10.ejecutarE10(args);
				System.out.println(a);
				break;
			case 6:
				e11.ejecutarE11(args);
				System.out.println(a);
				break;
			case 7:
				e12.ejecutarE12(args);
				System.out.println(a);
				break;
			case 8:
				e13.ejecutarE13(args);
				System.out.println(a);
				break;
			case 9:
				e14.ejecutarE14(args);
				System.out.println(a);
				break;
			case 10:
				e15.ejecutarE15(args);
				System.out.println(a);
				break;
			}
			
			
		}
		
		

	}

}
