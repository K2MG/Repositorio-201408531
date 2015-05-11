package Ejercicio4;

public class Empleado {
	String DPI;
	String nombre;
	String direccion;
	String telefono;
	String fechaContratacion;
	String tipo;
	int horasE,contratos,empleados,base;
	public static void main(String[] args){
		Extras extras = new Extras();
		Base base = new Base();
		base.sueldoBase(tipo);
		extras.calcular(tipo, horasE, contratos, empleados, base.sueldoBase(tipo));
		
	}

}
