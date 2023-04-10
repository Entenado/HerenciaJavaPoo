
package Entidades;

import java.util.Scanner;


public class AlojamientoExtraHotelero extends Alojamientos{
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
     protected boolean privacidad;
     protected Integer m2;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean privacidad, Integer m2) {
        this.privacidad = privacidad;
        this.m2 = m2;
    }

    public AlojamientoExtraHotelero(boolean privacidad, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privacidad = privacidad;
        this.m2 = m2;
    }

    public boolean isPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(boolean privacidad) {
        this.privacidad = privacidad;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

     @Override
    public String getNombre() {
        return nombre;
    }

     @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     @Override
    public String getDireccion() {
        return direccion;
    }

     @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

     @Override
    public String getLocalidad() {
        return localidad;
    }

     @Override
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

     @Override
    public String getGerente() {
        return gerente;
    }

     @Override
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "AlojamientoExtraHotelero{" + "privacidad=" + privacidad + ", m2=" + m2 + '}';
    }
    
    public void privado(){
    
        String aux = leer.next();
        System.out.println("Es el alojamiento privado? 'si/no' ");
        if ("si".equals(aux)) {
            setPrivacidad(true);
            System.out.println("El alojamiento es privado");
        }else{setPrivacidad(false);}
    }
    
    public void metrosCuadrados(){
    
        System.out.println("Ingrese los metros cuadrados que contiene el establecimiento");
        setM2(leer.nextInt());
        System.out.println("Los metros cuadrados son : " + getM2() + "m2");
    }
     
}
