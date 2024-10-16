// Programación orientada a objetos
// Ejercicio07
// By: Rafael Rodríguez Gómez

public class Ejercicio07{
	public static void main(String[] args){
		// Variables
		float montoTicket = 100f;
		float propina = 0.10f;
		final float IVA = 0.16f;
		float montoTotal = 0f;

		// Mostrar subtotal sin IVA
		System.out.println("*Subtotal sin IVA: " + montoTicket);

		// Mostrar el monto de la propina (10% del monto del ticket)
		System.out.println("*Propina (del 10%): " + (montoTicket * propina));

		// Mostrar el monto del IVA (16 del monto del ticket)
		System.out.println("*IVA: " + (montoTicket * IVA));

		// Calculamos el monto total
		montoTotal = montoTicket + (montoTicket * propina) + (montoTicket * IVA);

		// Mostramos el monto total
		System.out.println("*Monto total a pagar: " + montoTotal);
	}

}

