//Rombo de asteriscos
public class E1 {
	public void ejecutarE1(String args[]){
		for(int i=1;i<6;i++){
			for(int j=5-i;j>0;j--)
				System.out.print(" ");
			for(int k=0;k<2*i-1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<5;i++){
			for(int j=i;j>0;j--)
				System.out.print(" ");
			for(int k=9;k>i+i;k--)
				System.out.print("*");
			System.out.println("");
		}
		
	}

}
