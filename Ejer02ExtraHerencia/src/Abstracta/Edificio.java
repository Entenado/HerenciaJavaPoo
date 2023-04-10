package Abstracta;

/**
 *
 * @author nickl
 */
public abstract class Edificio {

    protected Double Superficie, Volumen;

    public Edificio() {
    }

    public Edificio(Double Superficie, Double Volumen) {
        this.Superficie = Superficie;
        this.Volumen = Volumen;
    }

    public abstract void calcularSuperficie(double ancho, double largo);

    public abstract void calcularVolumen(double ancho, double alto, double largo);

}
