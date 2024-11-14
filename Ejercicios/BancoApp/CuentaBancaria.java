package mx.udg.cucea.bancoapp;

public class CuentaBancaria {
        // Atributos
    private String numCuenta;
    private String nombreTitular;
    private String correo;
    private Double saldo;
    
    // Métodos

    // Método constructor
    public CuentaBancaria(String numCuenta, String nombreTitular, String correo, Double saldo) {
        this.numCuenta = numCuenta;
        this.nombreTitular = nombreTitular;
        this.correo = correo;
        this.saldo = saldo;
    }
    
    
    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad){
        // Condición para evitar ingresar cantidades negativas o en ceros
        if(cantidad <= 0){
            System.out.println("\nNo se pueden depositar cantidades negativas o en ceros!");
        }
        else{ // Sumamos el deposito al saldo
            System.out.println(" \nEl saldo anterior era de: $" + saldo);
            System.out.println("Se han depositado: $" + cantidad);
            saldo = saldo + cantidad;
            System.out.println("El saldo actual ahora es de: $" + saldo);
        }
    }
    
    // Método para retirar dinero
    public void retirar(double cantidad){
        //  Condición para evitar que se retire más dinero del que se tiene en la cuenta
        if (cantidad > saldo){
            System.out.println("\nError! Estás solicitando más dinero del que tienes en tu cuenta");
        }
        else{ // Restamos el dinero que se retiro del saldo
            System.out.println(" \nEl saldo anterior era de: $" + saldo);
            System.out.println("Se han retirado: $" + cantidad);
            saldo = saldo - cantidad;
            System.out.println("El saldo actual ahora es de: $" + saldo);
        }
    }
    
    // Método para mostrar los detalles de la cuenta bancaria
    public void mostrarDatosCuenta(){
        System.out.println("\n**Cuenta**");
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
    
} // Clase Cuenta Bancaria
