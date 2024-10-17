package mx.udg.cucea.vehiculo;

public class Vehiculo {
        // Atributos globales de la clase padre
        String tipo;
        
        // Metodos
        
        // Constructor
        public Vehiculo(String tipo){
            this.tipo = tipo;
        } // constructor
        
        // Método para mostrar tipo de vehiculo
        public void mostrarTipo(){
            System.out.println("\nTipo de vehiculo: " + tipo);
        } // Metodo mostrarTipo
        
} // clase vehiculo

// Herencia
class Coche extends Vehiculo{
    // Atributos especificos
    int numPuertas;
    
    // Métodos
    
    // Constructor
    public Coche(int numPuertas, String tipo){
        super(tipo);
        this.numPuertas = numPuertas;
    } // constructor
    
    // Método para mostrar detalles del coche
    public void motrarDetalles(){
        mostrarTipo();
        System.out.println("Numero de puertas: " + numPuertas);
    } // metodo mostrarDetalles
} // clase coche

class Motocicleta extends Vehiculo{
    // Atributos especificos
    boolean sidecar;
    
    // Métodos
    
    // Método constructor Constructor
    public Motocicleta(boolean sidecar, String tipo) {
        super(tipo);
        this.sidecar = sidecar;
        
    } // constructor
    
    // Método para mostrar detalles del coche
    public void motrarDetalles(){
        mostrarTipo();
        System.out.println("Cuentas con sidecar? " + (sidecar ? "SI" : "NO"));
    } // metodo mostrarDetalles
    
} // clase motocicleta

class Avion extends Vehiculo{
    // Atributos especificos
    int capacidad;
    
    // Metodo constructor
    public Avion(int capacidad, String tipo) {
        super(tipo);
        this.capacidad = capacidad;
    } // constructor
    
    // Método para mostrar detalles del coche
    public void motrarDetalles(){
        mostrarTipo();
        System.out.println("Capacidad de pasajeros: " + capacidad);
    } // metodo mostrarDetalles
} // clase Avion


