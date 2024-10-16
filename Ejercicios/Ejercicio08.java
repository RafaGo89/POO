// Programación Orientad a objetos
// Ejercicio08 (licencia de conducir)
// BY: Rafael Rodríguez Gómez

public class Ejercicio08{
    public static void main(String[] args){
        // Variables
        int edad = 18;
        int califiacion = 7;

        // Verificamos si la persona es mayor de edad y obtuvo calificación aprobatoria en el examen
        if (edad >= 18){
            if (califiacion >= 8){
                System.out.println("Eres mayor de edad y tu calificion del examen es aprobatoria. Por lo cual tienes tu liciencia de conducir :)");
            } // if
            else{
                System.out.println("Eres mayor de edad PERO tu calificion del examen NO es aprobatoria. Por lo cual NO tienes tu liciencia de conducir :(");
            }
        } // if
        else{
            System.out.println("Eres menor de edad, NO puedes obtener tu licencia de conducir");
        } // else
    } // main
}