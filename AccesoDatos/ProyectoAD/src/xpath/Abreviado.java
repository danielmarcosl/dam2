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
public class Abreviado {

    public static void main(String args[]) throws IOException {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\libro.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Mostrar el titulo
        System.out.print("Apartado 1)\n");

        XPathExpression<Element> xpath1 = XPathFactory.instance().compile("//child::titulo", Filters.element());
        List<Element> elemento1 = xpath1.evaluate(doc);
        Iterator it1 = elemento1.iterator();

        while (it1.hasNext()) {
            Element at = (Element) it1.next();
            System.out.println(at.getName() + ": " + at.getValue());
        }

        // Mostrar el titulo
        System.out.print("Apartado 2)\n");

        XPathExpression<Element> xpath2 = XPathFactory.instance().compile("/child::libro/child::precio[self::precio='3,5']/parent::libro/child::titulo", Filters.element());
        List<Element> elemento2 = xpath2.evaluate(doc);
        Iterator it2 = elemento2.iterator();

        while (it2.hasNext()) {
            Element at = (Element) it2.next();
            System.out.println(at.getName() + ": " + at.getValue());
        }

        // Mostrar el isbn del titulo Hurujuayo
        System.out.print("Apartado 3)\n");

        XPathExpression<Element> xpath3 = XPathFactory.instance().compile("/child::libro/child::titulo[self::titulo='Hurujuayo']/parent::libro[attribute::isbn]", Filters.element());
        List<Element> elemento3 = xpath3.evaluate(doc);
        Iterator it3 = elemento3.iterator();

        while (it3.hasNext()) {
            Element at = (Element) it3.next();
            System.out.println("ISBN " + at.getName() + ": " + at.getAttributeValue("isbn"));
        }
    }
}
