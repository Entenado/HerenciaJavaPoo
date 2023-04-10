/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioAlojamiento;


import Entidades.Hoteles;
import java.util.Scanner;

/**
 *
 * @author Abel
 */
public class ServicioAlojamiento {
    
 public Hoteles ScioAlojamiento(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Hoteles a1 = new Hoteles();
     Integer precioFijo = 50;
     System.out.println("Ingrese la capacidad (cantidad de personas ) que puede albergar el hotel");
     Integer capacidad = leer.nextInt();
     a1.setCapacidadHotel(capacidad *1);
     System.out.println("Ingrese la capacidad (Cantidad de persona) que puede albergar el restauratn");
     Integer capacidad2 = leer.nextInt();
     
     if (capacidad2 < 30) {
         a1.setCapacidadRestaurant(10);
     }else if(capacidad2 >= 30 || capacidad2 <= 50){
         a1.setCapacidadRestaurant(30);
     }else if(capacidad2 >= 50){
         a1.setCapacidadRestaurant(50);
     }
     System.out.println("Ingrese con que tipo de Gimnasio cuenta el hotel a/b");
     String tipoGimnasio = leer.next();
     if ("a".equals(tipoGimnasio)) {
         a1.setGimnasioA(50);
     }else if("b".equals(tipoGimnasio)){
         a1.setGimnasioA(30);
     }
     System.out.println("Ingrese la cantidad de limusinas que posee el hotel");
     Integer cantidadLimusinas = leer.nextInt();
     a1.setCantidadLimosinas(cantidadLimusinas*15);
     a1.setPrecioHabitaciones(precioFijo+a1.getCapacidadHotel()+a1.getGimnasio()+a1.getCapacidadRestaurant()+a1.getCantidadLimosinas());
     System.out.println("El precio de las habitaciones es: " + a1.getPrecioHabitaciones().toString());
     return a1;
     
 }

  
 
}
