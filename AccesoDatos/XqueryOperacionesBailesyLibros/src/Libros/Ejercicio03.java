package Libros;

import Herramientas.Herramientas;
import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio03 {

    public static void main(String args[]) {

        // Anadir al nuevo titulo un atributo traduccion="Espanol”
        Collection col = Herramientas.connectExistDB("prueba", "admin");
        Herramientas.operationExistDB(col, "let $doc := //libro/titulo[. = 'TCP/IP Ilustrado']\n"
                + "let $a := update insert attribute traduccion{'Espanol'} into $doc\n"
                + "return $doc");
    }
}
