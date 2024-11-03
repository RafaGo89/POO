package Paquete1;
import Paquete2.Estatitco;; 

public class EjemploEstatico {
    public static void main(String[] args) {
        
        // Crear Objeto con la clase principal estatico 
        // Primer ejemplo
        Estatitco e = new Estatitco(); 
        System.out.println(e.PI);
        System.out.println("El resultado de la suma es: " + e.suma(2, 7));
        
        System.out.println(); // Salto de linea
        // Segundo ejemplo sin instanciar 
        System.out.println(Estatitco.PI);
        System.out.println(Estatitco.suma(4, 6));
        
        System.out.println(Math.pow(2, 2));
        
        Estatitco.ClaseInterna ejemplo2 = new Estatitco.ClaseInterna();
        // Sin modificador static en el metodo
        System.out.println(ejemplo2.metodoInterno(9));
        
        // Forma directa sin instanciar a traves de un objeto 
        // Con modificador static en el metodo 
        System.out.println(Estatitco.ClaseInterna.metodoInterno(4));
    } // main 
    
} // Clase --> Ejemplo Estatico 
