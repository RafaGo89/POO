package mx.udg.cucea.clase_poo;

public class Animal {
    // Atributos
    String raza;
    
    Animal(){
        System.out.println("Soy un animal");
    } // constructor animal
    
    // Método
    public void comer(){
        System.out.println("Soy un " + raza + " y estoy comiendo");
    } // comer
    
}  // Animal

class Perro extends Animal{
    Perro(){
        System.out.println("Soy un perro");
    } // constructor perro
    
    public void ladrar(){
        System.out.println("Soy un " + raza + " y hago ruff ruff");
    } // ladrar
    
} // Perro

class Gato extends Animal{
    Gato(){
        System.out.println("Soy un gato");
    } // constructor gato
    
    public void maullar(){
        System.out.println("Soy un " + raza + " y hago miaau miaau");
    } // maullar
}
