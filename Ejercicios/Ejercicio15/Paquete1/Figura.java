// Programación orientada a objetos
// Ejercicio 15 (polimorfismo)
// BY: Rafael Rodríguez Gómez

package Paquete1;

import java.util.Scanner;

public class Figura{
    // Creamos un objeto scanner para leer desde teclado
    Scanner entrada = new Scanner(System.in);

    // Atributo
    private String color;

    // Métodos

    // Método constructor para incializar el color de la figura
    Figura (){
        System.out.print("\nIngresa el color de la figura: ");
        this.color = entrada.nextLine();
    }

    // Método generico para calcular el área de la figura
    private double calcularArea(){
        return 0.0;
    }

    // Métodos setters

    //Método para establecer el color de la figura
    public void setColor(String color){
        this.color = color;
    }

    //Métodos getters

    // Método para devolver el color de la figura
    public String getColor(){
        return color;
    }

} // Clase figura

class Circulo extends Figura{
    // Atributos
    private double radio;

    // Métodos

    // Método para calcular el area del circulo
    public double calcularArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    // Métodos setters

    // Método para establecer el radio del circulo
    public void setRadio(double radio){
        this.radio = radio;
    }

    // Métodos getters

    // Método para devolver el radio del circulo
    public double getRadio(){
        return this.radio;
    }

} // Clase circulo

class Cuadrado extends Figura{
    // Atributo
    private double lado;

    // Método para calcular el área del cuadrado
    public double calcularArea(double lado){
        return lado * lado;
    }

    // Métodos setters

    // Método para establecer el lado del cuadrado
    public void setLado(double lado){
        this.lado = lado;
    }

    // Métodos getters

    // Método para devolver el lado del cuadrado
    public double getLado(){
        return this.lado;
    }


} // clase Cuadrado