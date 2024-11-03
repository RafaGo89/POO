package Paquete1;

public class Examen {
    
    // Atributos 
    private double calificacion; 
    private int numPreguntas;
    private boolean estatus; 
    
    // Metodos 
    public double getCalificacion(){
        return calificacion; // Obtener el valor que se ingreso 
    } // Metodo GetCalificacion 
    
    public void setCalificacion(double calificacion){
        if(calificacion >= 1 && calificacion <= 100){
        this.calificacion = calificacion;     
        }else{
            System.out.println("La calificacion NO es valida!");
        } // else 
    } // metodo SetCalificacion

    public int getNumPreguntas() {
        return numPreguntas;
    } // Metodo GetNumPreguntas 

    public void setNumPreguntas(int numPreguntas) {
        this.numPreguntas = numPreguntas;
    } // Metodo setNumPreguntas

    public boolean isEstatus() { // is solo porque el tipo es boolean 
        return estatus;
    } // Metodo isEstatus

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    } // Metodo setEstatus 
    
    
} // Clase --> Examen 
