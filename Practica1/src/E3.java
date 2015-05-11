//transformar hora
import java.util.Scanner;
public class E3 {
	public void ejecutarE3(String[] args){
		String p;
		String q;
		System.out.println("Introduzca una hora en notación de 24 horas (hh:mm):");
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		p= s.next(); 
//volviend una cantidad la hora
		q=p.replace(":","");
//convirtiendo a entero
		int r=Integer.parseInt(q);
		if(p.length()==5){
//hora entre 1 am y 12 pm
			if(r<1200){
				System.out.println(p+" a.m.");
//hora entre 12 pm y 1 pm
			}else if(r<1300){
				System.out.println(p+" p.m.");
//hora entre 1 pm  y 12 am
			}else if(r<2400){
				if(r%100==0)
					System.out.println(((r/100)-12)+":00 p.m.");
	//minutos menores a 10
				else if(r%100<10){	
					System.out.println(((r/100)-12)+":0"+(r%100)+" p.m.");
	//minutos mayores a 10
				}else
					System.out.println(((r/100)-12)+":"+(r%100)+" p.m.");
//hora entre 12 am y 1 am
			}else if(r==2400||r==0){
				System.out.println("12:00 a.m.");
			}else{
				if(r%100<10)
					System.out.println("12:0"+(r%100)+" a.m.");
				else
					System.out.println("12:"+(r%100)+" a.m.");
				
			}
		}else
			System.out.println("Hora no valida");
		
			
	}
	
	

}
