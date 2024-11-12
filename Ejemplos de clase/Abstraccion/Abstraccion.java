/*
    Clases abstractas

    1- Una clase abstracta no puede ser FINAL
    2- Los métodos abstractos DEBEN SER IMPLEMENTADOS por las subclases
    3- NO se pueden crear objetos de una clase abstracta
    4- Es posible definir CONSTRUCTORES y MÉTODOS concretos STATIC
    5- Es posible definir MÉTODOS FINAL para evitar que las implementaciones sea modificadas.
    6- Los métodos abstractos NO pueden ser definido como FINAL.
*/

package mx.udg.cucea.abstraccion;

public class Abstraccion {
    
    public static void imprimirFigura(Figura a){
        System.out.println("El color de la figura es: " + a.getColor() + " y tiene un área de: " + a.calcularArea());
    }

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(2, 3, "Verde");
        
        Abstraccion a = new Abstraccion();
        
        /*
        a.imprimirFigura(new Cuadrado(5, "Morado"));
        a.imprimirFigura(new Rectangulo(5, 8, "Morado"));
        */
        
        imprimirFigura(new Rectangulo (5, 8, "Rojo"));
        Abstraccion.imprimirFigura(new Cuadrado(3, "Azul"));
    }
}
