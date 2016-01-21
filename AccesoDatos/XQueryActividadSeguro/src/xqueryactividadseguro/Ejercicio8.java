package xqueryactividadseguro;

import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio8 {

    public static void main(String args[]) {
        // Obtener los asegurados de la poliza 99000000, obteniendo un nuevo formato
        // con un campo nombre, un contador de garantias y un total de importe

        Collection col = Herramientas.connectExistDB("prueba2", "admin");
        Herramientas.consultExistDB(col, "for $a in //poliza[numero=99000000]/asegurado \n"
                + "return\n"
                + "<newaseg> \n"
                + "<nombre>\n"
                + "{concat($a/@nombre,' ',$a/@apellidos)} \n"
                + "</nombre> \n"
                + "<numgars imptotal=\"{sum($a/garantia/capital)}\"> \n"
                + "{count($a/garantia)} \n"
                + "</numgars> \n"
                + "</newaseg> ");
    }
}
