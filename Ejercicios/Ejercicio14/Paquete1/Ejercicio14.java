// Programación orientada a objetos
// Ejercicio14 (encapsulamiento)
// By: Rafael Rodríguez Gómez

package Paquete1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Creamos objeto scanner para leer valores
        Scanner entrada = new Scanner(System.in);

        // Creamos un objeto tipo persona
        Persona p1 = new Persona();

        // Rellenamos sus atributos
        System.out.print("Ingrese el nombre de la persona: ");
        p1.setNombre(entrada.nextLine());

        System.out.print("Ingrese la edad de la persona: ");
        p1.setEdad(entrada.nextInt());

        entrada.nextLine(); // Limpiamos el buffer
        System.out.print("Ingrese la dirección de la persona: ");
        p1.setDireccion(entrada.nextLine());

        // Mostramos sus atributos
        System.out.println("\nNombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Dirección: " + p1.getDireccion());

        // Creamos un segundo objeto tipo persona
        Persona p2 = new Persona();

        // Rellenamos sus atributos sin pedirlos al usuario
        p2.setNombre("Rafa");
        p2.setEdad(21);
        p2.setDireccion("Andador capulin");

        // Mostramos sus atributos
        System.out.println("\nNombre: " + p2.getNombre());
        System.out.println("Edad: " + p2.getEdad());
        System.out.println("Dirección: " + p2.getDireccion());
    }
}
