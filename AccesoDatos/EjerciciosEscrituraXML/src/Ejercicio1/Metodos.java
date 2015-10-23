package Ejercicio1;

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
     * Anade los elementos jerarquicamente
     *
     * @param root Etiqueta root
     * @param childNivel1Etiqueta1 Primera etiqueta, hija de root
     * @param childNivel1Etiqueta2 Segunda etiqueta, hija de root
     * @param childNivel2Etiqueta1 Primera etiqueta, hija de la primera etiqueta
     * hija de root
     * @param childNivel2Etiqueta2 Segunda etiqueta, hija de la segunda etiqueta
     * hija de root
     */
    public static void escribirArbol(Element root,
            Element childNivel1Etiqueta1, Element childNivel1Etiqueta2,
            Element childNivel2Etiqueta1, Element childNivel2Etiqueta2) {

        // Anadimos las etiquetas de segundo nivel a las de primer nivel
        childNivel1Etiqueta1.addContent(childNivel2Etiqueta1);
        childNivel1Etiqueta2.addContent(childNivel2Etiqueta2);
        // Anadimos las etiquetas de primer nivel a la etiqueta root
        root.addContent(childNivel1Etiqueta1);
        root.addContent(childNivel1Etiqueta2);
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
        salida.output(documento, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\frutas.xml"));
    }
}
