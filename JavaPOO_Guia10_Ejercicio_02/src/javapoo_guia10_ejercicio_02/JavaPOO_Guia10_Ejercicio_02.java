/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo_guia10_ejercicio_02;

import Clases.Electrodomestico;
import Clases.Lavadora;
import Clases.Televisor;
import java.util.ArrayList;

/**
 *
 * @author ari_a
 */
public class JavaPOO_Guia10_Ejercicio_02 {

    public static void main(String[] args) {
        
        Electrodomestico e = new Electrodomestico(); 
        
        Lavadora l = new Lavadora();
        Televisor t = new Televisor(); 
        
        l.CrearLavadora(); 
        l.PrecioFinal();
        
        //System.out.println(e);
        System.out.println(l);
        
        t.CrearTelevisor();
        t.PrecioFinal();
        
        System.out.println(t);
        

// EJERCICIO 3 - GUIA 10 (HERENCIA)

        ArrayList<Electrodomestico> electrod = new ArrayList(); 
        
        Lavadora l1 = new Lavadora(20, 0, "azul", 'A', 50);
        l1.PrecioFinal();
        electrod.add(l1);
        
        Lavadora l2 = new Lavadora(40, 0, "negro", 'D', 80); 
        l2.PrecioFinal();
        electrod.add(l2);
        
        Televisor t1 = new Televisor(25, true, 0, "negro", 'B', 55);   
        t1.PrecioFinal();
        electrod.add(t1);
        
        Televisor t2 = new Televisor(40, false, 0, "blanco", 'C', 50);  
        t2.PrecioFinal();
        electrod.add(t2);
        
        for (Electrodomestico aux : electrod) {
            System.out.println(aux);
        }
        
        
    }
    
}
