package Libros;

import Herramientas.Herramientas;
import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio01 {

    public static void main(String args[]) {

        // Añadir un nuevo atributo en los libros publicados despues de 1999, cambio:”siglo”
        Collection col = Herramientas.connectExistDB("prueba", "admin");
        Herramientas.consultExistDB(col, "for $doc in //libro[@ano = '1999']\n"
                + "let $a := update insert attribute cambio{'siglo'} into $doc\n"
                + "return $doc");
    }
}
