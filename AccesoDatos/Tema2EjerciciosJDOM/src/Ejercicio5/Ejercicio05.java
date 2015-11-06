package Ejercicio5;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.Element;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio05 {

    public static void main(String args[]) {

        // Abrimos el documento
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\completo4.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            Herramientas.leerFichero(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Cogemos el elemento root
        Element root = doc.getRootElement();
        System.out.println(root.getName());

        // Cogemos el hijo de root
        Element profesores = root.getChild("PROFESORES");
        System.out.println(profesores.getName());

        // Cogemos los hijos del hijo de root
        Element nombre = profesores.getChild("NOMBRE");
        Element apellidos = profesores.getChild("APELLIDOS");
        Element edad = profesores.getChild("EDAD");
        System.out.println(nombre.getName() + ": " + nombre.getText());
        System.out.println(apellidos.getName() + ": " + apellidos.getText());
        System.out.println(edad.getName() + ": " + edad.getText());
    }
}
