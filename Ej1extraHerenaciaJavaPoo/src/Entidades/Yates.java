
package Entidades;

import java.util.Scanner;


public class Yates extends BarcosAMotor {
    
    private Integer numerosCamarotes;

    public Yates() {
    }

    public Yates(Integer numerosCamarotes) {
        this.numerosCamarotes = numerosCamarotes;
    }

    public Yates(Integer numerosCamarotes, Integer CV) {
        super(CV);
        this.numerosCamarotes = numerosCamarotes;
    }

    public Yates(Integer numerosCamarotes, Integer CV, String matricula, Integer eslora, Integer añoFabricacion, Integer precioAlquilerDiario) {
        super(CV, matricula, eslora, añoFabricacion, precioAlquilerDiario);
        this.numerosCamarotes = numerosCamarotes;
    }

    public Integer getNumerosCamarotes() {
        return numerosCamarotes;
    }

    public void setNumerosCamarotes(Integer numerosCamarotes) {
        this.numerosCamarotes = numerosCamarotes;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public Integer getEslora() {
        return eslora;
    }

    @Override
    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    @Override
    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    @Override
    public void setAñoFabricacion(Integer añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public Integer getPrecioAlquilerDiario() {
        return precioAlquilerDiario;
    }

    @Override
    public void setPrecioAlquilerDiario(Integer precioAlquilerDiario) {
        this.precioAlquilerDiario = precioAlquilerDiario;
    }

    @Override
    public Scanner getLeer() {
        return leer;
    }

    @Override
    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    
    
    public void crearYate(){
    
        super.crearbarcoMotor();
        System.out.println("Ingrese la cantidada de camarotes");
        setNumerosCamarotes(leer.nextInt());
        setPrecioAlquilerDiario(getPrecioAlquilerDiario()+getNumerosCamarotes());
    }

    @Override
    public String toString() {
        return "Yates{"+ super.toString() +  "numerosCamarotes=" + numerosCamarotes +  '}';
    }
    
    
    
}
