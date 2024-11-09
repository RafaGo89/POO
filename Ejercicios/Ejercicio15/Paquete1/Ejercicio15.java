// Programación orientada a objetos
// Ejercicio 15 (polimorfismo)
// BY: Rafael Rodríguez Gómez
package Paquete1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Creamos un objeto scanner para leer desde teclado
        Scanner entrada = new Scanner(System.in);

        // Creamos un objeto tipo circulo
        Circulo c1 = new Circulo();

        // Ingresamos su radio
        System.out.print("Ingrese el radio del circulo: ");
        c1.setRadio(entrada.nextDouble());

        // Calculamos el área del circulo
        System.out.println("\n*El área del circulo es: " + c1.calcularArea(c1.getRadio()));


        // Creamos un objeto tipo cuadrado
        Cuadrado cua1 = new Cuadrado();

        // Ingresamos la medida de su lado
        System.out.print("Ingrese la medida del lado del cuadrado: ");
        cua1.setLado(entrada.nextDouble());

        // Calculamos el área del cuadrado
        System.out.println("\n*El área del cuadrado es: " + cua1.calcularArea(cua1.getLado()));


        // Creamos un objeto tipo rectangulo
        Rectangulo r1 = new Rectangulo();

        // Ingresamos su base y altura
        System.out.print("Ingrese la medida de la base del rectangulo: ");
        r1.setBase(entrada.nextDouble());

        System.out.print("Ingrese la medida de la altura del rectangulo: ");
        r1.setAltura(entrada.nextDouble());

        // Calculamos el área del rectangulo
        System.out.println("\n*El área del rectangulo es: " + r1.calcularArea(r1.getBase(), r1.getAltura()));

        
        // Creamos un objeto triangulo
        Triangulo t1 = new Triangulo();

        // Ingresamos su base y altura
        System.out.print("Ingrese la medida de la base del triangulo: ");
        t1.setBase(entrada.nextDouble());

        System.out.print("Ingrese la medida de la altura del triangulo: ");
        t1.setAltura(entrada.nextDouble());

        // Calculamos el área del triangulo
        System.out.println("\n*El área del triangulo es: " + t1.calcularArea(t1.getBase(),t1.getAltura()));
    }
}
