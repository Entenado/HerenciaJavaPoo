/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidad.Animal;
import entidad.Caballo;
import java.util.ArrayList;
import java.util.List;
import entidad.Gato;
import entidad.Perro;

/**
 *
 * @author Yesi
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("lay", "carnivoro", 6,"Pitbull" );
        perro1.alimentarse();
        
        Animal perro = new Perro("Thor", "carnivoro", 12, "Rotweiler");
        perro.alimentarse();
        
        Animal gato = new Gato("Anakin", "croquetas", 2, "Gardfield");
        gato.alimentarse();
        
        Animal caballo = new Caballo("Black","Heno", 15,"Arabe");
        caballo.alimentarse();
        
     List<Animal> mascotas = new ArrayList();
     
        mascotas.add(perro);
        mascotas.add(perro1);
        mascotas.add(gato);
        mascotas.add(caballo);
        
       
 
           
    }
}


        