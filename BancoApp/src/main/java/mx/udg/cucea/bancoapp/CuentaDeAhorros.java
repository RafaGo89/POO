package mx.udg.cucea.bancoapp;

import javax.swing.JOptionPane;

public class CuentaDeAhorros extends CuentaBancaria{
    // Atributos
    private double tasaInteresAnual;
    
    // Métodos
    
    // Método constructor

    public CuentaDeAhorros() {
        setTipoCuenta("Cuenta de ahorros");
    }
    
    // Método para mostrar detalles de la cuenta
    @Override
    public void mostrarDatosCuenta() {
        super.mostrarDatosCuenta();
        System.out.println("Tasa de interes: " + 100 * tasaInteresAnual + "%");
    }
    
    // Método para aplicar la tasa anual de interés al saldo de la cuenta
    public void aplicarTasa(){
        JOptionPane.showMessageDialog(null, "Se aplico una tasa de interés anual de " + 100 * tasaInteresAnual + "%"
        + "\nSe aplico una tasa de interés anual de " + 100 * tasaInteresAnual + "%"
        + "\nEl saldo con interés ahora es de: $" + (getSaldo() + (getSaldo() * tasaInteresAnual)));
        setSaldo(getSaldo() + (getSaldo() * tasaInteresAnual)); // aplicamos la tasa de interés al saldo
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
