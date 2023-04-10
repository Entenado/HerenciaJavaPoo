
package Entidades;

import java.util.Scanner;


public class BarcosAMotor extends Barco {
    
    private Integer CV;

    public BarcosAMotor() {
    }

    public BarcosAMotor(Integer CV) {
        this.CV = CV;
    }

    public BarcosAMotor(Integer CV, String matricula, Integer eslora, Integer añoFabricacion, Integer precioAlquilerDiario) {
        super(matricula, eslora, añoFabricacion, precioAlquilerDiario);
        this.CV = CV;
    }

    public Integer getCV() {
        return CV;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
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
    
    public void crearbarcoMotor(){
    
        super.crearBarcos();
        System.out.println("Ingrese la cantidad de caballos a vapor");
        setCV(leer.nextInt());
        setPrecioAlquilerDiario(getPrecioAlquilerDiario()+getCV());
    }

    @Override
    public String toString() {
        return "BarcosAMotor{"+ super.toString() +  "CV=" + CV +  '}';
    }
    
            
}
