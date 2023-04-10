/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Abel
 */
public class Televisor extends Electrodomestico {

    Integer pulgadas;
    boolean TDT;
    public Televisor() {
    }


        public Televisor(Integer pulgadas,boolean TDT, Integer precio, String color, String consumoEnergetico, Integer peso, Integer precioFinal) {
        super(precio, color, consumoEnergetico, peso, precioFinal);
        this.pulgadas = pulgadas;
        this.TDT= TDT;
    }

    public boolean isTDT(){
    return TDT;
    }    
    public Televisor(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }
    @Override
    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    @Override
    public Integer getPeso() {
        return peso;
    }
    @Override
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    
    @Override
    public Electrodomestico comprobarConsumoEnergetico(Electrodomestico a1){
    //Electrodomestico a1 = new Electrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el consumo energetico del producto");
//        Integer precioP=0;
        consumoEnergetico = leer.next();
        if (null != consumoEnergetico) switch (consumoEnergetico) {
            case "f":
                a1.setPrecio(100);// = (100); 
                break;
            case "e":
                a1.setPrecio(300);// = (300); 
                break;
            case "d":
                a1.setPrecio(500); //=(500); 
                break;
            case "c":
                a1.setPrecio(600); //= (600); 
                break;
            case "b":
               a1.setPrecio(800); //= (800); 
                break;
            case "a":
                a1.setPrecio(1000); //= (1000); 
                break;
            default:
                break;
        }
        System.out.println("El precio por consumo energetico es: " + a1.getPrecio());
        
        return a1;
    }
    
    @Override
    public void comprobarColor(){
            Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el color del electrodomestico");
        color = leer.nextLine();
        if ("blanco".equals(color) || "negro".equals(color) || "rojo".equals(color) || "azul".equals(color) || "gris".equals(color)  ) {
            
            System.out.println("El color del electrodomestico es" + color.toLowerCase());
            
        }else{System.out.println("El color del electrodomestico es blanco");}
    }
    @Override
     public Electrodomestico crearElectrodomestico(){
        Electrodomestico a2 = new Electrodomestico();
        Scanner leer = new Scanner(System.in);
        comprobarColor();
        comprobarConsumoEnergetico(a2);
        
       
        return a2;
    
    }
    
    @Override
    public void precioFinal(Electrodomestico a2){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       
        Integer precioBase = 1000;
        Integer precioFinal=0;
        Integer precioP1=0;
        System.out.println("Ingrese el tamaño del electrodomestico, entre 1 y 80 kg o mas de 80 kg");
        a2.setPeso(leer.nextInt());
         a2.setPrecio(a2.comprobarConsumoEnergetico(a2).precio);
     System.out.println("el tamanio del electrodomestico es: " + a2.getPeso());
          
        if (a2.getPeso() > 1 && a2.getPeso() <19) {
            precioP1 = 100;
            
        }else if(a2.getPeso() > 20 && a2.getPeso() <49){
        precioP1 = 500;
            
        }else if(a2.getPeso() > 50 && a2.getPeso() <79){
            precioP1 = 800;
        }else if( a2.getPeso() <80){
            precioP1 = 1000;      
           
    }
        
        System.out.println("precio base " + precioBase);
        System.out.println(precioP1);
        System.out.println(a2.getPrecio());
        //precioFinal = precioBase + precioP1 + a2.getPrecio();
        System.out.println("Desea el televisor con TDT incluido? si/no");
        String sintonizador = leer.nextLine();
        sintonizador =leer.next();
        
        if ("si".equals(sintonizador)) {
            setTDT(true);
            precioP1 = precioP1 + 500;
        }
        Integer precioAux;
        precioAux = precioBase + precioP1 + a2.getPrecio();
        System.out.println("ingrese las pulgadas del televisor");
        setPulgadas(leer.nextInt());
        if (getPulgadas()>40) {
            
             precioAux = precioAux + (30*precioAux)/100;
            
        }
        
        
//        precioFinal = precioAux;
//        System.out.println("El precio final es: " + precioFinal);
         setPrecioFinal(precioAux);
//        precioFinal = precioBase + precioP1 + a2.getPrecio();
        System.out.println("El precio final es: " + getPrecioFinal());
    }
}
