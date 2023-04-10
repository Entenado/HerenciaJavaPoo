
package javaherencia02;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;




public class JavaHerencia02 {

   
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico>electrodomesticos=new ArrayList();
         //Electrodomestico A = new Electrodomestico();
//         Electrodomestico Televisor = new Televisor();
//         Electrodomestico Lavadora = new Lavadora();
         
         //System.out.println("--------------------------------------");
         
         String aux = "null";
         String eleccion = null;
         Scanner leer = new Scanner(System.in);
//        do {
//            
//            System.out.println("Desea ingresar otro electrodomestico? si/no");
//            aux = leer.nextLine();
//            System.out.println("Que electrodomestico desea ingresar? lavarropa / televisor");
//            eleccion = leer.nextLine();
//            if ("lavarropa".equals(eleccion)) {
//                Lavadora.crearElectrodomestico();
//                Lavadora.precioFinal(Lavadora);
//                electrodomesticos.add(Lavadora);
//            }else if("televisor".equals(eleccion)){
//            Televisor.crearElectrodomestico();
//            Televisor.precioFinal(Televisor);
//            electrodomesticos.add(Televisor);
//            }
//            
//        } while (!"no".equals(aux));
        
        while(!"no".equals(aux)){
        System.out.println("Desea ingresar otro electrodomestico? si/no");
            aux = leer.nextLine();
            System.out.println("Que electrodomestico desea ingresar? lavarropa / televisor");
            eleccion = leer.nextLine();
            
            if ("lavarropa".equals(eleccion)) {
                Electrodomestico Lavadora = new Lavadora();
                Lavadora.crearElectrodomestico();
                Lavadora.precioFinal(Lavadora);
                electrodomesticos.add(Lavadora);
                
                
            }else if("televisor".equals(eleccion)){
            Electrodomestico Televisor = new Televisor();
            Televisor.crearElectrodomestico();
            Televisor.precioFinal(Televisor);
            electrodomesticos.add(Televisor);
            }
           
        }
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            
        }
        
         
        System.out.println(electrodomesticos);
    }
   
}
