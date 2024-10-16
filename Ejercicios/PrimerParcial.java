// Programación orientada a objetos
// Examen (invertir cadena de caracteres)
// By:Rafael Rodríguez Gómez

import java.util.Scanner;

public class PrimerParcial{
    public static void main(String[] args){
        // Creamos un objeto tipo Scanner para leer desde teclado
        Scanner entrada = new Scanner(System.in);

        // Variables
        String cadena, invertida;
        int tamanio = 3;

        do{
            invertida = ""; // incializamos la cadena
            // Solicitar la cadena de caracteres al usuario
            System.out.print("\nIntroduce una cadena de caracteres: ");
            cadena = entrada.nextLine();

            // guardamos el tamaño de la cadena
            tamanio = cadena.length();

            if(tamanio >= 2 && tamanio <= 20){ // Verificar tamaño de cadena
                for(int i = tamanio - 1; i >= 0; i--){
                    invertida = invertida + cadena.charAt(i);
                } // for

                System.out.print("\n*La cadena invertida es: " + invertida + " contiene " + tamanio + " caracteres");
            } // if
            else{
                System.out.print("\n***Solo funciona con cadenas de entre 2 y 20 caracteres!***");
            }
        } while(tamanio >= 2 && tamanio <= 20); // Verificar tamaño de cadena

    } // main
} // clase pública