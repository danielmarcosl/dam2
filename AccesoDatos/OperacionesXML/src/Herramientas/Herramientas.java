package Herramientas;

import Ejercicio1.Ejercicio01;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Herramientas {

    public static void escribirXML(Document doc) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(doc, System.out);
    }
}
