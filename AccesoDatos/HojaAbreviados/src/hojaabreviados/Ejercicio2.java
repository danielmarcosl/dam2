package hojaabreviados;

import java.io.IOException;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.Document;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\ciclos2.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //1. Página web del Instituto
        System.out.println("\nApartado 1\n");
        Herramientas.xpath(doc, "//web");

        //2. Nombre de los Ciclos Formativos
        System.out.println("\nApartado 2\n");
        Herramientas.xpath(doc, "//ciclo/nombre");

        //3. Siglas por las que se conocen los Ciclos Formativos
        System.out.println("\nApartado 3\n");
        Herramientas.xpathAttVal(doc, "//ciclo", "id");

        //4. Años en los que se publicaron los decretos de título de los Ciclos Formativos
        System.out.println("\nApartado 4\n");
        Herramientas.xpathAttVal(doc, "//decretoTitulo", "ano");

        //5. Ciclos Formativos de Grado Medio
        System.out.println("\nApartado 5\n");
        Herramientas.xpath(doc, "//ciclo[grado='Medio']/nombre");

        //6. Nombre de los Ciclos Formativos de Grado Superior
        System.out.println("\nApartado 6\n");
        Herramientas.xpath(doc, "//ciclo[grado='Superior']/nombre");

        //7. Nombre de los Ciclos Formativos anteriores a 2010
        System.out.println("\nApartado 7\n");
        Herramientas.xpath(doc, "//decretoTitulo[@ano<2010]/../nombre");

        //8. Nombre de los Ciclos Formativos de 2008 o 2010
        System.out.println("\nApartado 8\n");
        Herramientas.xpath(doc, "//decretoTitulo[@ano=2008 or @ano=2010]/../nombre");
    }
}
