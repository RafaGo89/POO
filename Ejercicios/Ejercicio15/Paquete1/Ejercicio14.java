package Paquete1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Creamos un objeto scanner para leer desde teclado
        Scanner entrada = new Scanner(System.in);

        // Creamos un objeto tipo circulo
        Circulo c1 = new Circulo();

        // Ingresamos su radio
        System.out.print("Ingrese el radio del circulo: ");
        c1.setRadio(entrada.nextDouble());

        // Calculamos el área del circulo
        System.out.println("\nEl área del circulo es: " + c1.calcularArea(c1.getRadio()));

        // Creamos un objeto tipo cuadrado
        Cuadrado cua1 = new Cuadrado();

        // Ingresamos la medida de su lado
        System.out.print("\nIngrese la medida del lado del cuadrado: ");
        cua1.setLado(entrada.nextDouble());

        // Calculamos el área del cuadrado
        System.out.println("El área del cuadrado es: " + cua1.calcularArea(cua1.getLado()));

        
    }
}
