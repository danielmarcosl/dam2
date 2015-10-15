package Herramientas;

/**
 * @author Alvaro Gomez Muñoz
 * @version 1.0.1 de Octubre de 2015
 */
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
        // Iteraramos la coleccion
        Iterator it = colec.iterator();

        // Recorremos la coleccion e imprimimos todos los valores
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
        // Iteramos el map
        Iterator it = map.keySet().iterator();

        // Recorremos el map e imprimimos la clave y el valor
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
        // Iteramos el map
        Iterator it = map.keySet().iterator();

        // Recorremos el map e imprimimos la clave y el valor
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
        // Si la longitud del String es mayor que el integer asociado
        // Devuelve un substring del String dado
        if (txt.length() > largo) {
            return txt.substring(0, largo);
        }
        // Si el String es menor, añadirle espacios en blanco
        for (int n = txt.length(); n < largo; n++) {
            txt = txt + " ";
        }
        return txt;
    }

    // Metodos asociados a Tokens2.java
    /**
     * Metodo para leer fichero mediante BufferedReader
     *
     * @param br BufferedReader declarado previamente
     * @param ar ArrayList de Integer declarado previamente
     */
    public static void leerFichero(BufferedReader br, ArrayList<Integer> ar) {
        // Declaramos variable para luego almacenar las lineas leidas del fichero
        String linea;
        try {
            // Se almacenan las lineas mientras haya lineas
            while ((linea = br.readLine()) != null) {
                // Declaracion de StringTokenizer para la linea almacenada
                // con el token !
                StringTokenizer tok = new StringTokenizer(linea, "!");
                // Mientras haya tokens, añadirlos al ArrayList<Integer>
                while (tok.hasMoreTokens()) {
                    ar.add(Integer.parseInt(tok.nextToken()));
                    ar.add(Integer.parseInt(tok.nextToken()));
                }
            }
            // Cerrar el fichero
            br.close();
            // SI ha habido un error, mostrarlo
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
        // Declarar e inicializar contador
        int count = 0;

        // Recorrer el ArrayList<Integer>
        for (int i = 0; i < ar.size(); i++) {
            // Si un valor es menor de 10, aumentar el contador
            if (ar.get(i) < 10) {
                count++;
            }
        }
        // Devolver el valor del contador
        return count;
    }

    /**
     * Metodo para contar los Integers de un ArrayList mayores o igual a 10
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Cantidad de Integers mayores o igual a 10
     */
    public static int contarDosCifras(ArrayList<Integer> ar) {
        // Declarar e inicializar el contador
        int count = 0;

        // Recorrer el ArrayList<Integer>
        for (int i = 0; i < ar.size(); i++) {
            // Si un valor es igual o mayor a 10, aumentar el contador
            if (ar.get(i) >= 10) {
                count++;
            }
        }
        // Devolver el valor del contador
        return count;
    }

    /**
     * Metodo para sumar los Integers menores de 10 de un ArrayList
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Suma de los integers
     */
    public static int sumaUnaCifra(ArrayList<Integer> ar) {
        // Declarar e inicializar una variable para añadir numeros y sumarlos
        int suma = 0;

        // Recorremos el ArrayList<Integer>
        for (int i = 0; i < ar.size(); i++) {
            // Si un valor es menor a 10, sumarlo a la variable
            if (ar.get(i) < 10) {
                suma += ar.get(i);
            }
        }
        // Devolver el valor de la suma
        return suma;
    }

    /**
     * Metodo para sumar los Integers mayores o igual a 10 de un ArrayList
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Suma de los integers
     */
    public static int sumaDosCifras(ArrayList<Integer> ar) {
        // Declarar e inicializar una variable para añadir numeros y sumarlos
        int suma = 0;

        //Recorremos el ArrayList<Integer>
        for (int i = 0; i < ar.size(); i++) {
            // Si un valor es mayor o igual a 10, sumarlo a la variable
            if (ar.get(i) >= 10) {
                suma += ar.get(i);
            }
        }
        // Devolver el valor de la variable
        return suma;
    }

    /**
     *
     * @param array
     * @param ruta
     * @throws IOException
     */
    public static void serializarArray(int array[], String ruta) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
        salida.writeObject(array);
        salida.close();
    }

    /**
     *
     * @param ruta
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void deserializarArray(String ruta) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta));
        int[] obj = (int[]) entrada.readObject();
        for (int i = 0; i < obj.length; i++) {
            System.out.println("El objeto es: " + obj[i]);
        }
        entrada.close();
    }

    /**
     *
     * @param obj
     * @param ruta
     * @throws IOException
     */
    public static void serializarObject(Object obj, String ruta) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
        salida.writeObject(obj);
        salida.close();
    }

    /**
     *
     * @param ruta
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void deserializarObject(String ruta) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta));
        Object obj = (Object) entrada.readObject();
        System.out.println("El objeto es: " + obj);
        entrada.close();
    }

    /**
     * Metodo para escribir "n" objetos entro de un fichero
     *
     * @param escribir
     * @param objeto
     * @throws IOException
     */
    public static void escribirObjetos(ObjectOutputStream escribir, Object objeto) throws IOException {
        escribir.writeObject(objeto);
    }

    /**
     * Metodo para leer "n" objetos dentro de un fichero
     *
     * @param leer
     * @param objeto
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void leerObjetos(ObjectInputStream leer) throws IOException, ClassNotFoundException {
        try {
            while (true) {
                Object c = (Object) leer.readObject();
                System.out.println(c);
            }
        } catch (EOFException ex) {
            // tratamiento de Accion (-pintar pantalla -guardar en una coleccion -guardar en un Map -guardar fichero
            System.out.println("Final de fichero");
        } finally {
            if (leer != null) {
                leer.close();
            }
        }
    }

    public static void escribirMap(ObjectOutputStream ob, Map mapa) throws IOException {
        ob.writeObject(mapa);
    }

    public static void leerMap(ObjectInputStream ob) throws IOException, ClassNotFoundException {
        Map m = null;
        try {
            while (true) {
                m = (HashMap) ob.readObject();
            }
        } catch (EOFException e) {
            System.out.println("Final del fichero");

            Iterator it = m.keySet().iterator();
            while (it.hasNext()) {
                Integer clave = (Integer) it.next();
                Object valor = (Object) m.get(clave);
                System.out.println(m.toString());
            }
        } finally {
            if (ob != null) {
                ob.close();
            }
        }
    }
}
