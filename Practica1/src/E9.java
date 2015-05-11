//conversion a romanos
import java.util.Scanner;

public class E9 {
	public void ejecutarE9(String[] args){
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	String u[] = {"I","II","III","IV","V","VI","VII","VIII","IX"};
	String d[] = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	String c[] = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	String m[] = {"M","MM","MMM"};
	int a=0;
	System.out.println("Ingrese el numero que desea convertir a romano:");
	a=s.nextInt();
	//System.out.println(l[a]);
//valuar numero
	if(a<10)
		System.out.println(u[a-1]);
	else if(a%10==0 && a<100)
		System.out.println(d[(a/10)-1]);
	else if(a<100)
		System.out.println(d[(a/10)-1]+u[(a%10)-1]);
	else if(a%100==0 && a<1000)
		System.out.println(c[(a/100)-1]);
	else if(a<1000){
		System.out.print(c[(a/100)-1]);
//numeros con cero intermedio menores a mil
		if(a%100<10){
			System.out.println(u[(a%10)-1]);
		}
		else{
			System.out.println(d[((a/10)%10)-1]+u[(a%10)-1]);
		}
	}else if(a%1000==0 && a<4000)
		System.out.println(m[(a/1000)-1]);
	else if(a<4000){
		System.out.print(m[(a/1000)-1]);
//numeros con cero intermedio
		if(a%1000<10)
			System.out.println(u[(a%1000)-1]);
		else if(a%1000<100)
			System.out.println(d[((a%1000)/10)-1]+u[(a%10)-1]);
		else if((a%1000)>99 && ((a%1000)%100)==0)
			System.out.println( c[((a%1000)/100)-1]  );
		else if((a%1000)>99 && ((a%1000)%100<10))
			System.out.println(c[ ((a%1000)/100) -1] + u[(a%10)-1]);
		else
			System.out.println(c[ ((a%1000)/100) -1] + d[(((a%1000)%100)/10)-1]  + u[(a%10)-1]);
			
		
	}else 
		System.out.println("Numero no valido");
		
		
	}

}
