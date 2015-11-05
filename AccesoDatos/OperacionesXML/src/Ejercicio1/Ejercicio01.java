package Ejercicio1;

import Herramientas.Herramientas;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio01 {

    public static void main(String args[]) {

        // Leemos el XML y lo metemos en un document
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\tienda.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Cogemos el element root
        Element root = doc.getRootElement();

        // Modificamos el atributo precio del hijo nivel
        root.getChild("nivel").setAttribute("precio", "2300");

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Eliminamos el atributo precio del hijo historieta
        root.getChild("historieta").removeAttribute("precio");

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Modificamos en root el atributo ubicacion por localidad
        root.getAttribute("ubicacion").setName("localidad");

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Modificamos el precio de computadora a 2300
        root.getChild("computadora").setAttribute("precio", "2300");

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Anadir nueva etiqueta empleado con atributo cargo, con valor responsable
        root.addContent(new Element("empleado").setAttribute("cargo", "empleado"));

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Eliminar la etiqueta libro
        root.removeChild("libro");

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
