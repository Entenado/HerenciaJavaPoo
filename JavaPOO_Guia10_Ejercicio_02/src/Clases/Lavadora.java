/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author ari_a
 */
public class Lavadora extends Electrodomestico {
    
    private int Carga;

    public Lavadora() {
    }

    public Lavadora(int Carga) {
        this.Carga = Carga;
    }

    public Lavadora(int Carga, int Precio, String Color, char ConsumoEnergetico, int Peso) {
        super(Precio, Color, ConsumoEnergetico, Peso);
        this.Carga = Carga;
    }

    public int getCarga() {
        return Carga;
    }

    public void setCarga(int Carga) {
        this.Carga = Carga;
    }

    @Override
    public String toString() {
        return super.toString() + "Lavadora{" + "Carga=" + Carga + '}';
    }

 
    
  
    public void CrearLavadora(){
       // Lavadora lav = new Lavadora();
        
        CrearElectrodomestico(); 
        
        System.out.println(" > Ingrese la carga de la lavadora");
        this.Carga = leer.nextInt();
        
       
    }

    @Override    
    public void PrecioFinal() {
        super.PrecioFinal(); 
        
        if (this.Carga > 30) {
            this.Precio = this.Precio + 500; 
        }
    }
     
    
}
