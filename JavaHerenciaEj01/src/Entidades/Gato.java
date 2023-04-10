/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Abel
 */
public final class Gato extends Animal{
    
    public Gato() {
    }
    
    

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
//        nombre = "Pelusa";
//        alimento = "Galleta ";
//        edad = 15;
//        raza= "Siames";
//      
    }
    
    @Override
     public void Alimentarse(){
        System.out.println("Me alimento de galletas.....");
    }
}
