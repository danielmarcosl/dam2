package Herramientas;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class herramientas {

    public static void recorrerColeccion(Collection colec) {
        Iterator it = colec.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void recorrerMapStr(Map map) {

        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            String clave = (String) it.next();
            Object valor = (Object) map.get(clave);
            System.out.println(clave + " " + valor);
        }
    }

    public static void recorrerMapInt(Map map) {

        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            Integer clave = (Integer) it.next();
            Object valor = (Object) map.get(clave);
            System.out.println(clave + " " + valor);
        }
    }
}
