/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Samuel
 */
public class Lavadora extends Electrodemesticos{
    int carga;    
    public Lavadora() {
    }

    public Lavadora(int carga, double precio, double peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    
    public Electrodemesticos crearLavadora(int carga){
        Electrodemesticos aux = new Lavadora();
        aux=super.crearElectrodomestico();
        this.carga=carga;
        return aux;
    }
      
    @Override
    public double precioFinal(Electrodemesticos e){
        System.out.println("Ingrese la carga: ");
        setCarga(valor.nextInt());
        crearLavadora(getCarga());
        System.out.println("a"+super.precioFinal(e));
        if(getCarga()>30){
            setPrecio(super.precioFinal(e)+500);
        }else{
            setPrecio(super.precioFinal(e));
        }        
        return getPrecio();        
    }
    
    
    
}
