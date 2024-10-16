// Programación orientada a objetos
// Switch
// By: Rafael Rodríguez Gómez

// Importamos el scanner
import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args){
        // Crear un objeto tipo scanner
        Scanner entrada = new Scanner(System.in);

        // String nombre = entrada.nextLine();
        // nextInt()
        // nextDouble()
        // nextBoolean()
        // next().chartAt(0)

        // Variables
        String nombre;
        int operacion;
        double num1, num2;

        /*
        System.out.print("Introduce tu nombre: ");
        // Entrada de datos
        nombre = entrada.nextLine();

        System.out.println("\nTu nombre es " +  nombre);
        */

        System.out.println("\nSUMA..................... [1]");
        System.out.println("RESTA.................... [2]");
        System.out.println("MULTIPLICACION........... [3]");

        System.out.print("\nIntroduce una operacion a realizar: ");
        operacion = entrada.nextInt();

        System.out.print("\nIntroduce valor 1: ");
        num1 = entrada.nextDouble();

        System.out.print("\nIntroduce valor 2: ");
        num2 = entrada.nextDouble();

        switch(operacion){
            case 1:
                System.out.print("\n*La suma es: " + (num1 + num2) );
            break;

            case 2:
                System.out.print("\n*La resta es: " + (num1 - num2) );
            break;

            case 3:
                System.out.print("\n*La multiplicacion es: " + (num1 * num2) );
            break;

            default:
                System.out.print("\n*Esa operacion no esta disponible");
            break;
        }

    } // main

} // clase pública