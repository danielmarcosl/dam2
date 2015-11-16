package xpath;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio5 {

    public static void main(String args[]) {
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\cole.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        herramientas.xpath(doc, "/cole/asignatura[cred < '6']/nombre");
    }
}
