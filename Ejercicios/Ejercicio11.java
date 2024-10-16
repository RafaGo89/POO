// Programación orientada a objetos
// Ejercicio 11 (factorial)
// By: Rafael Rodríguez Gómez

import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){
        //Creamos un objeto scanner
        Scanner entrada = new Scanner(System.in);

        // Variables
        int numero, factorial;
        char respuesta = 'n';

        do{
            // Solicitamos el número para obtener el factorial
            System.out.print("\nDe que numero quieres el factorial? ");
            numero = entrada.nextInt();

            // Igualamos factorial al número solicitado
            factorial = numero;

            for(int pivote = numero - 1; pivote > 0; pivote--){
                //Multiplicamos el número por el pivote, que siempre incia como el número menos 1 y
                // seva decrementando de 1 en 1
                factorial = factorial * pivote;
            }

            System.out.print("\n--El factorial de "+ numero + " es: " + factorial);

            System.out.print("\n\nQuieres obtener otro factorial y/n? ");
            respuesta = entrada.next().charAt(0);
        
        } while (respuesta == 'y' || respuesta == 'Y'); // WHILE

    } // MAIN
} // CLASE PÚBLICA