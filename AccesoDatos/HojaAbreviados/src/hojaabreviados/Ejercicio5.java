package hojaabreviados;

import Herramientas.Herramientas;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio5 {

    public static void main(String args[]) {

        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\biblioteca.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //Nombre de los módulos que se imparten en el Instituto
        System.out.println("\nApartado 1\n");
        Herramientas.xpathAttVal(doc, "/biblioteca/libro/autor[@fechaNacimiento='28/03/1936']", "fechaNacimiento");

        //Nombre de los módulos que se imparten en el Instituto
        System.out.println("\nApartado 2\n");
        Herramientas.xpath(doc, "/biblioteca/libro/@fechaNacimiento");

        //Nombre de los módulos que se imparten en el Instituto
        System.out.println("\nApartado 3\n");
        Herramientas.xpath(doc, "//autor");
    }
}
