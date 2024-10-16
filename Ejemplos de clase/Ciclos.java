// Programación orientada a objetos
// Estructuras iterativas (ciclos)
// By: Rafael Rodríguez Gómez

import java.util.Scanner;

public class Ciclos{
    public static void main(String[] args){

    // Creamos un objeto scanner
    Scanner entrada = new Scanner(System.in);
    
    // Variables
    int contador, tabla = 0;
    char respuesta = 'n';

    /*
    while (expresión lógica){

    }

    do{

    } while (expresión lógica);

    for (inicialización; expresión lógica; aumento/decremento){

    }
    */

    do{
        contador = 1; // inicializar el contador

        System.out.print("\nIngrese el numero de la tabla de multiplicar que desea obtener: ");
        tabla = entrada.nextInt();

        System.out.print("\nTABLA DEL " + tabla + "\n\n");

        while (contador <= 10){ // cabezera
            // instrucciones
            System.out.println(tabla + " * " + contador + " = " + (tabla * contador));
            contador++;
        } // while

        System.out.print("\nTe gustaria continuar y/n? ");
        respuesta = entrada.next().charAt(0);

    } while (respuesta == 'y' || respuesta == 'Y');

    

    } // main
} // clase public class