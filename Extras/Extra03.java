// Programación orientada a objetos
// Extra03 (Crea un programa que use dos números y 
// muestre el resultado de su división. 
// Si el segundo número es 0, debe mostrar un mensaje de error.)
// By: Rafael Rodríguez Gómez

public class Extra03{
    public static void main(String[] args){
        // Variables
        int num1 = 8, num2 = 4;

        if (num2 == 0){
            System.out.println("Error! No se puede dividir entre 0");
        } // if
        else{
            System.out.println("El resultado de " + num1 + " / " + num2
            + " es: " + (num1 / num2));
        } // else
    } // main
}