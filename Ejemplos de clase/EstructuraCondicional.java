// Programación orientada a objetos
// Estructura condicional
// By: Rafael Rodríguez Gómez

public class EstructuraCondicional{

    public static void main(String[] args){

        /* Operadores condicionales
        System.out.println("3 > 4: " + (3 > 4));
        System.out.println("3 < 4: " + (3 < 4));
        System.out.println("3 >= 4: " + (3 >= 4));
        System.out.println("3 <= 4: " + (3 <= 4));
        System.out.println("3 == 4: " + (3 == 4));
        System.out.println("3 != 4: " + (3 != 4));
        */

       // Ejemplo de estructura condicional
        int mat = 8;
        int esp = 6;
        int his = 10;
        int ing = 10;
        int prom = 10;
       

        prom = (mat + esp + his + ing) / 4;

        System.out.println("Tu promedio es de: " + prom);

        if (prom >= 8){
            System.out.println("Estás aprobad0 :)");
        } // if
        else{
            System.out.println("Estás REPROBADO >:)");
        } // else
    } // main
}