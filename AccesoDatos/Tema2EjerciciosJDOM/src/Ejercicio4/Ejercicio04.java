package Ejercicio4;

import org.jdom2.Document;
import org.jdom2.Element;

import Herramientas.Herramientas;
import java.io.IOException;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio04 {

    public static void main(String args[]) {
        
        // Creamos Element hijo
        Element hijo = new Element("PROFESORES");
        // Creamos Elements hijos de hijo
        hijo.addContent(new Element("NOMBRE").setText("MARTA"));
        hijo.addContent(new Element("APELLIDOS").setText("RAMIREZ"));
        hijo.addContent(new Element("EDAD").setText("???"));
        // Creamos Element root
        Element root = new Element("CEPAL").addContent(hijo);
        
        // Escribimos fichero
        Document doc = new Document(root);
        
        try {
            Herramientas.escribirFichero(doc,"completo4");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
