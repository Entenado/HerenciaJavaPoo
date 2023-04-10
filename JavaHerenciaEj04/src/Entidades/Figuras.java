
package Entidades;

import java.util.Scanner;
import javaherenciaej04.interfaces.calculosFormas;


public final class Figuras implements calculosFormas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void calcularAreaCirculo(Double pi, int radio) {
//       pi= 3.14;
//        //System.out.println("Ingrese el radio del circulo");
//        radio = leer.nextInt();
        Double area = pi*(Math.pow(radio, 2));
        System.out.println("El area del circulo es: " + area);
    }
    

    @Override
    public void calcularPerimetroCirculo(Double pi, int diametro) {
        pi= 3.14;
        //System.out.println("Ingrese el diametro del circulo");
        Double perimetro = pi * diametro;
        System.out.println("El diametro es: "+ perimetro);
        
    }

    @Override
    public void calcularAreaRectangulo(int base, int altura) {
        
        int areaR = base * altura;
        System.out.println("el area del rectangulo es: " + areaR);
    }

    @Override
    public void calcularPerimetroRectangulo(int base, int altura) {
        int perimetroR = (base + altura) *2;
        System.out.println("El perimetro del rectangulo es: " + perimetroR);
    }

   

   
    
}
