// Programación orientada a objetos
// Extra04 (área de un triángulo)
// By Rafael Rodríguez Gómez

import java.util.Scanner;

public class Extra04{
    public static void main(String[] args){
        // Creamos nuestro objeto tipo Scanner para leer valores de teclado
        Scanner entrada = new Scanner(System.in);

        // Variables
        float base = 0f, altura = 0.f, area = 0f;

        System.out.println("\t\t--Calculo del area de un triangulo--");

        // Solicitiamos los valores al usuario
        System.out.print("\nIngrese la altura del triangulo: ");
        altura = entrada.nextFloat();

        System.out.print("\nIngrese la base del triangulo: ");
        base = entrada.nextFloat();

        // Calculamos el area del triangulo
        area = (base * altura) / 2;

        // Mostramos el valor del area del triangulo
        System.out.print("\n--El area del triangulo es: " + area);

    } // MAIN
} // CLASE PÚBLICA