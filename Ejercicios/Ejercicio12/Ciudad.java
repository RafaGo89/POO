package mx.udg.cucea.ejercicio12;

import java.util.Scanner;

public class Ciudad {
    // Creamos objeto Scanner para leer datos
    Scanner entrada = new Scanner(System.in);
    
    // Atributos
    String nombreCiudad;
    double temp;
    
    // Métodos
    
    // Método constructor
    public Ciudad(){
        System.out.print("Ingrese el nombre de la ciudad: ");
        this.nombreCiudad = entrada.nextLine();
        System.out.print("Ingrese la temperatura actual de la ciudad: ");
        this.temp = entrada.nextDouble();
    } // método constructor
    
    // Método mostrar datos
    public void mostrarDatos(){
        System.out.println("\n*La ciudad " + nombreCiudad + " tiene un temperatura actual de " + temp + " grados C°");
    } // método mostrarDatos
    
    public void clima(){
        if(temp > 25){
            System.out.println("\n*La temperatura de " + nombreCiudad + " es cálida");
        } // if
        else if(temp <= 15){
            System.out.println("\n*La temperatura de " + nombreCiudad + " es fría");   
        }
        else{
            System.out.println("\n*La temperatura de " + nombreCiudad + " es templada");
        }
    } // método tipoTemperatura
    
}  // clase Ciudad
