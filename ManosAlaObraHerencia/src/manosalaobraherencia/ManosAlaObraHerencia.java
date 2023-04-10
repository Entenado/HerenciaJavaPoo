
package manosalaobraherencia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class ManosAlaObraHerencia {

    
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        
        
        Animal a1 = new Animal("hola");
        Perro a = new Perro( "Guau!, soy un perro");
        Gato b = new Gato("Miau!, soy ung gato");
        
        
        animales.add(a1);
        animales.add(a);
        animales.add(b);
        
        a1.hacerRuido(a1);
        b.hacerRuido();
        a.hacerRuido();
        for (Animal aux : animales) {
           
            System.out.println(animales.toString());
           
        }
    }
    
}
