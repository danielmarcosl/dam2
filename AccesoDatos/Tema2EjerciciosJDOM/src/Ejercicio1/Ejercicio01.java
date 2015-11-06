package Ejercicio1;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio01 {

    public static void main(String args[]) {

        // Abrimos el documento
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\completo1.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Lo mostramos
        try {
            Herramientas.leerFichero(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
