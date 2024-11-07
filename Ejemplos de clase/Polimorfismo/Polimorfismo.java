package mx.udg.cucea.polimorfismo;

public class Polimorfismo {
    // Atributos
    
    // Métodos
    public void crearAnimal(Animal animal){
        System.out.println("Tengo " + animal.getEdad() + " anios y peso " 
                + animal.getPeso() + " Kg. Soy " + animal.getGenero()
                + " y hago " + animal.hacerSonido());
    }

    public static void main(String[] args) {
        Perro pug = new Perro("Gua gua gua...", 3, 12, "Macho");
        
        System.out.println(pug.hacerSonido());
        
        System.out.println();
        
        Polimorfismo e = new Polimorfismo();
        e.crearAnimal(new Perro("Uuuf, uff", 10, 13.5, "Hembra"));
        e.crearAnimal(new Gato("Miaauuu", 5, 15, "Machp"));
    } // Main
    
} // Clase Polimorfismo
