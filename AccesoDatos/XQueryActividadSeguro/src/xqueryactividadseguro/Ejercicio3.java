package xqueryactividadseguro;

import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio3 {

    public static void main(String args[]) {
        // Obtener los nodos numero de polizas con mas de dos asegurados

        Collection col = Herramientas.connectExistDB("prueba2", "admin");
        Herramientas.consultExistDB(col, "for $a in //poliza\n"
                + "where $a/count(asegurado) = 1\n"
                + "return $a/numero");
    }
}
