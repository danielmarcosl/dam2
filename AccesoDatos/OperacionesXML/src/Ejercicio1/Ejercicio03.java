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
public class Ejercicio03 {

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

        // Modificamos en root el atributo ubicacion por localidad
        root.getAttribute("ubicacion").setName("localidad");

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
