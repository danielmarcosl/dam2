package proyectoad2;

import Herramientas.Herramientas;
import org.xmldb.api.base.Collection;
/**
 *
 * @author Daniel Marcos Lorrio
 */
public class ProyectoAD2 {

    public static void main(String[] args) {
        Collection col = Herramientas.connectExistDB("prueba","admin");
        Herramientas.consultExistDB(col, "for $t in //titulo return $t");
    }
}
