package mx.udg.cucea.modificadoresdeacceso.paquete2;

public class Defecto {
    public static void main(String[] args) {
        EjemploDefault e = new EjemploDefault();
        
       e.nombre = "Chicharito";
       e.foo();
    }
}

class EjemploDefault{
    String nombre;
    
    void foo(){
        System.out.println("Soy " + nombre + " y soy un método por defecto");
    }
}