package Ejercicio5;

import java.util.ArrayList;
import org.jdom2.Element;

import Herramientas.Herramientas;
import java.io.IOException;
import org.jdom2.Document;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio5 {

    public static void main(String args[]) {
        // Creamos un ArrayList para Destino
        ArrayList<Element> destino = new ArrayList<Element>();
        destino.add(new Element("Nombre").setText("Alicia Abad"));
        destino.add(new Element("Direccion").setText("Plaza de la Duquesa 12"));
        destino.add(new Element("Ciudad").setText("Albacete"));
        destino.add(new Element("CodigoPostal").setText("05020"));

        // Creamos un ArrayList para el Ordenante
        ArrayList<Element> ordenante = new ArrayList<Element>();
        ordenante.add(new Element("Nombre").setText("Roberto Movilla"));
        ordenante.add(new Element("Direccion").setText("General Ricardos 56"));
        ordenante.add(new Element("Ciudad").setText("Madrid"));
        ordenante.add(new Element("CodigoPostal").setText("28255"));

        // Creamos un ArrayList para el primer producto
        ArrayList<Element> producto1 = new ArrayList<Element>();
        producto1.add(new Element("Nombre").setText("Cortadora de cesped"));
        producto1.add(new Element("Cantidad").setText("1"));
        producto1.add(new Element("Precio").setText("148.95"));
        producto1.add(new Element("Observaciones").setText("Comprobar que es electrica"));

        // Creamos un ArrayList para el segundo producto
        ArrayList<Element> producto2 = new ArrayList<Element>();
        producto2.add(new Element("Nombre").setText("Podadora"));
        producto2.add(new Element("Cantidad").setText("3"));
        producto2.add(new Element("Precio").setText("7.98"));

        // Creamos un ArrayList para el contenido
        ArrayList<Element> contenido = new ArrayList<Element>();
        contenido.add(new Element("Producto").setAttribute("Codigo", "872-AA").addContent(producto1));
        contenido.add(new Element("Producto").setAttribute("Codigo", "926-FH").addContent(producto2));

        // Creamos un ArrayList que contendra los datos anteriores
        ArrayList<ArrayList<Element>> datos = new ArrayList<ArrayList<Element>>();
        datos.add(destino);
        datos.add(ordenante);
        datos.add(new ArrayList<Element>()); // ArrayList vacio
        datos.add(contenido);

        // Creamos un ArrayList para los hijos de root
        ArrayList<Element> pedido = new ArrayList<Element>();
        pedido.add(new Element("Destino"));
        pedido.add(new Element("Ordenante"));
        pedido.add(new Element("Observaciones").setText("Es urgente, el cesped esta muy alto"));
        pedido.add(new Element("Contenido"));

        // Creamos el elemento root
        Element root = new Element("Pedido").setAttribute("Fecha", "1999-10-20");

        // Creamos el arbol
        Herramientas.crearArbolNivel3(root, pedido, datos);

        // Creamos el documento
        Document doc = new Document(root);

        // Creamos el fichero
        try {
            Herramientas.escribirFichero(doc, "pedido");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
