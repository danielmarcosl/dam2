package xpath;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Cine3 {

    public static void main(String args[]) {

        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\Petra\\cine.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // A = //pelicula[count(actor) >= 2]
        // B = //pelicula[actor='Anthony Perkins']
        // Mostrar peliculas con 2 o mas actores y con 2 o mas actores
        XPathExpression<Element> xpath = XPathFactory.instance().compile("//pelicula[actor='Anthony Perkins' and count(actor) >= 2]", Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element n = (Element) it.next();
            Element titulo = n.getChild("titulo");
            System.out.println(n.getName() + ": " + titulo.getText());
        }
    }
}
