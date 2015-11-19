package Parte2;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio1 {

    public static void main(String args[]) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\ejemploEmpresa.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Mostrar el rot del empleado Gonzalez
        System.out.println("Apartado 1\n");

        Herramientas.xpath(doc, "//child::empleado[child::nombre='Gonzalez']/descendant::*");
    }
}
