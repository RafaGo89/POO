package mx.udg.cucea.abstraccion;

public class Cuadrado extends Figura {
   // Atributos
    private double lado;
    
    // Métodos
    
    // Método constructor
    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
        System.out.println("\nFigura---> Cuadrado");
    }

    // Método para calcular el área del cuadrado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
     
} // Clase Cuadrado
