package Ejercicio7;

public class Reserva {
	//este metodo muesta los alojamientos y vuelos disponibles segun la seleccion del viaje
	public void infoReserva(int seleccion) {
		Vuelo v = new Vuelo();
		Alojamiento a = new Alojamiento();
		if(seleccion==1){
			System.out.println(v.elegirVuelo(seleccion));
			System.out.println(a.elegirAlojamiento(seleccion));
		}
	
	}
}
