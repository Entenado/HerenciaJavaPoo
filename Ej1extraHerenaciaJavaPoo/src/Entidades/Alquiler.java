
package Entidades;

import java.time.LocalDate;
import java.util.Scanner;


public class Alquiler  {
    
    private String nombre;
    private Integer Documento;
    private LocalDate fechaInicio, fechaDevolucion;
    private Barco barco;
    private String posicion;
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer Documento, LocalDate fechaInicio, LocalDate fechaDevolucion, Barco barco, String posicion) {
        this.nombre = nombre;
        this.Documento = Documento;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.barco = barco;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return Documento;
    }

    public void setDocumento(Integer Documento) {
        this.Documento = Documento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", Documento=" + Documento + ", fechaInicio=" + fechaInicio + ", fechaDevolucion=" + fechaDevolucion + ", barco=" + barco + ", posicion=" + posicion + ", leer=" + leer + '}';
    }
    
    
   
    
}
