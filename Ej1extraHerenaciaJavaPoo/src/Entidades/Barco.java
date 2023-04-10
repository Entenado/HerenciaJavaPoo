
package Entidades;

import java.util.Scanner;


public abstract class Barco {
    
    protected String matricula;
    protected Integer eslora;
    protected Integer añoFabricacion;
    protected Integer precioAlquilerDiario;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer añoFabricacion, Integer precioAlquilerDiario) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
        this.precioAlquilerDiario = precioAlquilerDiario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Integer añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Integer getPrecioAlquilerDiario() {
        return precioAlquilerDiario;
    }

    public void setPrecioAlquilerDiario(Integer precioAlquilerDiario) {
        this.precioAlquilerDiario = precioAlquilerDiario;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + ", precioAlquilerDiario=" + precioAlquilerDiario + ", leer=" + leer + '}';
    }
    
    
    public void crearBarcos (){
    
        System.out.println("Ingrese el año de fabricacion");
        setAñoFabricacion(leer.nextInt());
        System.out.println("Ingrese los metros de eslora");
        setEslora(leer.nextInt());
        System.out.println("Ingrese la matricula");
        setMatricula(leer.next());
        setPrecioAlquilerDiario(10*getEslora());
    }
    
    
}
