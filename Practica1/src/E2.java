//Promedio de notas
import java.util.Scanner;
public class E2 {
	
	public void ejecutarE2(String[] args) {
		int n[];
		int r=0;
		n = new int[6];
		System.out.println("Ingrese las notas:");
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		n[0] = S.nextInt();
		n[1] = S.nextInt();
		n[2] = S.nextInt();
		n[3] = S.nextInt();
		n[4] = S.nextInt();
		n[5] = S.nextInt();
		r=(n[0]+n[1]+n[2]+n[3]+n[4]+n[5])/6;
		System.out.println("El promedio es de:"+" "+r);
		System.out.print("La puntucación es:"+" ");
		if(r<60)
			System.out.println("E");
		else if(r>59 && r<70)
			System.out.println("D");
		else if(r>69 && r<80)
			System.out.println("C");
		else if(r>79 && r<90)
			System.out.println("B");
		else System.out.println("A");
		
	}

}
