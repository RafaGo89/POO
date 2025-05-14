package mx.udg.cucea.bancoapp;

import javax.swing.JOptionPane;

public class CuentaCorriente extends CuentaBancaria {
    // Atributos
    private double limiteDeCredito;
    
    // Métodos
    
    // Método constructor

    public CuentaCorriente() {
        setTipoCuenta("Cuenta Corriente");
    }
    
    @Override
    public void mostrarDatosCuenta() {
        super.mostrarDatosCuenta();
        System.out.println("Límite de crédito de la cuenta: $" + limiteDeCredito);
    }
    
    // Método para solicitar credito
    public void solicitarCredito(double cantidad){
        if (cantidad > limiteDeCredito){
            JOptionPane.showMessageDialog(null, "Error! Estás solicitando más crédito del que tienes disponible" +
            "\nLímite de crédito actual: $" + limiteDeCredito);
        }
        else if (cantidad <= 0){
            JOptionPane.showMessageDialog(null, "Error! Estás solicitando cantidades negativas o en ceros");
        }
        else{
            JOptionPane.showMessageDialog(null, "Tu límite de crédito es: $" + limiteDeCredito
            + "\nHas solicitado $" + cantidad + " de tu crédito"
            + "\nAhora tu límite de crédito es: $" + (limiteDeCredito- cantidad));
            limiteDeCredito = limiteDeCredito - cantidad; // Actualizamos el límite de crédito
        }
    }
    
    // Métodos setters
    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
    
    // Métodos getters
    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }
    
} // Clase Cuenta Corriente
