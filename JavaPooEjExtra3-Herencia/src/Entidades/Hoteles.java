
package Entidades;

import java.util.Scanner;


public class Hoteles extends Alojamientos {
    
    private String cantidadHabitacioes;
    private Integer numeroCamas;
    private Integer cantidadPisos;
    private Integer Gimnasio;
    private String nombreRestarurant;
    private Integer capacidadRestaurant;
    private Integer cantidadSalonesConferencia;
    private Integer cantidadSuites;
    private Integer CantidadLimosinas;
    private String hotelA;
    private String hotelB;
    private Integer capacidadHotel;
    private Integer precioHabitaciones;

    public Hoteles() {
    }

    public Hoteles(String cantidadHabitacioes, Integer numeroCamas, Integer cantidadPisos, Integer Gimnasio,String nombreRestarurant, Integer capacidadRestaurant, Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer CantidadLimosinas, String hotelA, String hotelB, Integer capacidadHotel, Integer precioHabitaciones) {
        this.cantidadHabitacioes = cantidadHabitacioes;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.Gimnasio = Gimnasio;  
        this.nombreRestarurant = nombreRestarurant;
        this.capacidadRestaurant = capacidadRestaurant;
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.CantidadLimosinas = CantidadLimosinas;
        this.hotelA = hotelA;
        this.hotelB = hotelB;
        this.capacidadHotel = capacidadHotel;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Hoteles(String cantidadHabitacioes, Integer numeroCamas, Integer cantidadPisos, Integer Gimnasio, String nombreRestarurant, Integer capacidadRestaurant, Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer CantidadLimosinas, String hotelA, String hotelB, Integer capacidadHotel, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitacioes = cantidadHabitacioes;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.Gimnasio = Gimnasio;
        this.nombreRestarurant = nombreRestarurant;
        this.capacidadRestaurant = capacidadRestaurant;
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.CantidadLimosinas = CantidadLimosinas;
        this.hotelA = hotelA;
        this.hotelB = hotelB;
        this.capacidadHotel = capacidadHotel;
        this.precioHabitaciones = precioHabitaciones;
    }

    public String getCantidadHabitacioes() {
        return cantidadHabitacioes;
    }

    public void setCantidadHabitacioes(String cantidadHabitacioes) {
        this.cantidadHabitacioes = cantidadHabitacioes;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getGimnasio() {
        return Gimnasio;
    }

    public void setGimnasioA(Integer Gimnasio) {
        this.Gimnasio = Gimnasio;
    }



    public String getNombreRestarurant() {
        return nombreRestarurant;
    }

    public void setNombreRestarurant(String nombreRestarurant) {
        this.nombreRestarurant = nombreRestarurant;
    }

    public Integer getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(Integer capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Integer getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(Integer cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return CantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer CantidadLimosinas) {
        this.CantidadLimosinas = CantidadLimosinas;
    }

    public String getHotelA() {
        return hotelA;
    }

    public void setHotelA(String hotelA) {
        this.hotelA = hotelA;
    }

    public String getHotelB() {
        return hotelB;
    }

    public void setHotelB(String hotelB) {
        this.hotelB = hotelB;
    }

    public Integer getCapacidadHotel() {
        return capacidadHotel;
    }

    public void setCapacidadHotel(Integer capacidadHotel) {
        this.capacidadHotel = capacidadHotel;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getLocalidad() {
        return localidad;
    }

    @Override
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String getGerente() {
        return gerente;
    }

    @Override
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

   

    public void ScioAlojamiento(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     //Hoteles a1 = new Hoteles();
        System.out.println("Ingrese el nombre del alojamiento");
        setNombre(leer.next());
        System.out.println("Ingrese la direccion del alojamiento");
        setDireccion(leer.next());
        System.out.println("Ingrese la localidad del alojamiento");
        setLocalidad(leer.next());
        System.out.println("Ingrese quien es el gerente encargado del alojamiento");
        setGerente(leer.next());
     Integer precioFijo = 50;
     System.out.println("Ingrese la capacidad (cantidad de personas ) que puede albergar el hotel");
     Integer capacidad = leer.nextInt();
     setCapacidadHotel(capacidad *1);
     System.out.println("Ingrese la capacidad (Cantidad de persona) que puede albergar el restauratn");
     Integer capacidad2 = leer.nextInt();
     
     if (capacidad2 < 30) {
         setCapacidadRestaurant(10);
     }else if(capacidad2 >= 30 || capacidad2 <= 50){
         setCapacidadRestaurant(30);
     }else if(capacidad2 >= 50){
         setCapacidadRestaurant(50);
     }
     System.out.println("Ingrese con que tipo de Gimnasio cuenta el hotel a/b");
     String tipoGimnasio = leer.next();
     if ("a".equals(tipoGimnasio)) {
         setGimnasioA(50);
     }else if("b".equals(tipoGimnasio)){
         setGimnasioA(30);
     }
     System.out.println("Ingrese la cantidad de limusinas que posee el hotel");
     Integer cantidadLimusinas = leer.nextInt();
     setCantidadLimosinas(cantidadLimusinas*15);
     setPrecioHabitaciones(precioFijo+getCapacidadHotel()+getGimnasio()+getCapacidadRestaurant()+getCantidadLimosinas());
     System.out.println("El precio de las habitaciones es: " + getPrecioHabitaciones().toString());
     
     
 }

    @Override
    public String toString() {
        return "Hoteles{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente +  " cantidadHabitacioes=" + cantidadHabitacioes + ", numeroCamas=" + numeroCamas + ", cantidadPisos=" + cantidadPisos + ", Gimnasio=" + Gimnasio + ", nombreRestarurant=" + nombreRestarurant + ", capacidadRestaurant=" + capacidadRestaurant + ", cantidadSalonesConferencia=" + cantidadSalonesConferencia + ", cantidadSuites=" + cantidadSuites + ", CantidadLimosinas=" + CantidadLimosinas + ", hotelA=" + hotelA + ", hotelB=" + hotelB + ", capacidadHotel=" + capacidadHotel + ", precioHabitaciones=" + precioHabitaciones + '}';
    }

   
    
}
