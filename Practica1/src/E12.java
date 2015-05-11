//cadenas a asteriscos
import java.util.Scanner;
public class E12 {
	public void ejecutarE12(String[] args){
		String a;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese una cadena de texto:");
		a=s.nextLine();
		for(int i=0;i<a.length();i++)
			System.out.print("*");
		//System.out.println();
		System.out.println("\n"+a);
	}

}
