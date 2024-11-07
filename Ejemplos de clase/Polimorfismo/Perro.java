package mx.udg.cucea.polimorfismo;

public class Perro extends Animal{
    // Atributos
    private String sonido;
    
    // Métodos

    // Constructor
    public Perro(String sonido, int edad, double peso, String genero) {
        super(edad, peso, genero);
        this.sonido = sonido;
        System.out.println("Eu sou um cachorrinho!");
    }

    @Override
    public String hacerSonido() {
        return sonido;
    }
    
} // clase perro
