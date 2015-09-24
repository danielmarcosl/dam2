package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

    public static void buscarDuplicados(ArrayList ar) {

        // Declaramos un escaner
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca un string mediante el escaner
        String posible = sc.next();
        
        // Si lo introducido existe, mostramos que existe, sino, lo añadimos a la lista
        if(ar.contains(sc) == true) {
            System.out.println("Esta duplicado");
        } else {
            ar.add(sc);
        }
        
        // Mostramos la lista
        Iterator it = ar.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String args[]) {

        // Creamos una lista y añadimos varios datos
        ArrayList list = new ArrayList();

        list.add("Perro");
        list.add("Gato");
        list.add("Pato");
        list.add("Agaporni");
        list.add("Gato");
        list.add("Perro");

        buscarDuplicados(list);
    }

}
