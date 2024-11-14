package mx.udg.cucea.bancoapp;

public class CuentaDeAhorros extends CuentaBancaria{
    // Atributos
    private double tasaInteresAnual; // Incialice la tasa anual
    
    // Métodos
    
    // Método constructor

    public CuentaDeAhorros(double tasaInteresAnual, String numCuenta, String nombreTitular, String correo, Double saldo) {
        super(numCuenta, nombreTitular, correo, saldo);
        this.tasaInteresAnual = tasaInteresAnual;
    }
    
    // Método para mostrar detalles de la cuenta
    @Override
    public void mostrarDatosCuenta() {
        System.out.print("\n**Cuenta De Ahorros**");
        super.mostrarDatosCuenta();
        System.out.println("Tasa de interes: " + 100 * tasaInteresAnual + "%");
    }
    
    // Método para aplicar la tasa anual de interés al saldo de la cuenta
    public void aplicarTasa(double saldo){
        setSaldo(saldo + (saldo * tasaInteresAnual));
        System.out.println("\nSe aplico una tasa de interés anual de " + 100 * tasaInteresAnual + "%");
        System.out.println("Interés aplicado de: " + saldo * tasaInteresAnual);
        System.out.println("El saldo con interés ahora es de: $" + getSaldo());
    }
    
    // Métodos setters
    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }
    
    // Métodos getters
    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }
    
      
} // Clase Cuenta de Ahorros
