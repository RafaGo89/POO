package mx.udg.cucea.Persona;

public class PersonaMain {
    public static void main(String[] args){
        // Creamos un nuevo objeto tipo persona
        Persona rafael = new Persona();

        // Usamos el método para mostrar los datos de esa persona
        rafael.mostrarDatos(); 
        
        // Creamos una segunda persona
        Persona natalia = new Persona();
        
        // Mostramos los datos de esa nueva persona
        natalia.mostrarDatos();
    } // main
    
}  // clase publica
