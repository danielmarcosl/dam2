package Herramientas;

import java.util.Iterator;
import java.util.Collection;

public class recorrerColeccion {

    public static void recorrerColeccion(Collection colec) {
        Iterator it = colec.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
