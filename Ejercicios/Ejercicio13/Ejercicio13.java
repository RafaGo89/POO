// Programación orientada a objetos
// Ejercicio 13
// By: Rafael Rodríguez Gómez

package mx.udg.cucea.ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {
        // Creamos un nuevo objeto suma
        Suma miSuma = new Suma();
        
        // Ingesamos sus valores por medio de los métodos
        miSuma.obtenerValor1();
        miSuma.obtenerValor2();
        
        // Realizamos la operación requerida con el método
        miSuma.sumar();
        
        // Mostramos el resultado de la operación
        miSuma.mostrarResultado();
        
        
        // Creamos ahora un nuevo objeto resta
        Resta miResta = new Resta();
        
        // Ingesamos sus valores por medio de los métodos
        miResta.obtenerValor1();
        miResta.obtenerValor2();
        
        // Realizamos la operación requerida con el método
        miResta.restar();
        
        // Mostramos el resultado de la operación
        miResta.mostrarResultado();
    }
}
