// Programación orientada a objetos
// Condicional compuesta (calculadora)
// By: Rafael Rodríguez Gómez

public class CondicionalCompuesta{
    public static void main(String[] args){
        // Variables
        int operación = 0;
        float num1 = 9f, num2 = 4f;
        float resultado = 0f;

        if (operación == 1){ // suma
            resultado = num1 + num2;
            System.out.println("El resultado de tu suma es: " + resultado);
        }
        else if (operación == 2){ // resta
            resultado = num1 - num2;
            System.out.println("El resultado de tu resta es: " + resultado);
        }
        else if (operación == 3){ // multiplicación
            resultado = num1 * num2;
            System.out.println("El resultado de tu multiplicacion es: " + resultado);
        }
        else if (operación == 4){ // división
            resultado = num1 / num2;
            System.out.println("El resultado de tu division es: " + resultado);
        }
        else{ // no existe la operación
            System.out.println("No existe esa operacion!");
        }
        

    } // main 
}