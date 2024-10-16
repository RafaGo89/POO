import java.util.Scanner;

public class ProductoFresco extends Producto{
    // Creamos objeto scanner para leer valores
    Scanner entrada = new Scanner(System.in);

    // Atributos especificos
    String fechaEnvasado; // 22/12/20
    String paisOrigen;

    // Constructor

    // Método constructor
    public ProductoFresco(){
        System.out.print("Ingrese la fecha de envasado del producto (ej. 22/12/24): ");
        this.fechaEnvasado = entrada.nextLine();
        System.out.print("Ingrese el pais de origen del producto: ");
        this.paisOrigen = entrada.nextLine();
    } // constructor

    // Método obtener fecha envasado
    public String getFechaEnvasado(){
        return fechaEnvasado;
    } // obtener fecha envasado

    // Método obtener caducidad
    public String getPaisOrigen(){
        return paisOrigen;
    } // obtener pais de origen

    // Método para obtener la información del producto
    @Override // sobreescribimos el método
    public void getInformacion(){
        System.out.println("\nInformación del producto fresco");
        System.out.println("\nFecha de caducidad: " +  caducidad);
        System.out.println("Numero de lote: " + lote);
        System.out.println("Fecha de envasado: " +  fechaEnvasado);
        System.out.println("Pais de origen: " + paisOrigen);
    } // obtener información

} // clase productoFresco
