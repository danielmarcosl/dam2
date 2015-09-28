package Herramientas;

/**
 * @author Daniel Marcos Lorrio
 * @version 0.288 28 de Septiembre de 2015
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class herramientas {

    /**
     * Metodo para recorrer listas
     *
     * @param colec Cualquier coleccion
     */
    public static void recorrerColeccion(Collection colec) {
        Iterator it = colec.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * Metodo para recorrer maps con clave String
     *
     * @param map Cualquier map
     */
    public static void recorrerMapStr(Map map) {

        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            String clave = (String) it.next();
            Object valor = (Object) map.get(clave);
            System.out.println(clave + " " + valor);
        }
    }

    /**
     * Metodo para recorrer maps con clave Integer
     *
     * @param map Cualquier map
     */
    public static void recorrerMapInt(Map map) {

        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            Integer clave = (Integer) it.next();
            Object valor = (Object) map.get(clave);
            System.out.println(clave + " " + valor);
        }
    }

    /**
     * Determinar el tamaño de una cadena dentro de un fichero aleatorio
     *
     * @param txt Cualquier string
     * @param largo Integer asociado al string
     * @return Cadena generada
     */
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

    /**
     * Metodo para leer fichero mediante BufferedReader
     *
     * @param br BufferedReader declarado previamente
     * @param ar ArrayList de Integer declarado previamente
     */
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

    /**
     * Metodo para recorrer un ArrayList de Integers e imprimirlos
     *
     * @param ar ArrayList de Integers declarado previamente
     */
    public static void listarFichero(ArrayList<Integer> ar) {
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
    }

    /**
     * Metodo para contar los Integers de un ArrayList menores de 10
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Cantidad de Integers menores de 10
     */
    public static int contarUnaCifra(ArrayList<Integer> ar) {
        int count = 0;

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) < 10) {
                count++;
            }
        }
        return count;
    }

    /**
     * Metodo para contar los Integers de un ArrayList mayores o igual a 10
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Cantidad de Integers mayores o igual a 10
     */
    public static int contarDosCifras(ArrayList<Integer> ar) {
        int count = 0;

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) >= 10) {
                count++;
            }
        }
        return count;
    }

    /**
     * Metodo para sumar los Integers menores de 10 de un ArrayList
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Suma de los integers
     */
    public static int sumaUnaCifra(ArrayList<Integer> ar) {
        int suma = 0;

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) < 10) {
                suma += ar.get(i);
            }
        }
        return suma;
    }

    /**
     * Metodo para sumar los Integers mayores o igual a 10 de un ArrayList
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Suma de los integers
     */
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
