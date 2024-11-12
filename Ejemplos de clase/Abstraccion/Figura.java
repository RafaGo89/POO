package mx.udg.cucea.abstraccion;

public abstract class Figura {
    // Atributos
    private String color;
    
    // Métodos
    
    // Constructor
    public Figura(String color) {
        this.color = color;
    }
    
    // Métodos setters
    public void setColor(String color) {
        this.color = color;
    }
    
    // Métodos getters
    public String getColor() {
        return color;
    }
    
    public abstract double calcularArea();
    
} // clase figura
