package Paquete2;

public class Prueba {
    public static void main(String[] args) {
        // Acedemos a los atributos a través de la clase
        System.out.println("La ID del departamento es: " + Empleado.idDepartamento);

        // Accedemos al método a través de la clase
        Empleado.saludo();

        // Accedemos al método de la clase interna
        Empleado.Departamento.getDepartamento();
    }
}
