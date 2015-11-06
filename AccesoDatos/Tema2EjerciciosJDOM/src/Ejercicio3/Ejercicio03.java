package Ejercicio3;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio03 {

    @SuppressWarnings("empty-statement")
    public static void main(String args[]) {

        // Abrimos el documento
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\completo2.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Mostramos el contenido
        Herramientas.cogerHijos(doc, "ejemplo", "contenido");
    }
}
