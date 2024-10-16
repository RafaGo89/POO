package mx.udg.cucea.Persona;

import java.util.Scanner;

public class Persona {
    // Objeto scanner para leer valores
    Scanner entrada = new Scanner(System.in);
    
    // Atributos
    String nombre;
    int edad;
    
    // Métodos
    
    // Método constructor
    public Persona(){
        System.out.print("\nIngresa el nombre de la persona: ");
        this.nombre = entrada.nextLine();
        System.out.print("Ingresa la edad de la persona: ");
        this.edad = entrada.nextInt();
    } // constructor
    
    // Método para mostrar los datos de la persona
    public void mostrarDatos(){
        System.out.println("\n" + "Soy "+ nombre + " y tengo " + edad + " años");
    }
}
