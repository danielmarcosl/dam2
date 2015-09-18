package Herramientas;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class recorrerMap {

    public static void recorrerMapInt(Map map) {
        
        Iterator it = map.keySet().iterator();
        
        while (it.hasNext())
        {
            Integer clave = (Integer) it.next();
            Object valor = (Object) map.get(clave);
            System.out.println(clave + " " + valor);
        }
    }
}
