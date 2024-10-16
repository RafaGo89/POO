// Programación orientada a objetos
// Extra08 (10 números)
// By Rafael Rodríguez Gómez

import java.util.Scanner;

public class Extra08{
    public static void main(String[] args){
        // Creamos un objeto scanner para leer datos del teclado
        Scanner entrada = new Scanner(System.in);

        // Variables
        short[] numeros = new short[10];
        short  min, max;
        float promedio = 0f;
        int suma  = 0;

        System.out.println("\t\t--Hora de ingresar 10 numeros--\n");

        // Solicitamos los 10 números
        for(short i = 0; i <= 9; i++){
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            numeros[i] = entrada.nextShort();
            System.out.println(); // Salto de línea
        } // FOR

        // Suponemos que el primero número del arreglo es el mayor y menor
        // para posteriormente hacer las comparaciones
        min = numeros[0];
        max = numeros[0];

        // Mostramos los números ingresados
        System.out.print("-Los numeros ingresados fueron: ");

        for(short i = 0; i<= 9; i++){
            System.out.print(numeros[i] + ", ");
            suma = suma + numeros[i];  // suma de los 10 números

            if (numeros[i] < min){
                min = numeros[i];
            } // if numero menor

            if(numeros[i] > max){
                max = numeros[i];
            } // if numero mayor
        } // FOR

        // Calculo del promedio de los 10 números
        promedio = suma;
        promedio = promedio / 10;

        // Mostramos los resultados
        System.out.println("\n\n*La suma de los 10 numeros es: " + suma);

        System.out.println("*El promedio de los 10 numeros es: " + promedio);

        System.out.println("*El numero menor de esos 10 numeros es: " + min);

        System.out.println("*El numero mayor de esos 10 numeros es: " + max);

    } // MAIN
} // CLASE PUBLICA 