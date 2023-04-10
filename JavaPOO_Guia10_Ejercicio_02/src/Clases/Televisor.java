/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ari_a
 */
public class Televisor extends Electrodomestico {
    
    private int Resolucion; 
    private boolean Sintonizador; 

    public Televisor() {
    }

    public Televisor(int Resolucion, boolean Sintonizador) {
        this.Resolucion = Resolucion;
        this.Sintonizador = Sintonizador;
    }

    public Televisor(int Resolucion, boolean Sintonizador, int Precio, String Color, char ConsumoEnergetico, int Peso) {
        super(Precio, Color, ConsumoEnergetico, Peso);
        this.Resolucion = Resolucion;
        this.Sintonizador = Sintonizador;
    }

    public int getResolucion() {
        return Resolucion;
    }

    public boolean isSintonizador() {
        return Sintonizador;
    }

    public void setResolucion(int Resolucion) {
        this.Resolucion = Resolucion;
    }

    public void setSintonizador(boolean Sintonizador) {
        this.Sintonizador = Sintonizador;
    }

    @Override
    public String toString() {
        return super.toString() + "Televisor{" + "Resolucion=" + Resolucion + ", Sintonizador=" + Sintonizador + '}';
    }
    
    
    
    
    public void CrearTelevisor() {
        //Televisor tv = new Televisor(); 
        
        CrearElectrodomestico(); 
       
        System.out.println(" > Ingrese la resoluciòn de la TV");
        this.Resolucion = leer.nextInt();
        
        System.out.println(" > Ingrese la TDT (SI/NO)");
        String op = leer.next().toUpperCase();
        
        if (op.equals("S")) {
            this.Sintonizador = true; 
        } else {
            this.Sintonizador = false; 
        }
        
        
    }

    @Override
    public void PrecioFinal() {
        super.PrecioFinal(); 
        
        if (this.Resolucion > 40) {
            this.Precio = this.Precio + 100;        
        }
        
        if (this.Sintonizador == true) {
            this.Precio = this.Precio + 500;;
        }
        
    }
    
   
    
}
