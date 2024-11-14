// Programación Orientada a objetos
// Examen segundo parcial (Sistema bancario)
// By: Rafael Rodríguez Gómez

package mx.udg.cucea.bancoapp;

public class BancoApp {

    public static void main(String[] args) {
        // Creamos una Cuenta Bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("89087", "Javier Hernádez", "chicharito14@gmail.com", 0.0);
        
        // Mostramos detalles de la cuenta
        cuenta1.mostrarDatosCuenta();
        
        // Realizamos un deposito
        cuenta1.depositar(2000.0);
        
        // Realizamos un retiro
        cuenta1.retirar(1000.0);
        
        // Mostramos detalles de la cuenta
        cuenta1.mostrarDatosCuenta();
        
        
        // Creamos una cuenta de ahorros
        CuentaDeAhorros cuenta2 = new CuentaDeAhorros(0.1, "23409", "Leonel Messi", "Messi10@gmail.com", 1500.0);
        
        // Mostramos los detalles de la cuenta
        cuenta2.mostrarDatosCuenta();
        
        // Realizamos un deposito
        cuenta2.depositar(3000.0);
        
        // Realizamos un retiro
        cuenta2.retirar(500.0);
        
        // Aplicamos la tase de interes a la cuenta
        cuenta2.aplicarTasa();
        
        // Mostramos los detalles de la cuenta
        cuenta2.mostrarDatosCuenta();
        
        // Creamos una cuenta coriente
        CuentaCorriente cuenta3 = new CuentaCorriente(3000.0, "27810", "Manuel Sanabria", "sanabria8@gmail.com", 2000.0);
        
        // Mostramos los detalles de la cuenta
        cuenta3.mostrarDatosCuenta();
        
        // Solicitamos un crédito
        cuenta3.solicitarCredito(2000.0);
    } // Main
} // Clase BancoApp
