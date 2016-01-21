package xqueryactividadseguro;

import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio9 {

    public static void main(String args[]) {
        // Obtener una relación de polizas ordenada s por el numero de asegurados,
        // y dentro de cada una la relacion de asegurados ordenados por el numero de garantias

        Collection col = Herramientas.connectExistDB("prueba2", "admin");
        Herramientas.consultExistDB(col, "for $a in //poliza \n"
                + "order by count($a/asegurado) \n"
                + "return <pol id=\"{$a/numero}\"  \n"
                + "numaseg=\"{count($a/asegurado)}\"> \n"
                + "{for $b in $a/asegurado \n"
                + "order by count($b/garantia) \n"
                + "return   \n"
                + "<aseg numgar=\"{count($b/garantia)}\" \n"
                + "nombre=\"{$b/@nombre}\"> \n"
                + "</aseg>} \n"
                + "</pol> ");
    }
}
