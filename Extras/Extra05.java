// Programación orientada a objetos
// Extra05 (número primo)
// By Rafael Rodríguez Gómez

import java.util.Scanner;

public class Extra05{
    public static void main(String[] args){
        // Creamos nuestro objeto tipo Scanner para leer valores de teclado
        Scanner entrada = new Scanner(System.in);

        // Variables
        int numero = 0;
        boolean bandera = true;

        System.out.println("\t--Es numero primo?--");

        // Solicitamos un número al usuario
        System.out.print("\nIngrese un numero: ");
        numero = entrada.nextInt();

        if (numero <= 1){
            System.out.println("Numero no valido!"); // un número primo es mayor que 1
        } // IF
        else{
            for (int i = numero - 1; i >= 2; i--){
                // verificamos si se puede dividir entre otro número que no sea el mismo o 1
                if (numero % i == 0){
                    bandera = false; // si se divide entre otro, no es primo
                    break;
                } // IF
            } // FOR

            if (bandera == true){
                System.out.println("\n--" + numero + " es un numero primo");
            } // IF
            else{
                System.out.println("\n--" + numero + " no es un numero primo");
            } // ELSE
        } // ELSE

        

    } // MAIN
} // CLASE PÚBLICA