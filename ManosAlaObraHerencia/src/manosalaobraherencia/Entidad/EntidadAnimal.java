
package manosalaobraherencia.Entidad;


public class EntidadAnimal {
    
    String saludo;
    int edad = 25;
    public EntidadAnimal() {
        
    }

    public EntidadAnimal(String saludo, Integer edad) {
        this.saludo = saludo;
        this.edad= edad;
    }
    public int getEdad(){
    return edad;
    
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    @Override
    public String toString() {
        return "EntidadAnimal{" + "saludo=" + saludo + '}';
    }
    
}
