package proyectoad2;

import Herramientas.Herramientas;
import org.xmldb.api.base.Collection;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class ProyectoAD2 {

    public static void main(String[] args) {
//        Collection col = Herramientas.connectExistDB("prueba", "admin");
//        Herramientas.operationExistDB(col, "for $doc in //libro/titulo\n"
//                + "let $a := update insert attribute traduccion{'espanol'} into $doc\n"
//                + "return $doc");
//        Herramientas.createTableSQLite("ejemplo", "create table companya("
//                + "id int primary key,"
//                + "nombre varchar(20),"
//                + "edad int,"
//                + "salary float);");
        
        Herramientas.insertArraySQLite("gestion", "java");
    }

    
}
