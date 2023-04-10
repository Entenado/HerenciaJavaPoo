
package ServicioAlquileres;

import Entidades.Alquiler;
import Entidades.BarcosAMotor;
import Entidades.Veleros;
import Entidades.Yates;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class ServicioAlquileres {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alquiler crearAlquiler(){
    Alquiler a1 = new Alquiler();
        System.out.println("Ingrese nombre del cliente");
        a1.setNombre(leer.next());
        System.out.println("Ingrese el documento");
        a1.setDocumento(leer.nextInt());
        System.out.println("Ingrese la dd/mm/aaaa que alquila");
        Integer dia = leer.nextInt();
        Integer mes = leer.nextInt();
        Integer año = leer.nextInt();
        LocalDate aux;
        aux = LocalDate.of(año, mes, dia);
        a1.setFechaInicio(aux);
       System.out.println("Ingrese la dd/mm/aaaa de devolucion");
        dia = leer.nextInt();
        mes = leer.nextInt();
        año = leer.nextInt();
        LocalDate aux2;
        aux2 = LocalDate.of(año, mes, dia);
        a1.setFechaDevolucion(aux2);
        
        System.out.println("Ingrese la posicion de amarra");
        a1.setPosicion(leer.next());
        int opc;
        do {
        System.out.println("Que tipo de barco alquilara");
        System.out.println("1 - Velero");
        System.out.println("2 - Barco a motor");
        System.out.println("3 - Yate");
        opc = leer.nextInt();
        } while (opc <= 0 || opc >= 4);
        switch (opc){
            case 1 :
                Veleros v1 = new Veleros();
                v1.crearVelero();
                a1.setBarco(v1);
                break;
            case 2 :
                BarcosAMotor v2 = new BarcosAMotor();
                v2.crearbarcoMotor();
                a1.setBarco(v2);
                break;
                case 3 :
                Yates v3 = new Yates();
                v3.crearYate();
                a1.setBarco(v3);
                break;   
        }
       calcularAlquiler(a1); 
        return a1;
    }
    
    public void calcularAlquiler(Alquiler a1){
      
      long diasEntre= ChronoUnit.DAYS.between(a1.getFechaInicio(),a1.getFechaDevolucion() );
        System.err.println("el precio del alquiler es: " + (diasEntre*a1.getBarco().getPrecioAlquilerDiario()));
    }
}
