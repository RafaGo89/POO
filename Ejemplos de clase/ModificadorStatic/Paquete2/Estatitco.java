package Paquete2;

public class Estatitco {
    
    // Atributos 
    public static final double PI = 3.1416; 
    int edad;
    
    public static class ClaseInterna {
        // Metodo 
        public static int metodoInterno(int a){
            return a; 
        } // metodo interno
    } //Clase Interna
            
    // Metodo en la clase principal 
    public static int suma(int num01, int num02){
        return num01+num02; 
    } // metodo suma 

    
} // Clase principal --> Estatico 
