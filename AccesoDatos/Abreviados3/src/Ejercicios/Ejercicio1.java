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

        // Mostrar el nombre de la madre de las personas que sean más jovenes que la recepcionista
        System.out.println("\nApartado 2\n");
        Herramientas.xpath(doc, "//persona[nacimiento/@fecha!=//persona[@id=//puesto[@cargo='recepcionista']/@id]/nacimiento/@fecha]/madre");

        // Mostrar el identificador de las personas que no sean camareras y que su
        // lugar de nacimiento no coincida con el lugar de nacimiento del director
        System.out.println("\nApartado 3\n");
        Herramientas.xpathAttVal(doc, "//persona[@id=//puesto[@cargo!='camarera']/@id and nacimiento[@lugar!=//nacimiento[@lugar=//persona[@id=//puesto[@cargo='director']/@id]/nacimiento/@lugar]/@lugar]][@id]", "id");

        // Mostrar el cargo que ocupan las personas  que tienen más de 1 direccion
        // de contacto  y cuyo sueldo sea mayor al  que gana la recepcionista 
        System.out.println("\nApartado 4\n");
        Herramientas.xpathAttVal(doc, "//puesto[@id=//persona[count(direccion)>1 and @id=//persona[sueldo>=//persona[@id=//puesto[@cargo='recepcionista']/@id]/sueldo]/@id]/@id]", "cargo");

        // Muestra el nombre de todos las personas cuyo país de nacimiento sea distinto al de Jeanne Dupont
        System.out.println("\nApartado 5\n");
        Herramientas.xpath(doc, "//persona/nacimiento[@lugar!=//persona[nombre='Jeanne Dupont']/nacimiento/@lugar]/../nombre");
    }
}
