/* 
Programación Orientada a Objetos
Extra 09
Se plantea desarrollar un programa Java que permita la gestión 
de una empresa agroalimentaria que trabaja con tres tipos de productos: 
productos frescos, productos refrigerados y productos congelados. 
Todos los productos llevan esta información común: fecha de caducidad 
y número de lote. 
By: Rafael Rodríguez Gómez
*/

public class EmpresaAgro {
    public static void main(String[] args){
        // Creamos un nuevo objeto tipo Producto
        Producto lata = new Producto();
        
        // Usamos los métodos get para mostrar sus atributos
        System.out.println("\nFecha de caducidad del objeto 1: " + lata.getCaducidad()); 
        System.out.println("Numero de lote del objeto 1: " + lata.getLote());

        // Creamos un objeto producto fresco
        ProductoFresco leche = new ProductoFresco();

        // Usamos el método para mostrar su información
        leche.getInformacion(); 

        // Creamos un nuevo producto refrigerado
        ProductoRefrigerado crema = new ProductoRefrigerado();

        // Usamos el método para mostrar su información
        crema.getInformacion();

        // Creamos un nuevo producto congelado
        ProductoCongelado hielo = new ProductoCongelado();

        // Obtenemos sus datos con los métodos get
        System.out.println("\nFecha de caducidad del objeto 4: " + hielo.getCaducidad()); 
        System.out.println("Numero de lote del objeto 4: " + hielo.getLote());
        System.out.println("Fecha de caducidad del objeto 4: " + hielo.getTempCongelacion()); 

    } // main
} // clase pública
