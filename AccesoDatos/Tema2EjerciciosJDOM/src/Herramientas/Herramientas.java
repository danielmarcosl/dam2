package Herramientas;

import Ejercicio1.Ejercicio01;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Herramientas {

    /**
     * Crear arbol de tres niveles
     *
     * @param root Element root
     * @param hijo ArrayList<Element> hijos de root
     * @param hijoDeHijo ArrayList<ArrayList<Element>> hijos de hijos de root
     */
    public static void crearArbolNivel3(Element root,
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
     * Coge los hijos y muestra su nombre y su texto
     *
     * @param lista
     * @param nombres
     */
    public static void cogerHijos(Document doc, String nombreHijo, String nombreHijoHijo) {

        // Cogemos el Element root
        Element root = doc.getRootElement();
        
        System.out.println("El nombre de la raiz es: " + root.getName());

        // Cogemos los hijos de root
        List<Element> hijos = root.getChildren(nombreHijo);

        Iterator i = hijos.iterator();

        while (i.hasNext()) {
            Element h = (Element) i.next();
            
            System.out.println("El nombre del elemento es: " + h.getName());

            List<Element> hijosHijos = h.getChildren(nombreHijoHijo);

            Iterator i2 = hijosHijos.iterator();

            while (i2.hasNext()) {
                Element hijo = (Element) i2.next();
                System.out.println("El nombre del elemento es: " + hijo.getName());
                System.out.println("El texto que contiene es: " + hijo.getText());
            }
        }
    }

    /**
     * Crea un fichero xml a partir de un documento y lo muestra por pantalla
     *
     * @param documento Documento con elementos agregados previamente
     * @param nombre Nombre del fichero que se creara
     * @throws IOException
     */
    public static void escribirFichero(Document documento, String nombre) throws IOException {
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
    public static void leerFichero(Document doc) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(doc, System.out);
    }
}
