// Programación orientada a objetos
// Operadores
// By: Rafael Rodríguez Gómez

public class Operadores{
	public static void main(String[] args){
		
		// Variables
		int num1 = 3;
		int num2 = 7;	
		int resultado;
	
		// Suma
		resultado = num1 + num2;
		System.out.println("\nEl resultado de la suma es: " + resultado);	

		// Resta
		resultado = num1 - num2;
		System.out.println("El resultado de la resta es: " + resultado);

		// Multiplicación
		resultado = num1 * num2;
		System.out.println("El resultado de la multiplicación es: " + resultado);

		// División entera
		resultado = num1 / num2;
		System.out.println("El resultado de la división entera es: " + resultado);

		// Módulo
		resultado = num1 % num2;
		System.out.println("El resultado del resido de la división es: " + resultado);

		// Prioridad de signos
		resultado = 6 + 5 - 3 * 11 / 6 + (4 + 4);
		System.out.println("Priorizando signos: " + resultado);

		// Potencia
		resultado = (int)(Math.pow(num1, num2));
		System.out.println("3 a la septima potencia: " + resultado);
	}
}