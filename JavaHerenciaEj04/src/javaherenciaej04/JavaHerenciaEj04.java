
package javaherenciaej04;

import Entidades.Figuras;
import java.util.Scanner;


public class JavaHerenciaEj04 {

    
    public  static void main (String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String aux = "si";
        String forma = null;
        Double pi = 3.14;
        
        while(!"no".equals(aux)){
            
            if ("circulo".equals(forma)) {
                Figuras a1 = new Figuras();
                System.out.println("Ingrese el radio del circulo");
                int radio = leer.nextInt();
                
                a1.calcularAreaCirculo(pi, radio);
                System.out.println("Ingrese el diametro del circulo");
                int diametro = leer.nextInt();
                a1.calcularPerimetroCirculo(pi, diametro);
            }else if("rectangulo".equals(forma)){
            
                Figuras a1 = new Figuras();
                System.out.println("Ingrese la base del rectangulo");
                int base = leer.nextInt();
                System.out.println("Ingrese la altura del rectangulo");
                int altura = leer.nextInt();
                a1.calcularAreaRectangulo(base, altura);
                a1.calcularPerimetroRectangulo(base, altura);
            }
            System.out.println("Desea ingresar otra forma?");
            aux = leer.next();
            System.out.println("Que forma desea ingresar");
            forma = leer.next();
        }
        
       //Figuras a1 = new Figuras();
       
      
    }
    
}
