// Programación orientada a objetos
// Estructuras iterativas (ciclos)
// By: Rafael Rodríguez Gómez

import java.util.Scanner;

public class Ciclos{
    public static void main(String[] args){

    // Creamos un objeto scanner
    Scanner entrada = new Scanner(System.in);
    
    // Variables
    int contador = 1, tabla = 0;

    /*
    while (expresión lógica){

    }

    do{

    } while (expresión lógica);

    for (inicialización; expresión lógica; aumento/decremento){

    }
    */

    System.out.print("Ingrese el numero de la tabla de multiplicar que desea obtener: ");
    tabla = entrada.nextInt();

    System.out.print("\nTABLA DEL " + tabla + "\n\n");

    while (contador <= 10){ // cabezera
        // instrucciones
        System.out.println(tabla + " * " + contador + " = " + (tabla * contador));
        contador++;
    } // while

    } // main
} // clase public class