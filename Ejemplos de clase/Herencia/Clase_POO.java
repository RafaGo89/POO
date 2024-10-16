package mx.udg.cucea.clase_poo;

import java.util.Scanner;

public class Clase_POO {

    public static void main(String[] args) {
        // Objeto 1
        Perro bulldog = new Perro();
        
        bulldog.raza = "Bulldog";
        
        bulldog.ladrar();
        bulldog.comer();
        
        // Objeto 2
        Gato persa = new Gato();
        
        persa.raza = "Persa";
        
        persa.comer();
        persa.maullar();
        
        // Evaluar objetos
        Animal animal1 = new Animal();
        System.out.println("\n");
        
        System.out.println(bulldog instanceof Animal);
        System.out.println(bulldog instanceof Object);
        System.out.println(animal1 instanceof Perro);
    } // main
} // clase publica
