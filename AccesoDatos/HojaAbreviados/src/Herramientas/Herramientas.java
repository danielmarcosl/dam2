package Herramientas;

import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.filter.Filters;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Herramientas {

    public static void xpath(Document doc, String ruta) {

        XPathExpression<Element> xpath = XPathFactory.instance().compile(ruta, Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getName() + ": " + at.getText());
        }
    }

    public static void xpathAttVal(Document doc, String ruta, String val) {

        XPathExpression<Element> xpath = XPathFactory.instance().compile(ruta, Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getName() + ": " + at.getAttributeValue(val));
        }
    }

}
