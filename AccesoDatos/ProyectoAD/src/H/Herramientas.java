package H;

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

public class Herramientas {

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

    public static String convertUTF(String txt, int largo) {
        if (txt.length() > largo) {
            return txt.substring(0, largo);
        }
        for (int n = txt.length(); n < largo; n++) {
            txt = txt + " ";
        }
        return txt;
    }

    public static void leerFichero(BufferedReader br, ArrayList<Integer> ar) {
        String linea;
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

    public static void serializarArray(int array[], String ruta) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
        salida.writeObject(array);
        salida.close();
    }

    public static void deserializarArray(String ruta) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta));
        int[] obj = (int[]) entrada.readObject();
        for (int i = 0; i < obj.length; i++) {
            System.out.println("El objeto es: " + obj[i]);
        }
        entrada.close();
    }

    public static void serializarObject(Object obj, String ruta) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
        salida.writeObject(obj);
        salida.close();
    }

    public static void deserializarObject(String ruta) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta));
        Object obj = (Object) entrada.readObject();
        System.out.println("El objeto es: " + obj);
        entrada.close();
    }

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

    public static void escribirFicheroXML(Document documento, String nombre) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(documento, System.out);
        salida.output(documento, new FileOutputStream("C:\\petra\\" + nombre + ".xml"));
    }

    public static void leerFicheroXML(Document doc) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(doc, System.out);
    }

    public static void xpath(Document doc, String ruta) {

        XPathExpression<Element> xpath = XPathFactory.instance().compile(ruta, Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getName() + ": " + at.getText());
        }
    }

    public static void xpathAttVal(Document doc, String ruta, String val) {

        XPathExpression<Element> xpath = XPathFactory.instance().compile(ruta, Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getAttributeValue(val));
        }
    }
}
