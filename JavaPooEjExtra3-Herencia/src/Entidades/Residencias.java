/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Abel
 */
public class Residencias extends AlojamientoExtraHotelero {
    private Integer cantidadHabitaciones;
    private boolean descuentoGremio, campoDeportivo;

    public Residencias() {
    }

    public Residencias(Integer cantidadHabitaciones, boolean descuentoGremio, boolean campoDeportivo) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(Integer cantidadHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean privacidad, Integer m2) {
        super(privacidad, m2);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(Integer cantidadHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean privacidad, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privacidad, m2, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public boolean isPrivacidad() {
        return privacidad;
    }

    @Override
    public void setPrivacidad(boolean privacidad) {
        this.privacidad = privacidad;
    }

    @Override
    public Integer getM2() {
        return m2;
    }

    @Override
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


    public void cantidadHabit(){
        System.out.println("Ingrese el nombre de la residencia");
                setNombre(leer.next());
                System.out.println("Ingrese la direccion de la residencia");
                setDireccion(leer.next());
                System.out.println("Ingrese la localidad de la residencia");
                setLocalidad(leer.next());
                System.out.println("Ingrese el nombre de la residencia");
                setGerente(leer.next());
        System.out.println("Ingrese la cantidad de habitaciones");
        setCantidadHabitaciones(leer.nextInt());
        System.out.println("La cantidad de habitaciones que posee la residencia es: " + getCantidadHabitaciones());
        
    }
    public void campoDep (){
    
        System.out.println("La residencia tiene campo deportivo? 'si/no' ");
        String aux = leer.next();
        if ("si".equals(aux)) {
            setCampoDeportivo(true);
        }else{setCampoDeportivo(false);}
    }
    
    public void Dscto(){
    
        System.out.println("La residencia tiene algun descuento para los gremios 'si/no' ");
        String aux2 = leer.next();
        if ("si".equals(aux2)) {
            setDescuentoGremio(true);
        }else{setDescuentoGremio(false);}
    }
    
        @Override
    public String toString() {
        return "Residencias{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente +  "cantidadHabitaciones=" + cantidadHabitaciones + ", descuentoGremio=" + descuentoGremio + ", campoDeportivo=" + campoDeportivo + '}';
    }

}
