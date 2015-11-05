package Ejercicio2;

import Herramientas.Herramientas;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio02 {

    public static void main(String args[]) {

        // Leemos el XML y lo metemos en un document
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\tienda2.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Cogemos el element root
        Element root = doc.getRootElement();

        // Cogemos los hijos tipo
        List<Element> elementos = root.getChildren("tipo");

        // Los iteramos
        Iterator it = elementos.iterator();

        // Anadimos a cada hijo tipo dos nuevos elementos
        while (it.hasNext()) {
            Element t = (Element) it.next();
            t.addContent(new Element("mueble").setText("muebles baratos"));
            t.addContent(new Element("persianas").setText("de colores"));
        }

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Modificamos el texto del hijo mueble del segundo tipo
        elementos.get(1).getChild("mueble").setText("muebles caros");

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Borrar la persiana del primer hijo tipo
        elementos.get(0).removeChild("persiana");

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Anadir un atributo al mueble que tiene el texto muebles caros
        // Iteramos los hijos tipo
        Iterator it2 = elementos.iterator();

        // Anadimos a cada hijo tipo dos nuevos elementos
        while (it2.hasNext()) {
            Element t = (Element) it.next();
            if (t.getText() == "muebles caros") {
                t.setAttribute("tamano", "extra");
            }
        }

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
