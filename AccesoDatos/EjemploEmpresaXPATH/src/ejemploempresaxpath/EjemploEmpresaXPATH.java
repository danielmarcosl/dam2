package ejemploempresaxpath;

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
public class EjemploEmpresaXPATH {

    public static void main(String[] args) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\ejemploEmpresa.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Seleccionar todos los nombres de todos los empleados de la empresa
        System.out.println("Apartado 1\n");

        XPathExpression<Element> xpath = XPathFactory.instance().compile("/empresa/departamento/empleado/nombre", Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }

        // Mostrar el nombre de departamentos y empleados
        System.out.println("\nApartado 2\n");

        XPathExpression<Element> xpath2 = XPathFactory.instance().compile("//nombre", Filters.element());
        List<Element> elemento2 = xpath2.evaluate(doc);
        Iterator it2 = elemento2.iterator();

        while (it2.hasNext()) {
            Element at = (Element) it2.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }

        // Mostrar los telefonos de los departamentos
        System.out.println("\nApartado 3\n");

        XPathExpression<Element> xpath3 = XPathFactory.instance().compile("//departamento[@telefono]", Filters.element());
        List<Element> elemento3 = xpath3.evaluate(doc);
        Iterator it3 = elemento3.iterator();

        while (it3.hasNext()) {
            Element at = (Element) it3.next();
            System.out.println(at.getAttributeValue("telefono"));
        }

        // Empleados con salario mayor a 50000
        System.out.println("\nApartado 4\n");

        XPathExpression<Element> xpath4 = XPathFactory.instance().compile("//empleado[@salario>'5000']", Filters.element());
        List<Element> elemento4 = xpath4.evaluate(doc);
        Iterator it4 = elemento4.iterator();

        while (it4.hasNext()) {
            Element at = (Element) it4.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }

        // Nombre de los empleados del departamento con codigo B02
        System.out.println("\nApartado 5\n");

        XPathExpression<Element> xpath5 = XPathFactory.instance().compile("//departamento/codigo[.='B02']/../empleado/nombre", Filters.element());
        List<Element> elemento5 = xpath5.evaluate(doc);
        Iterator it5 = elemento5.iterator();

        while (it5.hasNext()) {
            Element at = (Element) it5.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }

        // rot de los empleados del primer departamento
        System.out.println("\nApartado 6\n");

        XPathExpression<Element> xpath6 = XPathFactory.instance().compile("/empresa/departamento[1]/empleado/rut", Filters.element());
        List<Element> elemento6 = xpath6.evaluate(doc);
        Iterator it6 = elemento6.iterator();

        while (it6.hasNext()) {
            Element at = (Element) it6.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }

        // rot del ultimo empleado
        System.out.println("\nApartado 7\n");

        XPathExpression<Element> xpath7 = XPathFactory.instance().compile("/empresa/departamento[last()]/empleado/rut", Filters.element());
        List<Element> elemento7 = xpath7.evaluate(doc);
        Iterator it7 = elemento7.iterator();

        while (it7.hasNext()) {
            Element at = (Element) it7.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }

        // rot del penultimo empleado
        System.out.println("\nApartado 8\n");

        XPathExpression<Element> xpath8 = XPathFactory.instance().compile("/empresa/departamento[last()-1]/empleado[last()]/rut", Filters.element());
        List<Element> elemento8 = xpath8.evaluate(doc);
        Iterator it8 = elemento8.iterator();

        while (it8.hasNext()) {
            Element at = (Element) it8.next();
            System.out.println(at.getName() + ", " + at.getValue());
        }
    }
}
