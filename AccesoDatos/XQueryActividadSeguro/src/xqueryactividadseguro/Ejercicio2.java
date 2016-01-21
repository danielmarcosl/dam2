package xqueryactividadseguro;

import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio2 {

    public static void main(String args[]) {
        Collection col = Herramientas.connectExistDB("prueba2", "admin");
        Herramientas.consultExistDB(col, "let $a := //numero\n"
                + "let $b := //tomador\n"
                + "return $a | $b");
    }
}
