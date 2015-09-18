package Ejercicios;

import java.io.*;
import java.util.*;
public class Ejercicio1 {

    public static void main(String args[]) {

        Equipo equipo1 = new Equipo();
        equipo1.nuevoEquipo("HP", 10, 288);
        Equipo equipo2 = new Equipo();
        equipo2.nuevoEquipo("Acer", 9, 283);
        
        ArrayList list1 = new ArrayList();
        
        list1.add(equipo1);
        
    }
}