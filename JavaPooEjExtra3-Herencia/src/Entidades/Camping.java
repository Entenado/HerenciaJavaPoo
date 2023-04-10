
package Entidades;


public class Camping extends AlojamientoExtraHotelero {
   
    private Integer capacidadCarpas, cantidadBaños;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(Integer capacidadCarpas, Integer cantidadBaños, boolean restaurant) {
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBaños = cantidadBaños;
        this.restaurant = restaurant;
    }

    public Camping(Integer capacidadCarpas, Integer cantidadBaños, boolean restaurant, boolean privacidad, Integer m2) {
        super(privacidad, m2);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBaños = cantidadBaños;
        this.restaurant = restaurant;
    }

    public Camping(Integer capacidadCarpas, Integer cantidadBaños, boolean restaurant, boolean privacidad, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privacidad, m2, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBaños = cantidadBaños;
        this.restaurant = restaurant;
    }

    public Integer getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(Integer capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public Integer getCantidadBaños() {
        return cantidadBaños;
    }

    public void setCantidadBaños(Integer cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    
    @Override
    public boolean isPrivacidad() {
        return privacidad;
    }

    @Override
    public void setPrivacidad(boolean privacidad) {
        this.privacidad = privacidad;
    }

    @Override
    public Integer getM2() {
        return m2;
    }

    @Override
    public void setM2(Integer m2) {
        this.m2 = m2;
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

   
    
            public void camping(){
                System.out.println("Ingrese el nombre del camping");
                setNombre(leer.next());
                System.out.println("Ingrese la direccion del camping");
                setDireccion(leer.next());
                System.out.println("Ingrese la localidad del camping");
                setLocalidad(leer.next());
                System.out.println("Ingrese el nombre del gerente encargado");
                setGerente(leer.next());
            System.out.println("Ingrese la capacidad maxima de carpas");
            setCapacidadCarpas(leer.nextInt());
            System.out.println("Ingrese la cantidad de baños que posee el camping");
            setCantidadBaños(leer.nextInt());
            System.out.println("El camping posee restaurant?");
            String aux = leer.next();
            if ("si".equals(aux)) {
                setRestaurant(true);
                System.out.println("El camping posee restaurante");
            }else{setRestaurant(false);}
 
    }

    @Override
    public String toString() {
        return "Camping{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + "capacidadCarpas=" + capacidadCarpas + ", cantidadBa\u00f1os=" + cantidadBaños + ", restaurant=" + restaurant + '}';
    }
            
    
}
