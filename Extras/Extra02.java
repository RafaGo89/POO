// Programación orientada a objetos
// Extra02 (Realiza un programa que pida un número
// y nos indique si es par o impar)
// By: Rafael Rodríguez Gómez

public class Extra02{
    public static void main(String[] args){
        // Variables
        int num = 12;

        // Determinamos si el número es par o no
        if (num % 2 == 0){
            System.out.println(num + " es numero par");
        } // if
        else{
            System.out.println(num + " es numero impar");
        } // else
    }
}