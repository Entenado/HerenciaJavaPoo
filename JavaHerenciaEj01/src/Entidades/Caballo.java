/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Abel
 */
public final class Caballo extends Animal {
    public Caballo() {
    }
    
    

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
//        nombre = "Spark";
//        alimento = "Pasto";
//        edad = 25;
//        raza= "Fino";
//      
    }
    
    @Override
     public void Alimentarse(){
        System.out.println("Me alimento de pasto.....");
    }
}
