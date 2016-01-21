package xqueryactividadseguro;

import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio5 {

    public static void main(String args[]) {
        // Obtener un nuevo elemento poliza que contenga
        //un parametro nuevo con el numero de asegurados

        Collection col = Herramientas.connectExistDB("prueba2", "admin");
        Herramientas.consultExistDB(col, "for $a in //poliza\n"
                + "let $b := count($a/asegurado)\n"
                + "return <poliza numaseg=\"{$b}\"></poliza>");
    }
}
