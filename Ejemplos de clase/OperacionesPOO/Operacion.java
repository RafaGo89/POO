package com.mycompany.objetosymetodos;

import java.util.Scanner;

public class Operacion {
    // Creamos onjetos scanner
    Scanner entrada = new Scanner(System.in);
    
    // Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    // Metodos
    
    // Método para solicitar al usuario 2 números
    public void leerNumeros(){
        System.out.print("Ingrese un número: ");
        numero1 = entrada.nextInt();
        System.out.print("Ingrese un número: ");
        numero2 = entrada.nextInt();
    } // método leerNumeros
    
    // Método para sumar los 2 números
    public void sumar(){
        suma = numero1 + numero2;
    } // método sumar
    
    // Método para restar los 2 números
    public void restar(){
        resta = numero1 - numero2;
    } // método restar
    
    // Método para multiplicar los 2 números
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    } // método multiplicar
    
    // Método para dividir los 2 números
    public void dividir(){
        division = numero1 / numero2;
    } // método sumar
    
    // Método para mostrar los resultados
    public void mostrarResultados(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación fue: " + multiplicacion);
        System.out.println("La división fue: " + division);
    }
}
