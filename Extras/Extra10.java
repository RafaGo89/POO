// Programación Orientada a objetos
// Extra10 (Capturar excepciones al acceder a un arreglo)
// By: Rafael Rodríguez Gómez

import java.util.InputMismatchException;
import java.util.Scanner;

public class Extra10{
    public static void main(String[] args) {
        // Creamos un objeto scanner para leer valores del teclado
        Scanner entrada = new Scanner(System.in);

        // Definimos el arreglo de números enteros
        int[] arreglo = {4, 9, 10, 21, 19};

        // Variable donde guardar repuesta del usuario
        int opcion;

        try{ // bloque de código donde puede secueder un excepción
            System.out.print("Ingrese el indice del arreglo para ver que valor contiene: ");
            opcion = entrada.nextInt();

            System.out.println("\nEl valor del indice en el arreglo " + opcion + " es: " + arreglo[opcion]);
        }
        catch(InputMismatchException e){ // Catch para atrapar excepciones
            System.out.println("\nError! Solo se pueden ingresar numeros enteros");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nError! Valor ingresado fuera de los límites del arreglo");
        }
        catch(Exception e){
            System.out.println("Ocurrio un error inesperado " + e.getMessage());
        }
    }
} // clase Extra10