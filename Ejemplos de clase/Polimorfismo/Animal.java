package mx.udg.cucea.polimorfismo;

public class Animal {
    // Atributos
    private int edad;
    private double peso;
    private String genero;
    
    // Métodos
    
    // Constructor
    Animal(int edad, double peso, String genero){
        this.edad = edad;
        this.peso = peso;
        this.genero = genero;
    } 

    // Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getters
    public double getPeso() {
        return peso;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
    
    // Método para hacer sonido
    public String hacerSonido(){
        return "Esta haciendo un tipo de sonido";
    }
    
    // Método de comer del animal
    public void comer(){
        System.out.println("Esta comiendo");
    }
    
    // Método de desplazamiento del animal
    public void desplazarse(){
        System.out.println("Esta despplazandose");
    }
    
} // Clase animal
