/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manosalaobraherencia;

/**
 *
 * @author Abel
 */
public class Gato extends Animal {
    
 
    public Gato(String saludo) {
        super(saludo);
        System.out.println("Miau!, Soy un gato");
    }
    
    
    public void hacerRuido(){
        System.out.println("Miau!");
    }
}
