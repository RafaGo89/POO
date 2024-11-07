package mx.udg.cucea.polimorfismo;

public class Gato extends Animal{
    // Aributos
    private String sonido;
    
    // Métodos
    
    // Constructor
    public Gato(String sonido, int edad, double peso, String genero) {
        super(edad, peso, genero);
        this.sonido = sonido;
        System.out.println("Eu sou um gato");
    }
    
    // Método sobreescrito para hacer un sonido
    @Override
    public String hacerSonido(){
        return sonido;
    }
    
    // Método del gato que puede hacer otro sonido
    public String hacerSonido(String otroSonido){
        return otroSonido;
    }
    
} // Clase gato
