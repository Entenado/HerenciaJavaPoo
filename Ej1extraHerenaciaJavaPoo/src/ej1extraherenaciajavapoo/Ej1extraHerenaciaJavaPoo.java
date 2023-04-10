
package ej1extraherenaciajavapoo;

import Entidades.Alquiler;
import ServicioAlquileres.ServicioAlquileres;


public class Ej1extraHerenaciaJavaPoo {

    
    public static void main(String[] args) {
        
        ServicioAlquileres A = new ServicioAlquileres();
        Alquiler a1 = new Alquiler();
        a1 = A.crearAlquiler();
       
    }
    
}
