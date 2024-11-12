// Programación orientada a objetos
// Ejercicio 15 (polimorfismo)
// BY: Rafael Rodríguez Gómez

package Paquete1;

import java.util.Scanner;

public abstract class Figura{
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
    public abstract double calcularArea();

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

    // Método constructor
    Circulo(){
        System.out.println("\nFigura---> Círculo");
    }

    // Método para calcular el area del circulo
    public double calcularArea(){
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
        return radio;
    }

} // Clase circulo

class Cuadrado extends Figura{
    // Atributo
    private double lado;

    // Métodos

    // Método constructor
    Cuadrado(){
        System.out.println("\nFigura---> Cuadrado");
    }

    // Método para calcular el área del cuadrado
    public double calcularArea(){
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
        return lado;
    }


} // clase Cuadrado

class Rectangulo extends Figura{
    // Atributos
    private double base;
    private double altura;

    // Métodos

    // Método constructor
    Rectangulo(){
        System.out.println("\nFigura---> Rectangulo");
    }

    // Método para calcular el area del rectangulo
    public double calcularArea(){
        return base * altura;
    }

    // Métodos setters
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Métodos getters
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    

} // Clase rectangulo

class Triangulo extends Figura{
    // Atributos
    private double base;
    private double altura;

    // Métodos

    // Método constructor
    Triangulo(){
        System.out.println("\nFigura---> Triangulo");
    }

    // Método para calcular el área del triangulo
    public double calcularArea(){
        return (base * altura) / 2;
    }

    // Métodos setters
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Métodos getters
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }


} // Clase figura