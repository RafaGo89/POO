package mx.udg.cucea.poo;
import java.util.InputMismatchException; 
import java.util.Scanner; 

public class Excepciones {
    public static void main(String[] args) {
        
        // Crear el objeto 
        EjemploExcepciones ejemplo = new EjemploExcepciones(); 
    } // main 
} // Clase

class EjemploExcepciones {
    Scanner input = new Scanner(System.in); 

    public EjemploExcepciones() {
        try{
            System.out.print("Ingresa el numerador: ");
            int numerador = input.nextInt(); 
            System.out.print("Ingresa el denominador: ");
            int denominador = input.nextInt();
        
            // Realizar la operacion 
            int resultado = numerador / denominador; 
            System.out.println("El resultado es igual a: " + resultado);
            
        // Excepciones para controlar los errores     
        }
        catch(ArithmeticException e){
            System.out.println("Error!, no puedes dividir por 0");
        }
        catch(InputMismatchException e){
            System.out.println("Error!, solamente puedes ingresar numeros enteros");
        }
        catch(Exception e){
            // Capturar cualquier tipo de excepcion 
            System.out.println("Ocurrio un error inesperado: " + e.getMessage());  // e.getMessage: Te dice cual fue el problema
        }
        finally{
            System.out.println("El bloque finally se ejecuta siempre");
            // Cerrar el Scanner - Liberar recursos 
            input.close();
        } // finally 
        
        // Revisar si el Scanner ya se cerró 
        try{
            System.out.print("Tratando de usar el Scanner...");
            input.nextLine(); 
        }
        catch(IllegalStateException e){
            System.out.println("Error! Scanner ya se cerró");
        }
        finally{
            System.out.println("Para que no se te olvide, este bloque se ejecuta SIEMPRE!");
        } // finally 
    }// Constructor 
    
}// Clase --> Ejemplo Excpciones
