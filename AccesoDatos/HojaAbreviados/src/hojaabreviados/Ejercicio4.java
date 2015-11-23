package hojaabreviados;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio4 {

    public static void main(String args[]) {

        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\ej4.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //Nombre de los módulos que se imparten en el Instituto
        System.out.println("\nApartado 1\n");
        Herramientas.xpath(doc, "//child::modulo[/child::ciclo=//child::ciclo[/child::grado='Superior']/Attribute::id]/child::nombre");

        //Nombre de los módulos que se imparten en el Instituto
        System.out.println("\nApartado 2\n");
        //Herramientas.xpath(doc, "//child::modulo/child::nombre");

        //Nombre de los módulos que se imparten en el Instituto
        System.out.println("\nApartado 3\n");
        //Herramientas.xpath(doc, "//child::modulo/child::nombre");

        //Nombre de los módulos que se imparten en el Instituto
        System.out.println("\nApartado 4\n");
        //Herramientas.xpath(doc, "//child::modulo/child::nombre");
    }
}
