/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Yesi
 */
public class Caballo extends Animal{
    
    public boolean Relincha;

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.Relincha=Relincha;
        
    }
    @Override
    public void alimentarse() {
        super.alimentarse(); 
        System.out.println(alimento);
    }
    
}
