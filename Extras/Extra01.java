// Programación orientada a objetos
// Extra01 (Realiza un programa que reciba dos números 
// e indique cuál es mayor o si son iguales)
// By: Rafael Rodríguez Gómez

public class Extra01{
    public static void main(String[] args){
        // Variables
        int num1 = 10, num2 = 9;

        // Determinos que número es mayor o si son iguales
        if (num1 > num2){
            System.out.println("El primer numero es mayor al segundo");

        } // if
        else if (num1 == num2){
            System.out.println("Los dos numeros son iguales");
        } // else if
        else{
            System.out.println("El segundo numero es mayor al primero");
        } // else
    }  // main
}