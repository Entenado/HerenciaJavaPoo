
package Entidades;

import java.util.Scanner;


public class Veleros extends Barco {

    private Integer mastiles;

    public Veleros() {
    }

    public Veleros(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros(Integer mastiles, String matricula, Integer eslora, Integer añoFabricacion, Integer precioAlquilerDiario) {
        super(matricula, eslora, añoFabricacion, precioAlquilerDiario);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
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

    
    
    
    
    
    public void crearVelero(){
    super.crearBarcos();
        System.out.println("Ingrese el numero de mastil");
        setMastiles(leer.nextInt());
        setPrecioAlquilerDiario(getPrecioAlquilerDiario()+getMastiles());
    }

    @Override
    public String toString() {
        return "Veleros{"+ super.toString()  + "mastiles=" + mastiles +'}';
    }
 
    
    
}
