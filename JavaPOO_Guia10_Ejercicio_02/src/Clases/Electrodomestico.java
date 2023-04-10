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
public class Electrodomestico {
    
    protected int Precio; 
    protected String Color; 
    protected char ConsumoEnergetico;
    protected int Peso; 

    Scanner leer = new Scanner(System.in);
    
    public Electrodomestico() {
    }

    public Electrodomestico(int Precio, String Color, char ConsumoEnergetico, int Peso) {
        this.Precio = Precio;
        this.Color = Color;
        this.ConsumoEnergetico = ConsumoEnergetico;
        this.Peso = Peso;
    }

    public int getPrecio() {
        return Precio;
    }
    public String getColor() {
        return Color;
    }
    public char getConsumoEnergetico() {
        return ConsumoEnergetico;
    }
    public int getPeso() {
        return Peso;
    }
    
    
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public void setConsumoEnergetico(char ConsumoEnergetico) {
        this.ConsumoEnergetico = ConsumoEnergetico;
    }
    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "Precio=" + Precio + ", Color=" + Color + ", ConsumoEnergetico=" + ConsumoEnergetico + ", Peso=" + Peso + '}';
    }
    
    
    
    
    
        public void ConsumoEnerg(char Ce) {
        
//        System.out.println(" > Ingrese el consumo energetico");
//        Ce = leer.next().toUpperCase().charAt(0);

        switch (Ce) {
            case 'A':
                this.ConsumoEnergetico = Ce;
                break;
            case 'B':
                this.ConsumoEnergetico = Ce;
                break;
            case 'C':
                this.ConsumoEnergetico = Ce;
                break;
            case 'D':
                this.ConsumoEnergetico = Ce;
                break;
            case 'E':
                this.ConsumoEnergetico = Ce;
                break;
            case 'F':
                this.ConsumoEnergetico = Ce;
                break;

            default:
                this.ConsumoEnergetico = 'F';
                break;
        }

    }

    public void ComprobarColor(String Color) {
//        System.out.println(" > Ingrese el color");
//        Color = leer.next().toUpperCase();

        switch (Color) {
            case "BLANCO":
                this.Color = Color;
                break;
                
            case "NEGRO":
                this.Color = Color;
                break;
                
            case "ROJO":
                this.Color = Color;
                break;
                
            case "AZUL":
                this.Color = Color;
                break;
                
            case "GRIS":
                this.Color = Color;
                break;
                
            default:
                this.Color = "BLANCO";
                break;
        }

    }
    
    public void CrearElectrodomestico(){
        
       // Electrodomestico elec = new Electrodomestico(); 
        char c; 
        
        System.out.println(" > Ingrese el Consumo del electrodomestico");
        c = leer.next().toUpperCase().charAt(0);
        ConsumoEnerg(c);
      
        System.out.println(" > Ingrese el color");       
        String col = leer.next().toUpperCase();
        ComprobarColor(col);
        
        System.out.println(" > Ingrese el peso");
        this.Peso = leer.nextInt();
       
        System.out.println(" ");
        this.Precio = 1000;
 
    }
    
    public void PrecioFinal() {
        int aux = 0; 
        
        switch (this.ConsumoEnergetico) {
            case 'A':
                
                aux = 1000;
                break;
            case 'B':
                aux = 800;;
                break;
            case 'C':
                aux = 600;;
                break;
            case 'D':
                aux = 500;;
                break;
            case 'E':
                aux = 300;;
                break;
            case 'F':
                aux = 100;;
                break;
                
        }
        
        this.Precio = this.Precio + aux; 
        

        
        if (this.Peso >= 1 & this.Peso <= 19) {

            aux = 100;

        } else if (this.Peso >= 20 & this.Peso <= 49) {

            aux = 500;

        } else if (this.Peso >= 50 & this.Peso <= 79) {

            aux = 800;

        } else if (this.Peso >= 80) {

            aux = 1000;
        }
        
        this.Precio = this.Precio + aux; 
    }
}
