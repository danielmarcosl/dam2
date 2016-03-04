package XQuery;

import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class EjXQuery {

    public static void main(String args[]) {

        Collection c = Herramientas.connectExistDB("pelicula", "admin");

        // Ejercicio2
        System.out.println("Ejercicio2\n");
        Herramientas.operationExistDB(c,
                "for $a in //pelicula\n"
                + "where $a/count(director) > 1\n"
                + "return data($a/@fechaEstreno)");

        // Ejercicio 3
        System.out.println("\n\nEjercicio 3\n");
        Herramientas.operationExistDB(c,
                "for $a in //pelicula\n"
                + "where $a/director = 'Ethan Coen'\n"
                + "and $a/count(director) = 1\n"
                + "return $a/titulo");
    }
}
