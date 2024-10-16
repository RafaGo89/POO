import java.util.Scanner;

public class ProductoRefrigerado extends Producto{
    // Creamos objeto scanner para leer valores
    Scanner entrada = new Scanner(System.in);

    // Atributos especificos
    String codigoOrganismo; // código del organismo de supervisión alimentaria (ej. 891k)

    // Métodos

    // Método constructor
    public ProductoRefrigerado(){
        System.out.print("Ingrese el codigo del organismo de supervision alimentaria: ");
        this.codigoOrganismo = entrada.nextLine();
    } // constructor

    // Método para obtener el codigo del organismo
    public String getCodigoOrganismo(){
        return codigoOrganismo;
    } // método obtener codigoOrganismo

    // Método para obtener la información del producto
    @Override // sobreescribimos el método
    public void getInformacion(){
        System.out.println("\nInformación del producto refrigerado");
        System.out.println("\nFecha de caducidad: " +  caducidad);
        System.out.println("Numero de lote: " + lote);
        System.out.println("Codigo de organismo supervisor: " +  codigoOrganismo);
    } // obtener información

} // clase Productos Refrigerados
