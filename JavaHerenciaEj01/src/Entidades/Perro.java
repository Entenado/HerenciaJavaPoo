/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Abel
 */
public final class Perro extends Animal {

    public Perro() {
    }
    boolean paseo;
    

    public Perro(boolean paseo, String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
//        nombre = "Stich";
//        alimento = "Carnivoro";
//        edad = 15;
//        raza= "Doberman";
      
    }
    
    @Override
     public void Alimentarse(){
        System.out.println("Me alimento de carne.....");
    }

    
    
    
    
}
