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
public class Cine2 {

    public static void main(String args[]) {

        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\cine.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Mostramos la fecha de nacimiento
        XPathExpression<Element> xpath = XPathFactory.instance().compile("//persona[nombre='Janet Leigh']/fechas[@nacimiento]", Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println("Fecha nacimiento de Janet Leigh " + ": " + at.getAttributeValue("nacimiento"));
        }
        
        // Mostramos los anos anteriores al suyo
        XPathExpression<Element> xpath2 = XPathFactory.instance().compile("//persona/fechas[@nacimiento]", Filters.element());
        List<Element> elemento2 = xpath2.evaluate(doc);
        Iterator it2 = elemento2.iterator();

        while (it2.hasNext()) {
            Element at = (Element) it2.next();
            System.out.println(at.getName() + ": " + at.getAttributeValue("nacimiento"));
        }

        // Mostramos los que han nacido antes que Janet Leigh
        XPathExpression<Element> xpath3 = XPathFactory.instance().compile("//persona/fechas[@nacimiento<//persona[nombre='Janet Leigh']/fechas/@nacimiento]/../nombre", Filters.element());
        List<Element> elemento3 = xpath3.evaluate(doc);
        Iterator it3 = elemento3.iterator();

        while (it3.hasNext()) {
            Element at = (Element) it3.next();
            System.out.println(at.getName() + ": " + at.getText());
        }

    }
}
