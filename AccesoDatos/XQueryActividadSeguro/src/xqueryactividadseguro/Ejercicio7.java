package xqueryactividadseguro;

import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio7 {

    public static void main(String args[]) {
        // Obtener los asegurados que tienen contratada una garantia con un 
        // capital de 60000 o 80000 euros solo si esta en vigor

        Collection col = Herramientas.connectExistDB("prueba2", "admin");
        Herramientas.consultExistDB(col, "for $a in //asegurado[garantia/capital = 60000 or garantia/capital = 80000]\n"
                + "where $a/garantia/@vigor eq 'S'\n"
                + "return $a");
    }
}
