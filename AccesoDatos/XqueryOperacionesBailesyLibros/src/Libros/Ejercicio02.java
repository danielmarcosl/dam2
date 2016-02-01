package Libros;

import Herramientas.Herramientas;
import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio02 {

    public static void main (String args[]) {

        // Anadir un nuevo titulo <titulo>TCP/IP ilustrado</titulo> pero solo donde el titulo sea TCP/IP Illustrated
        
        Collection col = Herramientas.connectExistDB("prueba", "admin");
        Herramientas.operationExistDB(col, "let $doc := //libro[titulo = 'TCP/IP Illustrated']\n"
                + "let $a := update insert <titulo>{'TCP/IP Ilustrado'}</titulo> into $doc\n"
                + "return $doc");
    }
}
