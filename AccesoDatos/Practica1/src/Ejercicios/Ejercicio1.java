package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

    public static void main(String args[]) {

        // Creamos 6 equipos
        Equipo equipo1 = new Equipo();
        equipo1.nuevoEquipo("HP", 10, 318);
        Equipo equipo2 = new Equipo();
        equipo2.nuevoEquipo("Acer", 9, 400);
        Equipo equipo3 = new Equipo();
        equipo3.nuevoEquipo("Mitsubishi", 4, 443);
        Equipo equipo4 = new Equipo();
        equipo4.nuevoEquipo("Vaio", 8, 925);
        Equipo equipo5 = new Equipo();
        equipo5.nuevoEquipo("Lenovo", 19, 700);
        Equipo equipo6 = new Equipo();
        equipo6.nuevoEquipo("Apple", 5, 1200);

        // Creamos un ArrayList para los equipos sin descuento
        ArrayList<Equipo> equi1 = new ArrayList<Equipo>();
        equi1.add(equipo1);
        equi1.add(equipo2);
        equi1.add(equipo3);
        equi1.add(equipo4);
        equi1.add(equipo5);
        equi1.add(equipo6);

        // Creamos otro ArrayList para los equipos con descuento
        ArrayList<Equipo> equi2 = new ArrayList<Equipo>();
        equi2.add(equipo1);
        equi2.add(equipo2);
        equi2.add(equipo3);
        equi2.add(equipo4);
        equi2.add(equipo5);
        equi2.add(equipo6);

        // Declaramos otro ArrayList que contendrá la lista de precios ordenada de menor a mayor
        ArrayList<Double> ordenprecios = new ArrayList<Double>();

        // Añadimos los precios de la lista sin descuento
        for (int i = 0; i < equi1.size(); i++) {
            ordenprecios.add(equi1.get(i).getPrecio());
        }

        // Aplicamos el descuento a la segunda lista
        for (int i = 0; i < equi2.size(); i++) {
            equi2.get(i).descuentoEquipo();
        }

        // Añadimos los precios de la lista con descuento
        for (int i = 0; i < equi2.size(); i++) {
            ordenprecios.add(equi2.get(i).getPrecio());
        }

        // Mostramos el equipo con menor y mayor precio
        System.out.println(Collections.min(ordenprecios));
        System.out.println(Collections.max(ordenprecios));
    }
}
