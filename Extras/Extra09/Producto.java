import java.util.Scanner;

public class Producto{ // Clase padre
    // Creamos objeto scanner para leer valores
    Scanner entrada = new Scanner(System.in);

    // Atributos generales
    String caducidad; // 22/12/24
    int lote;

    // Métodos

    // Método constructor
    public Producto(){
        System.out.print("\nIngrese la fecha de caducidad del producto (ej. 22/12/24): ");
        this.caducidad = entrada.nextLine();
        System.out.print("Ingrese el numero del lote del producto: ");
        this.lote = entrada.nextInt();
    } // constructor

    // Método obtener caducidad
    public String getCaducidad(){
        return caducidad;
    } // obtener caducidad

    // Método para obetener el numero de lote
    public int getLote(){
        return lote;
    } // obtener lote

    // Método para obtener la información del producto
    public void getInformacion(){
        System.out.println("\nInformación del producto");
        System.out.println("\nFecha de caducidad: " +  caducidad);
        System.out.println("Numero de lote: " + lote);
    } // obtener información
    
} // clase producto