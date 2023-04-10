/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer02extraherencia;

import Abstracta.Edificio;
import Abstracta.Oficinas;
import Abstracta.Poli;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nickl
 */
public class Ejer02ExtraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Edificio> lista = new ArrayList();

        System.out.println("Ingresar la Oficina 1: ");

        Oficinas o = new Oficinas();
        o.pedirUsuario();
        o.calcularSuperficie(40, 40);
        o.calcularVolumen(40, 40, (o.getCantPisos() * 2));

        System.out.println("Ingresar la Oficina 2: ");
        Oficinas o1 = new Oficinas();
        o1.pedirUsuario();
        o1.calcularSuperficie(20, 30);
        o1.calcularVolumen(20, 30, (o.getCantPisos() * 2));

        System.out.println("Poli 1: ");

        Poli p = new Poli();
        p.crearPoli();
        p.calcularSuperficie(100, 100);
        p.calcularVolumen(100, 100, 20);

        System.out.println("Poli 2: ");

        Poli p2 = new Poli();
        p2.crearPoli();
        p2.calcularSuperficie(50, 50);
        p2.calcularVolumen(50, 50, 20);

        lista.add(o1);
        lista.add(o);
        lista.add(p2);
        lista.add(p);

        System.out.println(lista);

        int cont = 0;

        for (Edificio var : lista) {

            if (var instanceof Poli) {

                Poli var1 = (Poli) var;

                if (var1.isTechado()) {
                    cont = cont + 1;
                }

            }

        }

        System.out.println("Techados: " + cont);

    }

}
