/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Electrodemesticos {

    Scanner valor = new Scanner(System.in).useDelimiter("\n");
    protected double precio, peso;
    protected String color;
    protected char consumoEnergetico;

    public Electrodemesticos() {

    }

    public Electrodemesticos(double precio, double peso, String color, char consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        //this.color = color;
        //this.consumoEnergetico = consumoEnergetico;
        consumo(consumoEnergetico);
        comprobarColor(color);        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    private void consumo(char letra) {
        letra = Character.toLowerCase(letra);
        boolean esValido = false;
        char[] arreglo = {'a', 'b', 'c', 'd', 'e'};

        for (int i = 0; i < arreglo.length; i++) {
            if (letra == arreglo[i]) {
                esValido = true;
                break;
            }
        }
        if (esValido) {
            setConsumoEnergetico(letra);
        } else {
            setConsumoEnergetico('f');
        }
    }

    private void comprobarColor(String color) {
        String[] colores = {"negro", "rojo", "azul", "gris"};
        boolean badera = false;
        for (String colore : colores) {
            if (color.equalsIgnoreCase(colore)) {
                badera = true;
                break;
            }
        }
        if (badera) {
            setColor(color);
        } else {
            setColor("blanco");
        }
    }

    public Electrodemesticos crearElectrodomestico() {
        Electrodemesticos e = new Electrodemesticos();
        System.out.println("Ingrese el color del eletrodomestico: ");
        e.comprobarColor(valor.next());
        System.out.println("Ingrese el consumo: ");
        e.consumo(valor.next().charAt(0));
        System.out.println("Ingrese el peso: ");
        e.setPeso(valor.nextInt());
        e.setPrecio(precio);
        return e;
    }

    public double precioFinal(Electrodemesticos e) {
        //System.out.println(e.getPrecio());
        double preciosFinal = 1000;
        switch (e.getConsumoEnergetico()) {
            case 'a':
                preciosFinal += 1000;
                break;
            case 'b':
                preciosFinal += 800;
                break;
            case 'c':
                preciosFinal += 600;
                break;
            case 'd':
                preciosFinal += 500;
                break;
            case 'e':
                preciosFinal += 300;
                break;
            case 'f':
                preciosFinal += 100;
                break;
        }
          
        if (e.getPeso() >= 1 && e.getPeso() <= 19) {
            preciosFinal += 100;
        } else if (e.getPeso() >= 20 && e.getPeso() <= 49) {
            preciosFinal += 500;
        } else if (e.getPeso() >= 50 && e.getPeso() <= 79) {
            preciosFinal += 800;
        } else if(e.getPeso() >= 80){
            preciosFinal +=1000;
        } else {
            System.out.println("ERROR");
        }
        setPrecio(preciosFinal);        
        return getPrecio();
    }

    @Override
    public String toString() {
        return "Electrodemesticos{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + '}';
    }

}
