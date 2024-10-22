package mx.udg.cucea.ejercicio13;

import java.util.Scanner;

public /*fina*/ class Operacion { //final para que la clase no pueda ser heredada
    // Objeto scanner para leer valores
    Scanner entrada = new Scanner(System.in);
    
    // Atributos
    int valor1;
    int valor2;
    int resultado;
    String tipoOperacion;
    
    // Métodos
    
    // Método constructor
    public Operacion(){
        
    } // constuctor
    
    // Método para ingresar el primer valor
    public void obtenerValor1(){
        System.out.print("\nIngrese el primer valor: ");
        this.valor1 = entrada.nextInt();
    } // obtenerValor1
    
    // Método para ingresar el segundo valor
    public void obtenerValor2(){
        System.out.print("Ingrese el segundo valor: ");
        this.valor2 = entrada.nextInt();
    } // obtenerValor2
    
    // Método para mostrar el resultado de la operacion
    public final void mostrarResultado(){ // final para que el método no pueda ser sobreescrito
        System.out.println("\n*El resultado de la " + tipoOperacion + " fue " +  resultado);
    } // mostrarResultado
    
} // clase publica

class Suma extends Operacion{
    // Atributos
    
    // Métodos
    
    // Método constructor
    public Suma(){
        this.tipoOperacion = "Suma";
    } // constuctor
    
    // Método para hacer la suma de los valores
    public void sumar(){
        System.out.println("\n--Se hizo una suma--");
        resultado = valor1 + valor2;
    } // sumar
    
} // clase suma

class Resta extends Operacion{
    // Atributos
    
    // Métodos
    // Método constructor
    public Resta(){
        this.tipoOperacion = "Resta";
    } // constuctor
    
    
    // Método para hacer la resta de los valores
    public void restar(){
        System.out.println("\n--Se hizo una resta--");
        resultado = valor1 - valor2;
    } // sumar
    
} // clase resta
