// Programación orientada a objetos
// Ejercicio09
// By: Rafael Rodríguez Gómez

public class Ejercicio09{
    public static void main(String[] args){
        // Variables
        int num1 = 5;
        int num2 = 4;
        int num3 = 2;

        if (num1 < num2 && num1 < num3){
            System.out.println("El número menor es: " + num1);

            if (num2 < num3){
                System.out.println("El número de enmedio es: " + num2);
                System.out.println("El número mayor es: " + num3);
            }
            else{
                System.out.println("El número de enmedio es: " + num3);
                System.out.println("El número mayor es: " + num2);
            }
        } // if
        else if (num2 < num1 && num2 < num3){
            System.out.println("El número menor es: " + num2);

            if (num1 < num3){
                System.out.println("El número de enmedio es: " + num1);
                System.out.println("El número mayor es: " + num3);
            }
            else{
                System.out.println("El número de enmedio es: " + num3);
                System.out.println("El número mayor es: " + num1);
            }
        } // else if
        else{
            System.out.println("El número menor es: " + num3);

            if (num1 < num2){
                System.out.println("El número de enmedio es: " + num1);
                System.out.println("El número mayor es: " + num2);
            }
            else{
                System.out.println("El número de enmedio es: " + num2);
                System.out.println("El número mayor es: " + num1);
            }
        } // else
    } // main
}