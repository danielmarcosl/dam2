package Ejercicios;

import java.io.*;
import java.util.*;

public class Ejercicio1 {

    public static void recorrerColeccion(Collection colec) {
        Iterator it = colec.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String args[]) {

        Equipo equipo1 = new Equipo();
        equipo1.nuevoEquipo("HP", 10, 288);
        Equipo equipo2 = new Equipo();
        equipo2.nuevoEquipo("Acer", 9, 283);
        Equipo equipo3 = new Equipo();
        equipo3.nuevoEquipo("Mitsubishi", 4, 443);
        Equipo equipo4 = new Equipo();
        equipo4.nuevoEquipo("Vaio", 8, 980);
        Equipo equipo5 = new Equipo();
        equipo5.nuevoEquipo("Lenovo", 19, 700);
        Equipo equipo6 = new Equipo();
        equipo6.nuevoEquipo("Apple", 5, 1200);

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        list1.add(equipo1);
        list1.add(equipo2);
        list1.add(equipo3);

        list2.add(equipo4);
        list2.add(equipo5);
        list2.add(equipo6);
        
        ArrayList list3 = new ArrayList();
        
        for(int i = 0; i < list1.size(); i++) {
            list3.add(list1.get(i));
            System.out.println(list3.get(i));
        }
        
    }
}
