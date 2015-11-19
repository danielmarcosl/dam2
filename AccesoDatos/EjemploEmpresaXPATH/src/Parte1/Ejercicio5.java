package Parte1;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\ejemploEmpresa.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Nombre de los empleados del departamento con codigo B02
        System.out.println("\nApartado 5\n");

        Herramientas.xpath(doc, "//departamento/codigo[.='B02']/../empleado/nombre");
    }
}
