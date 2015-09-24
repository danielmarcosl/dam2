package Herramientas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
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

    public static void eliminarDuplicados(ArrayList ar) {

        HashSet hash = new HashSet(ar);
        ArrayList ar2 = new ArrayList(hash);
//        Iterator it = ar2.iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }

    public static String convertUTF(String txt, int largo) {

        if (txt.length() > largo) {
            return txt.substring(0, largo);
        }
        for (int n = txt.length(); n < largo; n++) {
            txt = txt + " ";
        }
        return txt;
    }
}
