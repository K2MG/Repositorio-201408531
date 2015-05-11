//dias de dieferencia
import java.util.Scanner;
public class E5 {
	public void ejecutarE5(String[] args){
//delcarando variables
		int d[];
		d=new int[2];
		int m[];
		m=new int[2];
		int a[];
		a=new int[2];
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
//pidiendo fechas
		System.out.println("Ingrese fecha inicial:");
		System.out.print("dia: ");
		d[0]=s.nextInt();
		System.out.print("mes: ");
		m[0]=s.nextInt();
		System.out.println("año: ");
		a[0]=s.nextInt();
		System.out.println("Ingrese fecha final:");
		System.out.print("dia: ");
		d[1]=s.nextInt();
		System.out.print("mes: ");
		m[1]=s.nextInt();
		System.out.println("año: ");
		a[1]=s.nextInt();
//realizando calculo
		System.out.println("Hay "+( ((a[1]-a[0])*360) + ((m[1]-m[0])*30) + (d[1]-d[0])  )+" dia(s) de diferencia");
		
	}

}
