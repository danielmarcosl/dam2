package xqueryactividadseguro;

import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio4 {

    public static void main(String args[]) {
        // Mostrar todos los tomadores del seguro, normal, ordenados de manera ascendente
        // y  de manera descendente ( tenemos que ver las tres formas de manera independiente)

        Collection col = Herramientas.connectExistDB("prueba2", "admin");
        System.out.println("\nNormal:");
        Herramientas.consultExistDB(col, "for $a in //tomador return $a");
        System.out.println("\nAscendente:");
        Herramientas.consultExistDB(col, "for $a in //tomador order by $a ascending return $a");
        System.out.println("\nDescendente:");
        Herramientas.consultExistDB(col, "for $a in //tomador order by $a descending return $a");
    }
}
