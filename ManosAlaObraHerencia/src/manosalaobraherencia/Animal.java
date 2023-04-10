/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manosalaobraherencia;

import manosalaobraherencia.Entidad.EntidadAnimal;

/**
 *
 * @author Abel
 */
public class Animal {
  
  String saludo = "hola";

    public void hacerRuido(Animal a1){
        System.out.println("Hola");
      
    }
    public Animal() {
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public Animal(String saludo) {
        this.saludo = saludo;
    }
  
  

    @Override
    public String toString() {
        return "Animal{" + "saludo=" + saludo + '}';
    }
  
    }
    
    
   

