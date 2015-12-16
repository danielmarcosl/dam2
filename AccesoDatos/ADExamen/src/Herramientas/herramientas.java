package Herramientas;

/**
 * @author Daniel Marcos Lorrio
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
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.filter.Filters;
import org.jdom2.output.XMLOutputter;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

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
     * Metodo para serializar un array en el fichero de la ruta introducida
     *
     * @param array Array introducido con cualquier tipo de valores
     * @param ruta Ruta donde se creara el fichero serializado
     * @throws IOException
     */
    public static void serializarArray(int array[], String ruta) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
        salida.writeObject(array);
        salida.close();
    }

    /**
     * Metodo para deserializar un array del fichero de la ruta indicada
     *
     * @param ruta Ruta donde esta el fichero serializado
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
     * Metodo para serializar un objeto en la ruta indicada
     *
     * @param obj Objeto introducido
     * @param ruta Ruta donde se creara el fichero serializado
     * @throws IOException
     */
    public static void serializarObject(Object obj, String ruta) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
        salida.writeObject(obj);
        salida.close();
    }

    /**
     * Metodo para deserializar el objeto del fichero de la ruta indicada
     *
     * @param ruta Ruta donde esta el fichero serializado
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
     * Metodo para leer "n" objetos dentro de un fichero
     *
     * @param leer ObjectInputStream con la ruta del fichero
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

    /**
     * Metodo para leer un map dentro de un fichero
     *
     * @param ob ObjectInputStream con la ruta del fichero
     * @throws IOException
     * @throws ClassNotFoundException
     */
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

    /**
     * Crear arbol de tres niveles
     *
     * @param root Element root
     * @param hijo ArrayList<Element> hijos de root
     * @param hijoDeHijo ArrayList<ArrayList<Element>> hijos de hijos de root
     */
    public static void crearArbol(Element root,
            ArrayList<Element> hijo,
            ArrayList<ArrayList<Element>> hijoDeHijo) {

        Element child;
        Element childchild;

        for (int j = 0; j < hijo.size(); j++) {
            child = hijo.get(j);
            for (int i = 0; i < hijoDeHijo.get(j).size(); i++) {
                childchild = hijoDeHijo.get(j).get(i);
                child.addContent(childchild);
            }
            root.addContent(child);
        }
    }

    /**
     * Crea un fichero xml a partir de un documento y lo muestra por pantalla
     *
     * @param documento Documento con elementos agregados previamente
     * @param nombre Nombre del fichero que se creara
     * @throws IOException
     */
    public static void escribirFicheroXML(Document documento, String nombre) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(documento, System.out);
        salida.output(documento, new FileOutputStream("C:\\petra\\" + nombre + ".xml"));
    }

    /**
     * Lee el fichero
     *
     * @param doc Fichero xml
     * @throws IOException
     */
    public static void leerFicheroXML(Document doc) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(doc, System.out);
    }

    /**
     * Lee el documento con la ruta xpath indicada
     *
     * @param doc Documento xml
     * @param ruta Ruta xpath
     */
    public static void xpath(Document doc, String ruta) {

        XPathExpression<Element> xpath = XPathFactory.instance().compile(ruta, Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getName() + ": " + at.getText());
        }
    }

    /**
     * Lee el documento con la ruta xpath indicada retornando el valor del
     * atributo indicado
     *
     * @param doc Documento xml
     * @param ruta Ruta xpath
     * @param val Nombre atributo
     */
    public static void xpathAttVal(Document doc, String ruta, String val) {

        XPathExpression<Element> xpath = XPathFactory.instance().compile(ruta, Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getName() + ": " + at.getAttributeValue(val));
        }
    }
}
