package Ejercicios;

import java.io.IOException;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.Document;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\personas.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // Mostrar el nombre de la persona con misma fecha de nacimiento que el director
        System.out.println("\nApartado 1\n");
        Herramientas.xpath(doc, "//persona[nacimiento/@fecha=//persona[@id=//puesto[@cargo='director']/@id]/nacimiento/@fecha]/nombre");
        
        // Mostrar el nombre de la madre de las personas que sean más jóvenes que la recepcionista
        System.out.println("\nApartado 2\n");
        Herramientas.xpath(doc, "//persona[nacimiento/@fecha!=//persona[@id=//puesto[@cargo='recepcionista']/id]/nacimiento/@fecha]/madre");
        
        
    }
}
