// Programación orientada a objetos
// Ejercicio14 (encapsulamiento)
// By: Rafael Rodríguez Gómez

package Paquete1;

public class Persona{
    // Atributos
    private String nombre;
    private int edad;
    private String direccion;

    // Métodos

    // Método para validar la edad (entr 1 y 120 años)
    private boolean validarEdad(int edad){
        if (edad >= 1 && edad <= 120){
            return true;
        }
        else{
            return false;
        }
    }

    // Métodos setters

    // Método para establecer el nombre de la persona
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Método para establecer la edad de la persona
    public void setEdad(int edad){
        if (validarEdad(edad) == true){
            this.edad = edad;
        }
        else{
            System.out.println("\n¡Edad ingresada no válida! Debe estar entre 1 y 120 años\n");
            this.edad = 18; // Si la edad no es válidad, establecemos una por defecto
        }
    }

    // Método para establecer la direccion de la persona
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    // Métodos getters

    // Método para devolver el nombre de la persona
    public String getNombre(){
        return nombre;
    }

    // Método para devolver la edad de la persona
    public int getEdad(){
        return edad;
    }

    // Método para devolver la direccion de la persona
    public String getDireccion(){
        return direccion;
    }
} // Clase persona