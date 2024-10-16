// Programación orientada a objetos
// Ciclo FOR
// By: Rafael Rodríguez Gómez

public class CicloFor{
    public static void main(String[] args){

        /* 
        for(int i = 1; i <= 10; i++){
            System.out.println("*Tabla del " + i + ": ");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (j * i));
            } // FOR
            System.out.print("\n");
        } // FOR
        */
        
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                continue; // no rompe el ciclo, pero si la iteración
            }  // IF
            System.out.println(i);
        }  //FOR

    } // main
} // clase pública