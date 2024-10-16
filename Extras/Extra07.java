// Programación orientada a objetos
// Extra07 (triangulo con ateriscos *)
// By Rafael Rodríguez Gómez

public class Extra07{
    public static void main(String[] agrs){
        for(int i = 1; i <= 5; i++){ // ciclo para manejar las filas
            for (int j = 1; j <= i; j++){ // ciclo para manejar los asteriscos por fila
                System.out.print("*");
            } // FOR
            System.out.println(); // salto de línea
        } // FOR
    } // MAIN
} // CLASE PUBLICA