package proyectoad2;

import Herramientas.Herramientas;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class ProyectoAD2 {

    public static void main(String[] args) {
        Collection col = Herramientas.connectExistDB("prueba", "admin");
//        Herramientas.operationExistDB(col, "for $doc in //libro/titulo\n"
//                + "let $a := update insert attribute traduccion{'espanol'} into $doc\n"
//                + "return $doc");
//        Herramientas.createTableSQLite("ejemplo", "create table companya("
//                + "id int primary key,"
//                + "nombre varchar(20),"
//                + "edad int,"
//                + "salary float);");
        Herramientas.operationExistDB(col, "let $b:= //libro/titulo\n"
                + "return $b");

//        ArrayList lista = new ArrayList();
//
//        lista.add(1);
//        lista.add("pepe");
//        lista.add(2);
//        lista.add("pepa");
//        lista.add(3);
//        lista.add("silvia");
//        
//        HashMap map = new HashMap();
//        map.put(1, "pepe");
//        map.put(2, "pepa");
//        map.put(3, "silvia");
//        
//        Herramientas.insertTokenizerSQLite("ejemplo");
    }

}
