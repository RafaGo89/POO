package mx.udg.cucea.bancoapp;

import javax.swing.JOptionPane;

public class CuentaBancaria {
        // Atributos
    private String numCuenta;
    private String nombreTitular;
    private String correo;
    private Double saldo;
    private String tipoCuenta;
    
    // Métodos

    // Método constructor
    public CuentaBancaria() {
        this.tipoCuenta = "Cuenta Bancaria";
    }
    
    
    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad){
        // Condición para evitar ingresar cantidades negativas o en ceros
        if(cantidad <= 0){
            JOptionPane.showMessageDialog(null, "No se pueden depositar cantidades negativas o en ceros!");

        }
        else{ // Sumamos el deposito al saldo
            JOptionPane.showMessageDialog(null, "El saldo anterior era de: $" + saldo
            + "\nSe han depositado: $" + cantidad
            + "\nEl saldo actual ahora es de: $" + (saldo + cantidad));
            saldo = saldo + cantidad;
        }
    }
    
    // Método para retirar dinero
    public void retirar(double cantidad){
        //  Condición para evitar que se retire más dinero del que se tiene en la cuenta
        if (cantidad > saldo){
            JOptionPane.showMessageDialog(null, "Error! Estás solicitando más dinero del que tienes en tu cuenta");
            
        }
        else if (cantidad <= 0){
            JOptionPane.showMessageDialog(null, "No se pueden retirar cantidades negativas o en ceros");
        }
        else{ // Restamos el dinero que se retiro del saldo
            JOptionPane.showMessageDialog(null, "El saldo anterior era de: $" + saldo
            + "\nSe han retirado: $" + cantidad
            + "\nEl saldo actual ahora es de: $" + (saldo - cantidad));
            saldo = saldo - cantidad; 
        }
    }
    
    // Método para mostrar los detalles de la cuenta bancaria
    public void mostrarDatosCuenta(){
        System.out.println("\n" + tipoCuenta);
        System.out.println("**Datos de la cuenta**");
        System.out.println("Número de la cuenta: " + numCuenta);
        System.out.println("Titular de la cuenta: " + nombreTitular);
        System.out.println("Correo electrónico asociado: " + correo);
        System.out.println("Saldo: $" + saldo);
    }
    
    // Métodos setters
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    // Métodos getters
    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getCorreo() {
        return correo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
    
} // Clase Cuenta Bancaria
