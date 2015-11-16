package Ejercicio1;

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
public class Cine1 {

    public static void main(String args[]) {

        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\cine.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        XPathExpression<Element> xpath = XPathFactory.instance().compile("//pelicula[titulo='Asesinato en el Orient Express']/fecha", Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getName() + ": " + at.getText());
        }

        XPathExpression<Element> xpath2 = XPathFactory.instance().compile("//pelicula[fecha=//pelicula[titulo='Asesinato en el Orient Express']/fecha]/titulo", Filters.element());
        List<Element> elemento2 = xpath2.evaluate(doc);
        Iterator it2 = elemento2.iterator();

        while (it2.hasNext()) {
            Element at = (Element) it2.next();
            System.out.println(at.getName() + ": " + at.getText());
        }
    }
}
