package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

    public static void main(String args[]) {

        // Creamos 6 equipos con precio normal
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

        // Creamos una copia de los 6 equipos
        Equipo equipo1d = new Equipo();
        equipo1d.nuevoEquipo(equipo1.getNombre(), equipo1.getCantidad(), equipo1.getPrecio());
        Equipo equipo2d = new Equipo();
        equipo2d.nuevoEquipo(equipo2.getNombre(), equipo2.getCantidad(), equipo2.getPrecio());
        Equipo equipo3d = new Equipo();
        equipo3d.nuevoEquipo(equipo3.getNombre(), equipo3.getCantidad(), equipo3.getPrecio());
        Equipo equipo4d = new Equipo();
        equipo4d.nuevoEquipo(equipo4.getNombre(), equipo4.getCantidad(), equipo4.getPrecio());
        Equipo equipo5d = new Equipo();
        equipo5d.nuevoEquipo(equipo5.getNombre(), equipo5.getCantidad(), equipo5.getPrecio());
        Equipo equipo6d = new Equipo();
        equipo6d.nuevoEquipo(equipo6.getNombre(), equipo6.getCantidad(), equipo6.getPrecio());

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
        equi2.add(equipo1d);
        equi2.add(equipo2d);
        equi2.add(equipo3d);
        equi2.add(equipo4d);
        equi2.add(equipo5d);
        equi2.add(equipo6d);

        // Aplicamos el descuento a la segunda lista
        for (int i = 0; i < equi2.size(); i++) {
            equi2.get(i).descuentoEquipo();
        }

        // Creamos variables para guardar el precio y la posición en el ArrayList
        // de cada lista, tanto para el precio menor como para el mayor
        // Asignamos valores que serán editados dentro de if para que no de error
        int menorEqui1 = 0;
        double precioMenorEqui1 = 2000;
        int menorEqui2 = 0;
        double precioMenorEqui2 = 2000;
        int mayorEqui1 = 0;
        double precioMayorEqui1 = 0;
        int mayorEqui2 = 0;
        double precioMayorEqui2 = 0;

        // Calculamos que equipo de la primera lista tiene menor y mayor precio
        for (int i = 0; i < equi1.size(); i++) {
            if (equi1.get(i).getPrecio() < precioMenorEqui1) {
                precioMenorEqui1 = equi1.get(i).getPrecio();
                menorEqui1 = equi1.indexOf(equi1.get(i));
            }
            if (equi1.get(i).getPrecio() > precioMayorEqui1) {
                precioMayorEqui1 = equi1.get(i).getPrecio();
                mayorEqui1 = equi1.indexOf(equi1.get(i));
            }
        }
        
        // Calculamos que equipo de la segunda lista tiene menor y mayor precio
        for (int i = 0; i < equi2.size(); i++) {
            if (equi2.get(i).getPrecio() < precioMenorEqui2) {
                precioMenorEqui2 = equi2.get(i).getPrecio();
                menorEqui2 = equi2.indexOf(equi2.get(i));
            }
            if (equi2.get(i).getPrecio() > precioMayorEqui2) {
                precioMayorEqui2 = equi2.get(i).getPrecio();
                mayorEqui2 = equi2.indexOf(equi2.get(i));
            }
        }
        
        // Comparamos los menores precios de cada lista y mostramos el menor
        if (precioMenorEqui1 < precioMenorEqui2) {
            System.out.println("Equipo con menor precio: " + equi1.get(menorEqui1).getNombre() + " " + equi1.get(menorEqui1).getPrecio());
        }else if (precioMenorEqui1 > precioMenorEqui2) {
            System.out.println("Equipo con menor precio: " + equi2.get(menorEqui2).getNombre() + " " + equi2.get(menorEqui2).getPrecio());
        }
        
        // Comparamos los mayores precios de cada lista y mostramos el mayor
        if (precioMayorEqui1 > precioMayorEqui2) {
            System.out.println("Equipo con mayor precio: " + equi1.get(mayorEqui1).getNombre() + " " + equi1.get(mayorEqui1).getPrecio());
        }else if (precioMayorEqui1 < precioMayorEqui2) {
            System.out.println("Equipo con mayor precio: " + equi2.get(mayorEqui2).getNombre() + " " + equi2.get(mayorEqui2).getPrecio());
        }
    }
}
