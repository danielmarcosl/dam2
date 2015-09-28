package Herramientas;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

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
    //--------------------
    
    public static void leerFichero(BufferedReader br, ArrayList<Integer> ar) {
        String linea = null;
        try {
            while ((linea = br.readLine()) != null) {
                StringTokenizer tok = new StringTokenizer(linea, "!");
                while (tok.hasMoreTokens()) {
                    ar.add(Integer.parseInt(tok.nextToken()));
                    ar.add(Integer.parseInt(tok.nextToken()));
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void listarFichero(ArrayList<Integer> ar) {
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
    }

    public static int contarUnaCifra(ArrayList<Integer> ar) {
        int count = 0;

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) < 10) {
                count++;
            }
        }
        return count;
    }

    public static int contarDosCifras(ArrayList<Integer> ar) {
        int count = 0;

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) >= 10) {
                count++;
            }
        }
        return count;
    }

    public static int sumaUnaCifra(ArrayList<Integer> ar) {
        int suma = 0;

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) < 10) {
                suma += ar.get(i);
            }
        }
        return suma;
    }

    public static int sumaDosCifras(ArrayList<Integer> ar) {
        int suma = 0;

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) >= 10) {
                suma += ar.get(i);
            }
        }
        return suma;
    }
}
