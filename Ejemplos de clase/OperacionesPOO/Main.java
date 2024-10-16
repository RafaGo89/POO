package com.mycompany.objetosymetodos;

public class Main {
    public static void main(String[] args){
        // Creamos un objeto tipo Operacion
        Operacion op1 = new Operacion(); 
        
        // Usamos los métodos de la clase con ese nuevo objeto
        op1.leerNumeros();
        op1.sumar();
        op1.restar();
        op1.multiplicar();
        op1.dividir();
        op1.mostrarResultados();
    } // main
    
} // clase
