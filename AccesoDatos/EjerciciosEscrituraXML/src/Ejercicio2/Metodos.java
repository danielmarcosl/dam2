package Ejercicio2;

import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Metodos {

    /**
     * Anade a root los elementos que descienden de el
     *
     * @param root Elemento root
     * @param child1 Elemento descendiente de root
     * @param child2 Elemento descendiente de root
     */
    public static void anadirRoot(Element root, Element child1, Element child2) {
        root.addContent(child1);
        root.addContent(child2);
    }

    /**
     * Anade a un elemento los elementos que descienden de el
     *
     * @param rootchild Elemento descendiente de root
     * @param child1 Elemento descendiente de un descendiente de root
     * @param child2 Elemento descendiente de un descendiente de root
     * @param child3 Elemento descendiente de un descendiente de root
     * @param child4 Elemento descendiente de un descendiente de root
     */
    public static void anadirRootChild(Element rootchild,
            Element child1, Element child2,
            Element child3, Element child4) {
        rootchild.addContent(child1);
        rootchild.addContent(child2);
        rootchild.addContent(child3);
        rootchild.addContent(child4);
    }

    /**
     * Crea un fichero xml a partir de un documento
     *
     * @param documento Documento con elementos agregados previamente
     * @throws IOException
     */
    public static void escribirFichero(Document documento) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(documento, System.out);
        salida.output(documento, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\menu.xml"));
    }
}
