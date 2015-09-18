package ProyectoAD;

import java.util.*;

public class Ciudades {

    public static void main(String args[]) {

        // Crear ciudades que vamos a guardar dentro de un ArrayList
        ArrayList ciudades = new ArrayList();

        ciudades.add(0, "Madrid");
        ciudades.add(1, "Barcelona");
        ciudades.add(2, "Valencia");
        ciudades.add(3, "Londres");
        ciudades.add(4, "Bilbao");

        // Mostrar el contenido del ArrayList con el contenido de las ciudades
        Iterator it = ciudades.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Mostrar la ciudad introducido en la primera y tercera posición
        for (int i = 0; i < ciudades.size(); i++) {
            switch (i) {
                case 0:
                    System.out.println("Primera entrada: " + ciudades.get(i));
                    break;
                case 2:
                    System.out.println("Tercera entrada: " + ciudades.get(i));
                    break;
            }
        }

        // Pediremos por teclado un número que será la posición que se deberá borrar del ArrayList
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número para borrar una entrada");
        num = scan.nextInt();

        // No consigo que esto funcione
        ciudades.remove(num);
        
        // Mostrar de nuevo el ArrayList
        Iterator it2 = ciudades.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // Buscar un elemento concreto de la lista, y tiene que indicar si existe o no
        String posibleCiudad;
        boolean ciudadEncontrada = false;
        Scanner scan2 = new Scanner(System.in);
        
        System.out.println("Introduce un nombre para buscar en la lista");
        posibleCiudad = scan2.nextLine();
        System.out.println("La ciudad introducida es " + posibleCiudad);
                
        for(int i = 0; i<ciudades.size(); i++)
        {
            if(posibleCiudad.equals(ciudades.get(i)))
            {
                System.out.println("La ciudad existe");
                ciudadEncontrada = true;
            }
        }
        
        if(ciudadEncontrada == false)
        {
            System.out.println("La ciudad no existe");
        }

        // Modificar una posición pedida por teclado con el valor de NULL
        // Mostrar nuevamente la lista para comprobar que está el valor NULL
    }
}
