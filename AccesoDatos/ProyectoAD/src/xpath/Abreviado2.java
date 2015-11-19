package xpath;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Abreviado2 {

    public static void main(String args[]) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\persona.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Imprimir los nombres
        System.out.println("Apartado 1\n");

        XPathExpression<Element> xpath = XPathFactory.instance().compile("/child::personas/descendant::nombre", Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }

        // Imprimir la primera persona
        System.out.println("\nApartado 2\n");

        XPathExpression<Element> xpath2 = XPathFactory.instance().compile("/child::personas/child::persona[1]/descendant::*", Filters.element());
        List<Element> elemento2 = xpath2.evaluate(doc);
        Iterator it2 = elemento2.iterator();

        while (it2.hasNext()) {
            Element at = (Element) it2.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }

        // Imprimir los siguientes a la primera persona
        System.out.println("\nApartado 3\n");

        XPathExpression<Element> xpath3 = XPathFactory.instance().compile("/child::personas/child::persona[1]/following-sibling::*", Filters.element());
        List<Element> elemento3 = xpath3.evaluate(doc);
        Iterator it3 = elemento3.iterator();

        while (it3.hasNext()) {
            Element at = (Element) it3.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }

        // Mostrar personas con nombre distinto a PePe
        System.out.println("\nApartado 4\n");

        XPathExpression<Element> xpath4 = XPathFactory.instance().compile("/child::personas/child::persona[child::nombre='PePe']/following-sibling::*", Filters.element());
        List<Element> elemento4 = xpath4.evaluate(doc);
        Iterator it4 = elemento4.iterator();

        while (it4.hasNext()) {
            Element at = (Element) it4.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }
        
        // Mostrar personas cuya edad sea < 35
        System.out.println("\nApartado 5\n");

        XPathExpression<Element> xpath5 = XPathFactory.instance().compile("/child::personas/child::persona[child::edad<'35']/descendant::*", Filters.element());
        List<Element> elemento5 = xpath5.evaluate(doc);
        Iterator it5 = elemento5.iterator();

        while (it5.hasNext()) {
            Element at = (Element) it5.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }
        
        // Mostrar ruta absoluta
        System.out.println("\nApartado 6\n");

        XPathExpression<Element> xpath6 = XPathFactory.instance().compile("/child::personas/child::persona/ancestor::*", Filters.element());
        List<Element> elemento6 = xpath6.evaluate(doc);
        Iterator it6 = elemento6.iterator();

        while (it6.hasNext()) {
            Element at = (Element) it6.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }
        
    }
}
