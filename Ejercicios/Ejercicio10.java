// Programación orientada a objetos
// Ejercicio 10 (tablas)
// By: Rafael Rodríguez Gómez

import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){

    // Creamos un objeto scanner
    Scanner entrada = new Scanner(System.in);
    
    // Variables
    int contador, tabla = 0;
    char respuesta = 'n';

    do{
        contador = 1; // inicializar el contador

        System.out.print("\nIngrese el numero de la tabla de multiplicar que desea obtener: ");
        tabla = entrada.nextInt();

        System.out.print("\nTABLA DEL " + tabla + "\n\n");

        while (contador <= 10){ // cabecera
            // instrucciones
            System.out.println(tabla + " * " + contador + " = " + (tabla * contador));
            contador++;
        } // while

        System.out.print("\nTe gustaria continuar y/n? ");
        respuesta = entrada.next().charAt(0);

    } while (respuesta == 'y' || respuesta == 'Y');

    } // main
} // clase public class