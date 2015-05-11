//juego de abecedario
import java.util.Scanner;
public class E13 {
	public void ejecutarE13(String[] args){
		String p;
		String u=null;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese letra para jugar:");
		p=s.next();
		while(u!=p){
			System.out.println("Ingrese letra: ");
			u=s.next();
			if(u.compareTo(p)==0)
				break;
			else if(u.compareTo(p)>0)
				System.out.println("antes");
			else
				System.out.println("después");
		}
		System.out.println("Game Over - Has Ganado - La letra es: "+p);
	}

}
