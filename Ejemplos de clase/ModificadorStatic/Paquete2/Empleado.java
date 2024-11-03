package Paquete2;

public class Empleado {
    // Atributos
    public static final String idDepartamento = "TI87";

    // Métodos
    public static void saludo(){
        System.out.println("Hola, soy un empleado");
    } // metodo saludo

    public static class Departamento{
        // Método
        public static void getDepartamento(){
            System.out.println("El departamento es TI");
        } // metodo getDepartamento
    } // clase interna getDepartamento
}
