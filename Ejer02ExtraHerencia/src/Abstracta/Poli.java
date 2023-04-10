/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracta;

import java.util.Scanner;

/**
 *
 * @author nickl
 */
public final class Poli extends Edificio {

    private String nombre;
    private boolean techado;

    public Poli() {
    }

    public Poli(String nombre, boolean techado, Double Superficie, Double Volumen) {
        super(Superficie, Volumen);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public Double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(Double Superficie) {
        this.Superficie = Superficie;
    }

    public Double getVolumen() {
        return Volumen;
    }

    public void setVolumen(Double Volumen) {
        this.Volumen = Volumen;
    }

    @Override
    public String toString() {
        return "\nPoli{" + "nombre=" + nombre + ", techado=" + techado + '}';
    }

    //---------------Métodos-----------//
    public void crearPoli() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Nombre-->");
        this.nombre = leer.next();

        System.out.print("¿El poli está techado? -->");
        String op = leer.next().toUpperCase();

        this.techado = op.equals("SI");

    }

    @Override
    public void calcularSuperficie(double ancho, double largo) {

        this.Superficie = ancho * largo;

    }

    @Override
    public void calcularVolumen(double ancho, double alto, double largo) {

        this.Volumen = ancho * alto * largo;

    }

}
