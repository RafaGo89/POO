package mx.udg.cucea.vehiculo;

public class Principal {
    public static void main(String[] args){
        // Objeto nuevo
        Coche miCoche = new Coche(4, "Tsuru");
        
        miCoche.motrarDetalles();
        
        // Creamos otro objeto
        Motocicleta miMoto = new Motocicleta(false, "Italika");
        
        // Mostramos sus detalles con un método
        miMoto.motrarDetalles();
        
        // Objeto nuevo
        Avion miAvion = new Avion(30, "Jet");
        
        // Mostramos los detalles con el método 
        miAvion.motrarDetalles();
    } // main
} // clase principal
