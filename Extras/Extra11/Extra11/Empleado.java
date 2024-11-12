package Extra11;

public class Empleado {
    // Atributos
    private String nombre;
    private double salarioXHora;
    private int horasTrabajadas;

    // Métodos

    // Método para calcular el salario semanal del empleado
    public double SalarioSemanal(){
        return salarioXHora * horasTrabajadas;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioXHora(double salarioXHora) {
        this.salarioXHora = salarioXHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    // Métodos getters
    public double getSalarioXHora() {
        return salarioXHora;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
}
