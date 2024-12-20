package paquete2;

import paquete1.EjemploDefault;

import java.util.Scanner;

public class Privado extends EjemploDefault{
    public static void main(String[] args){
        EjemploPrivado e = new EjemploPrivado();
        
        Privado objeto = new Privado();

        objeto.nombre = "Rafa";

        System.out.println("\nAtributo heradado: " + objeto.nombre);

        objeto.foo();

    } // main
} //clase Privado


class EjemploPrivado{
    public Scanner entrada = new Scanner(System.in);
    
    // Atributos
    private String nombre;
    private String numero;
    
    // Métodos
    
    EjemploPrivado(){
        System.out.print("Introduce un numero: ");
        numero = entrada.nextLine();
        if(esNumero(numero)){
            // Casteamos la cadena a valor numerico
            double nuevoValor = Double.parseDouble(numero);
            System.out.println("Has introducido un numero " + nuevoValor);
        } // if
        else{
            System.out.println("Error! Solo se permiten valores numericos");
        } // else
        
    } // constructor
    
    public void foo(){
        System.out.println("Mi nombre es " + nombre + " y soy privado");
    }
    
    private boolean esNumero(String cadena){
        // Expresion regular para validar que la variable es un numero
        return cadena.matches("-?\\d+(\\.\\d+)?");
    } // método esNumero
    
} // clase EjemploPrivado
