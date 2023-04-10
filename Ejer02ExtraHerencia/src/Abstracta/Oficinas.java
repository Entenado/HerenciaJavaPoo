package Abstracta;

import java.util.Scanner;

/**
 *
 * @author nickl
 */
public final class Oficinas extends Edificio {

    private Integer numOficinas, cantPxOficina, cantPisos;

    public Oficinas() {
    }

    public Oficinas(Integer numOficinas, Integer cantPxOficina, Integer cantPisos, Double Superficie, Double Volumen) {
        super(Superficie, Volumen);
        this.numOficinas = numOficinas;
        this.cantPxOficina = cantPxOficina;
        this.cantPisos = cantPisos;
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getCantPxOficina() {
        return cantPxOficina;
    }

    public void setCantPxOficina(Integer cantPxOficina) {
        this.cantPxOficina = cantPxOficina;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
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
        return "\nOficinas{" + "numOficinas=" + numOficinas + ", cantPxOficina=" + cantPxOficina + ", cantPisos=" + cantPisos + '}';
    }

    //----------Métodos----------//
    public void pedirUsuario() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese la cantidad de pisos->");
        this.cantPisos = leer.nextInt();
        System.out.print("Ingrese la cantidad de Oficinas por piso->");
        this.numOficinas = leer.nextInt();
        System.out.print("Ingrese la cantidad de personas por oficina->");
        this.cantPxOficina = leer.nextInt();

        int cantP = this.cantPxOficina * this.numOficinas;
        System.out.println("Hay " + this.numOficinas + " oficinas por piso");
        System.out.println("Hay " + this.cantPisos + " pisos en el edificio.");
        System.out.println("Hay " + cantP + " de personas por piso.");
        System.out.println("En total, hay " + (this.cantPxOficina * this.numOficinas * this.cantPisos) + " personas por piso.");
    }

    @Override
    public void calcularVolumen(double ancho, double alto, double largo) {
        this.Volumen = ancho * largo * cantPisos;
    }

    @Override
    public void calcularSuperficie(double ancho, double largo) {
        this.Superficie = ancho * largo;
    }

}
