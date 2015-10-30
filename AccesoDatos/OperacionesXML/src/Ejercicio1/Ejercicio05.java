package Ejercicio1;

import Herramientas.Herramientas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio05 {

    public static void main(String args[]) {

        // Leemos el XML y lo metemos en un document
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\tienda.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Ejercicio01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio01.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Cogemos el element root
        Element root = doc.getRootElement();

        // Anadir nueva etiqueta empleado con atributo cargo, con valor responsable
        root.addContent(new Element("empleado").setAttribute("cargo","empleado"));

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
