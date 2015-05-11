package Ejercicio7;

public class Viaje {
	
	//Este metodo muestra la informacion de un viaje seleccionado a partir de su identificador
	public void infoViaje(int identificador) {
		Reserva res = new Reserva();
		int seleccion;
		if(identificador==1){
			System.out.println("Reservas:....");
		}else
			System.out.println("Reservas:...");
		System.out.println("Seleccione reserva:");
		seleccion=1;
		res.infoReserva(seleccion);
		Precio precio = new Precio();
		precio.calcularPrecio(1, 1, 1);
	
	}
}
