// Programación orientada a objetos
// Extra11
// By: Rafael Rodríguez Gómez

package Extra11;

import java.util.Scanner;

public class Extra11{
    public static void main(String[] args) {
        // Creamos objeto scanner para leer desde el teclado
        Scanner entrada = new Scanner(System.in);

        // Creamos un empleado
        Empleado emp1 = new Empleado();

        // Ingresamos los atributos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        emp1.setNombre(entrada.nextLine());

        System.out.print("Ingrese el salario por hora del empleado " + emp1.getNombre() + ": ");
        emp1.setSalarioXHora(entrada.nextDouble());

        System.out.print("Ingrese las horas que trabaja por dia el empleado " + emp1.getNombre() + ": ");
        emp1.setHorasTrabajadas(entrada.nextInt());

        // Mostramos su salario semanal
        System.out.println("El salario semanal del empleado " + emp1.getNombre() + " es: $" + emp1.SalarioSemanal());
    } // main
} // Clase Extra 11