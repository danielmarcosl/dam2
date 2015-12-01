package Herramientas;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Herramientas {

    /**
     * Crear arbol de dos niveles
     *
     * @param root Element root
     * @param hijo ArrayList<Element> hijos de root
     */
    public static void crearArbolNivel2(Element root, ArrayList<Element> hijo) {
        Element child;
        for (int i = 0; i < hijo.size(); i++) {
            child = hijo.get(i);
            root.addContent(child);
        }
    }

    /**
     * Crear arbol de tres niveles
     *
     * @param root Element root
     * @param hijo ArrayList<Element> hijos de root
     * @param hijoDeHijo ArrayList<ArrayList<Element>> hijos de hijos de root
     */
    public static void crearArbolNivel3(Element root,
            ArrayList<Element> hijo,
            ArrayList<ArrayList<Element>> hijoDeHijo) {

        Element child;
        Element childchild;

        for (int j = 0; j < hijo.size(); j++) {
            child = hijo.get(j);
            for (int i = 0; i < hijoDeHijo.get(j).size(); i++) {
                childchild = hijoDeHijo.get(j).get(i);
                child.addContent(childchild);
            }
            root.addContent(child);
        }
    }
    
    /**
     * Crear arbol de cuatro niveles
     * @param root Element Root
     * @param hijo ArrayList<Element> hijos de root
     * @param hijoDeHijo ArrayList<ArrayList<Element>> hijos de hijos de root
     * @param hijoDeHijoDeHijo ArrayList<ArrayList<ArrayList<Element>>> hijos de hijos de hijos de root
     */
        public static void crearArbolNivel4(Element root,
            ArrayList<Element> hijo,
            ArrayList<ArrayList<Element>> hijoDeHijo,
            ArrayList<ArrayList<ArrayList<Element>>> hijoDeHijoDeHijo) {

        Element child;
        Element childchild;
        Element childchildchild;

        for (int j = 0; j < hijo.size(); j++) {
            child = hijo.get(j);
            for (int i = 0; i < hijoDeHijo.get(j).size(); i++) {
                childchild = hijoDeHijo.get(j).get(i);
                for (int l = 0; l < hijoDeHijoDeHijo.get(l).size(); l++) {
                    childchildchild = hijoDeHijoDeHijo.get(j).get(i).get(l);
                    childchild.addContent(childchildchild);
                }
                child.addContent(childchild);
            }
            root.addContent(child);
        }
    }

    /**
     * Crea un fichero xml a partir de un documento
     *
     * @param documento Documento con elementos agregados previamente
     * @param nombre Nombre del fichero que se creara
     * @throws IOException
     */
    public static void escribirFichero(Document documento, String nombre) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(documento, System.out);
        salida.output(documento, new FileOutputStream("D:\\Libraries\\" + nombre + ".xml"));
    }
}
