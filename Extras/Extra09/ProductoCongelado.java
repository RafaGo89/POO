import java.util.Scanner;

public class ProductoCongelado extends Producto{
    // Creamos objeto scanner para leer valores
    Scanner entrada = new Scanner(System.in);

    // Atributos especificos
    float tempCongelacion;

    // Métodos
    
    // Método constructor
    public ProductoCongelado(){
        super(); // llamamos al constructor padre
        System.out.print("Ingrese la temperatura de congelacion recomendada: ");
        this.tempCongelacion = entrada.nextFloat();
    } // constructor

    // Metodo para obtener la temperatura de congelación
    public float getTempCongelacion(){
        return tempCongelacion;
    } // método getTempCongelacion

    // Método para obtener la información del producto
    @Override // sobreescribimos el método
    public void getInformacion(){
        System.out.println("\nInformación del producto congelado");
        System.out.println("\nFecha de caducidad: " +  caducidad);
        System.out.println("Numero de lote: " + lote);
        System.out.println("Temperatura de congelacion recomendada: " +  tempCongelacion);
    } // obtener información

} // clase Producto Congelado