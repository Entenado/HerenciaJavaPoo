
package javapooejextra3.herencia;

import Entidades.Alojamientos;
import Entidades.Camping;
import Entidades.Hoteles;
import Entidades.Residencias;
import ServicioAlojamiento.ServicioAlojamiento;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class JavaPooEjExtra3Herencia {

    

  
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        ArrayList<Hoteles> hoteles = new ArrayList(); 
        ArrayList<Residencias>residencias = new ArrayList();
        ArrayList<Camping>camping = new ArrayList();
        
        System.out.println("Siendo el encargado de la informacion cargue los datos de los Establecimientos"); 
        String aux = "si" ;
        while("si".equals(aux)){
        System.out.println("Indique si desea o no cargar otro alojamiento 'si/no' ");
        aux = leer.next();
            System.out.println("Que tipo de alojamiento desea cargar? 'hotel' , 'residencia' , o 'camping' ");
           String aux2= leer.next();
            if ("hotel".equals(aux2)) {
                
        Hoteles a1 = new Hoteles();
        a1.ScioAlojamiento();
        hoteles.add(a1);
        

        Collections.sort(hoteles, (Hoteles a, Hoteles b)->b.getPrecioHabitaciones().compareTo(a.getPrecioHabitaciones()));
        System.out.println("-------------------------------------------");
//        for (Hoteles hotel : hoteles) {
//            
//            System.out.println("Los hoteles mas caros a mas baratos segun precio de habitacion son: " +hotel.toString());
//            System.out.println("----------------------------------------------");
//        } 
        
        }else if("residencia".equals(aux2)){

          Residencias a3 = new Residencias();
          a3.Dscto();
          a3.campoDep();
          a3.cantidadHabit();
          residencias.add(a3);
        
//        for (Residencias resid : residencias) {
//            if (resid.isDescuentoGremio()== true) {
//                System.out.println("La residencia que tiene descuento con gremio es : " + resid.getNombre());
//            }
//            System.out.println("Las residencias son:  " + resid.toString());
//            System.out.println("----------------------------------------------");
//            
//        }
        }else if("camping".equals(aux2)){
                  Camping a2 = new Camping();
          a2.camping();
          camping.add(a2);
        }
//        for (Camping campin : camping) {
//            if (campin.isRestaurant()== true) {
//                System.out.println("El camping : " + campin.getNombre() + "tiene restaurant");
//            }
//            System.out.println("Los camping son:  " + campin.toString());
//            System.out.println("----------------------------------------------");
//            
//        }
            
        }
        for (Hoteles hotel : hoteles) {
            
            System.out.println("Los hoteles mas caros a mas baratos segun precio de habitacion son: " +hotel.toString());
            System.out.println("----------------------------------------------");
        }
        for (Residencias resid : residencias) {
            if (resid.isDescuentoGremio()== true) {
                System.out.println("La residencia que tiene descuento con gremio es : " + resid.getNombre());
            }
            System.out.println("Las residencias son:  " + resid.toString());
            System.out.println("----------------------------------------------");
            
        }
        for (Camping campin : camping) {
            if (campin.isRestaurant()== true) {
                System.out.println("El camping : " + campin.getNombre() + "tiene restaurant");
            }
            System.out.println("Los camping son:  " + campin.toString());
            System.out.println("----------------------------------------------");
            
        }
        
        
        }
        
        
 
}
