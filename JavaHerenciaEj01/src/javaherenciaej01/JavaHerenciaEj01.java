/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaherenciaej01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Abel
 */
public class JavaHerenciaEj01 {

    
    public static void main(String[] args) {
        //Declaracion del objeto Perro
        Animal Perro = new Perro(true, "Stich", "Carnivoro", 15, "Doberman");
        System.out.println(Perro);
        Perro.Alimentarse();
        
        //Declaracion del objeto Perro
        Animal Gato = new Gato("Pelusa", "Galleta", 15, "Siames");
        System.out.println(Gato);
        Gato.Alimentarse();
        
        //Declaracion del objeto Caballo
        Animal Caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        System.out.println(Caballo);
        Caballo.Alimentarse();
    }
    
}
