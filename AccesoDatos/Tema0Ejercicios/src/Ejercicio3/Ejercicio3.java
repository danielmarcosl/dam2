package Ejercicio3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio3 {

    public static void recorrerMapa(Map map) {

        Iterator it = map.keySet().iterator();
        
        while (it.hasNext()) {
            String clave = (String) it.next();
            String valor = (String) map.get(clave);
            System.out.println(clave + " " + valor);
        }
    }

    public static void main(String args[]) {

        // Declaramos el mapa
        HashMap<String, String> agenda = new HashMap<String, String>();

        // Aniadimos los datos al mapa
        agenda.put("Doctor", "(+52)-4000-5000");
        agenda.put("Casa", "(888)-4500-3400");
        agenda.put("Hermano", "/575)-2042-3233");
        agenda.put("Tio", "(421)-1010-0020");
        agenda.put("Suegros", "(334)-6105-4334");
        agenda.put("Oficina", "(304)-5205-8454");
        agenda.put("Abogado", "(756)-1205-3454");
        agenda.put("Papa", "(55)-9555-3270");
        agenda.put("Tienda", "(874)-2400-8600");

        // Lanzamos el metodo para recorrer el mapa
        recorrerMapa(agenda);
    }
}
