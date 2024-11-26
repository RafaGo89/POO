package mx.udg.cucea.bancoapp;

public class CuentaCorriente extends CuentaBancaria {
    // Atributos
    private double limiteDeCredito;
    
    // Métodos
    
    // Método constructor

    public CuentaCorriente(double limiteDeCredito, String numCuenta, String nombreTitular, String correo, Double saldo) {
        super(numCuenta, nombreTitular, correo, saldo);
        this.limiteDeCredito = limiteDeCredito;
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
            System.out.println("\nError! Estás solicitando más crédito del que tienes disponible");
            System.out.println("Límite de crédito actual: $" + limiteDeCredito);
        }
        else if (cantidad <= 0){
            System.out.println("\nError! Estás solicitando cantidades negativas o en ceros");
        }
        else{
            System.out.println("\nTu límite de crédito es: $" + limiteDeCredito);
            System.out.println("Has solicitado $" + cantidad + " de tu crédito");
            limiteDeCredito = limiteDeCredito - cantidad; // Actualizamos el límite de crédito
            System.out.println("Ahora tu límite de crédito es: $" + limiteDeCredito);
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
