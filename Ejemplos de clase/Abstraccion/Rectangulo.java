package mx.udg.cucea.abstraccion;

public class Rectangulo extends Figura{
    // Atributos
    private double base;
    private double altura;
    
    // Métodos
    
    // Método constructor
    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
        System.out.println("\nFigura---> Rectangulo");
    }
    
    // Método para calcula el área del rectangulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
} // Clase rectangulo
