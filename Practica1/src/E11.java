//ordenar numero romanos
import java.util.Scanner;
public class E11 {
	public void ejecutarE11(String[] args){
		//Transformar t = new Transformar();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String[] r;
		r = new String[5];
		int[] n;
		n = new int[5];
		int ma=0, me=0;
//pidiendo numeros
		System.out.println("Ingrese 5 numeros romanos de 1 a 100: ");
		r[0]=s.nextLine();
		r[1]=s.nextLine();
		r[2]=s.nextLine();
		r[3]=s.nextLine();
		r[4]=s.nextLine();
		n[0]=t(r[0]);
		n[1]=t(r[1]);
		n[2]=t(r[2]);
		n[3]=t(r[3]);
		n[4]=t(r[4]);
//verificando mayor
		if(n[0]>n[1]&&n[0]>n[2]&&n[0]>n[3]&&n[0]>n[4]){
			ma=n[0];
		}else if(n[1]>n[0]&&n[1]>n[2]&&n[1]>n[3]&&n[1]>n[4]){
			ma=n[1];
		}else if(n[2]>n[0]&&n[2]>n[1]&&n[2]>n[3]&&n[2]>n[4]){
			ma=n[2];
		}else if(n[3]>n[0]&&n[3]>n[2]&&n[3]>n[1]&&n[3]>n[4]){
			ma=n[3];
		}else if(n[4]>n[0]&&n[4]>n[2]&&n[4]>n[3]&&n[4]>n[1]){
			ma=n[4];
		}
//verificando menor
		if(n[0]<n[1]&&n[0]<n[2]&&n[0]<n[3]&&n[0]<n[4]){
			me=n[0];
		}else if(n[1]<n[0]&&n[1]<n[2]&&n[1]<n[3]&&n[1]<n[4]){
			me=n[1];
		}else if(n[2]<n[0]&&n[2]<n[1]&&n[2]<n[3]&&n[2]<n[4]){
			me=n[2];
		}else if(n[3]<n[0]&&n[3]<n[2]&&n[3]<n[1]&&n[3]<n[4]){
			me=n[3];
		}else if(n[4]<n[0]&&n[4]<n[2]&&n[4]<n[3]&&n[4]<n[1]){
			me=n[4];
		}
		
//imrpimiendo mayor y menor en numeros --- borrar
		System.out.println("El mayor es: "+letras(ma));
		System.out.println("El menor es: "+letras(me));
	}
	
	public static int t(String r){
		switch (r){
		case "I":
			return 1;
		case "II":
			return 2;
		case "III":
			return 3;
		case "IV":
			return 4;
		case "V":
			return 5;
		case "VI":
			return 6;
		case "VII":
			return 7;
		case "VIII":
			return 8;
		case "IX":
			return 9;
		case "X":
			return 10;
		case "XI":
			return 11;
		case "XII":
			return 12;
		case "XIII":
			return 13;
		case "XIV":
			return 14;
		case "XV":
			return 15;
		case "XVI":
			return 16;
		case "XVII":
			return 17;
		case "XVIII":
			return 18;
		case "XIX":
			return 19;
		case "XX":
			return 20;
		case "XXI":
			return 21;
		case "XXII":
			return 22;
		case "XXIII":
			return 23;
		case "XXIV":
			return 24;
		case "XXV":
			return 25;
		case "XXVI":
			return 26;
		case "XXVII":
			return 27;
		case "XXVIII":
			return 28;
		case "XXIX":
			return 29;
		case "XXX":
			return 30;
		case "XXXI":
			return 31;
		case "XXXII":
			return 32;
		case "XXXIII":
			return 33;
		case "XXXIV":
			return 34;
		case "XXXV":
			return 35;
		case "XXXVI":
			return 36;
		case "XXXVII":
			return 37;
		case "XXXVIII":
			return 38;
		case "XXXIX":
			return 39;
		case "XL":
			return 40;
		case "XLI":
			return 41;
		case "XLII":
			return 42;
		case "XLIII":
			return 43;
		case "XLIV":
			return 44;
		case "XLV":
			return 45;
		case "XLVI":
			return 46;
		case "XLVII":
			return 47;
		case "XLVIII":
			return 48;
		case "XLIX":
			return 49;
		case "L":
			return 50;
		case "LI":
			return 51;
		case "LII":
			return 52;
		case "LIII":
			return 53;
		case "LIV":
			return 54;
		case "LV":
			return 55;
		case "LVI":
			return 56;
		case "LVII":
			return 57;
		case "LVIII":
			return 58;
		case "LIX":
			return 59;
		case "LX":
			return 60;
		case "LXI":
			return 61;
		case "LXII":
			return 62;
		case "LXIII":
			return 63;
		case "LXIV":
			return 64;
		case "LXV":
			return 65;
		case "LXVI":
			return 66;
		case "LXVII":
			return 67;
		case "LXVIII":
			return 68;
		case "LXIX":
			return 69;
		case "LXX":
			return 70;
		case "LXXI":
			return 71;
		case "LXXII":
			return 72;
		case "LXXIII":
			return 73;
		case "LXXIV":
			return 74;
		case "LXXV":
			return 75;
		case "LXXVI":
			return 76;
		case "LXXVII":
			return 77;
		case "LXXVIII":
			return 78;
		case "LXXIX":
			return 79;
		case "LXXX":
			return 80;
		case "LXXXI":
			return 81;
		case "LXXXII":
			return 82;
		case "LXXXIII":
			return 83;
		case "LXXXIV":
			return 84;
		case "LXXXV":
			return 85;
		case "LXXXVI":
			return 86;
		case "LXXXVII":
			return 87;
		case "LXXXVIII":
			return 88;
		case "LXXXIX":
			return 89;
		case "XC":
			return 90;
		case "XCI":
			return 91;
		case "XCII":
			return 92;
		case "XCIII":
			return 93;
		case "XCIV":
			return 94;
		case "XCV":
			return 95;
		case "XCVI":
			return 96;
		case "XCVII":
			return 97;
		case "XCVIII":
			return 98;
		case "XCIX":
			return 99;
		case "C":
			return 100;
		
		}
		return 0;
	}
	
	public static String letras(int a){
		switch (a){
		case 1:
			return "uno";
		case 2:
			return "dos";
		case 3:
			return "tres";
		case 4:
			return "cuatro";
		case 5:
			return "cinco";
		case 6:
			return "seis";
		case 7:
			return "siete";
		case 8:
			return "ocho";
		case 9:
			return "nueve";
		case 10:
			return "diez";
		case 11:
			return "once";
		case 12:
			return "doce";
		case 13:
			return "trece";
		case 14:
			return "catorce";
		case 15:
			return "quince";
		case 16:
			return "dieciseis";
		case 17:
			return "diesisiete";
		case 18:
			return "diesiocho";
		case 19:
			return "diesinueve";
		case 20:
			return "veninte";
		case 21:
			return "veintiuno";
		case 22:
			return "veintidos";
		case 23:
			return "veintitres";
		case 24:
			return "veinticuatro";
		case 25:
			return "veinticinco";
		case 26:
			return "veintiseis";
		case 27:
			return "veintisiete";
		case 28:
			return "veintiocho";
		case 29:
			return "veintinueve";
		case 30:
			return "treinta";
		case 31:
			return "treinta y uno";
		case 32:
			return "treinta y dos";
		case 33:
			return "treinta y tres";
		case 34:
			return "treitna y cuatro";
		case 35:
			return "treinta y cinco";
		case 36:
			return "treinta y seis";
		case 37:
			return "treinta y siete";
		case 38:
			return "treinta y ocho";
		case 39:
			return "treinta y nueve";
		case 40:
			return "cuarenta";
		case 41:
			return "cuarenta y uno";
		case 42:
			return "cuarenta y dos";
		case 43:
			return "cuarenta y tres";
		case 44:
			return "cuarenta y cuatro";
		case 45:
			return "cuarenta y cinco";
		case 46:
			return "cuarenta y seis";
		case 47:
			return "cuarenta y siete";
		case 48:
			return "cuarenta y ocho";
		case 49:
			return "cuarenta y nueve";
		case 50:
			return "cincuenta";
		case 51:
			return "cincuenta y uno";
		case 52:
			return "cincuenta y dos";
		case 53:
			return "cincuenta y tres";
		case 54:
			return "cincuenta y cuatro";
		case 55:
			return "cincuenta y cinco";
		case 56:
			return "cincuenta y seis";
		case 57:
			return "cincuenta y siete";
		case 58:
			return "cincuenta y ocho";
		case 59:
			return "cincuenta y nueve";
		case 60:
			return "sesenta";
		case 61:
			return "sesenta y uno";
		case 62:
			return "sesenta y dos";
		case 63:
			return "sesenta y tres";
		case 64:
			return "sesenta y cuatro";
		case 65:
			return "sesenta y cinco";
		case 66:
			return "sesenta y seis";
		case 67:
			return "sesenta y siete";
		case 68:
			return "sesenta y ocho";
		case 69:
			return "sesenta y nueve";
		case 70:
			return "setenta";
		case 71:
			return "setenta y uno";
		case 72:
			return "setenta y dos";
		case 73:
			return "setenta y tres";
		case 74:
			return "setenta y cuatro";
		case 75:
			return "setenta y cinco";
		case 76:
			return "setenta y seis";
		case 77:
			return "setenta y siete";
		case 78:
			return "setenta y ocho";
		case 79:
			return "setenta y nueve";
		case 80:
			return "ochenta";
		case 81:
			return "ochenta y uno";
		case 82:
			return "ochenta y dos";
		case 83:
			return "ochenta y tres";
		case 84:
			return "ochenta y cuatro";
		case 85:
			return "ochenta y cinco";
		case 86:
			return "ochenta y seis";
		case 87:
			return "ochenta y siete";
		case 88:
			return "ochenta y ocho";
		case 89:
			return "ochenta y nueve";
		case 90:
			return "noventa";
		case 91:
			return "noventa y uno";
		case 92:
			return "noventa y dos";
		case 93:
			return "noventa y tres";
		case 94:
			return "noventa y cuatro";
		case 95:
			return "noventa y cinco";
		case 96:
			return "noventa y seis";
		case 97:
			return "noventa y siete";
		case 98:
			return "noventa y ocho";
		case 99:
			return "noventa y nueve";
		case 100:
			return "cien";
		}
		return "";
	}
	
}
