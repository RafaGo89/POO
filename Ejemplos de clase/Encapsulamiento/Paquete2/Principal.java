package Paquete2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Creamos objeto Scanner para leer datos
        Scanner entrada = new Scanner(System.in);

        // Creamos un nuevo estudiante
        Estudiante juan = new Estudiante();

        // Establecemos los valores del nuevo estudiante
        System.out.print("Ingrese el nombre de estudiante: ");
        juan.setNombre(entrada.nextLine());

        System.out.print("Ingrese el apellido del estudiante: ");
        juan.setApellido(entrada.nextLine());

        System.out.print("Ingrese el ID del estudiante: ");
        juan.setIdEstudiantes(entrada.nextLine());

        System.out.print("Ingrese la edad del estudiante: ");
        juan.setEdad(entrada.nextShort());

        entrada.nextLine(); // limpiar el buffer

        System.out.print("Ingrese el ID de la carrera del estudiante: ");
        juan.setIdCarrera(entrada.nextLine());

        // Mostramos los atributos del estudiante
        System.out.println("\nEl nombre del estudiante es: " + juan.getNombre());

        System.out.println("El apellido del estudiante es: " + juan.getApellido());

        System.out.println("La edad del estudiante es: " + juan.getEdad());

        System.out.println("El ID del estudiante es: " + juan.getIdEstudiante());
    }
}
