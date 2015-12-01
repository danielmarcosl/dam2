package Ejercicio4;

import java.util.ArrayList;
import org.jdom2.Element;

import Herramientas.Herramientas;
import java.io.IOException;
import org.jdom2.Document;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio4 {

    public static void main(String args[]) {

        // Creamos un ArrayList para la direccion de la primera persona
        ArrayList<Element> persona1Direccion = new ArrayList<Element>();
        persona1Direccion.add(new Element("Calle").setText("Caoba, 1"));
        persona1Direccion.add(new Element("Poblacion").setText("Madrid"));
        persona1Direccion.add(new Element("Provincia").setText("Madrid"));
        persona1Direccion.add(new Element("Codigo_Postal").setText("28005"));

        //Creamos un ArrayList para la primera persona
        ArrayList<Element> persona1 = new ArrayList<Element>();
        persona1.add(new Element("Nombre").setText("Juan"));
        persona1.add(new Element("Apellidos").setText("Pardo"));
        persona1.add(new Element("Nacimiento").setAttribute("Dia", "10").setAttribute("Mes", "Abril").setAttribute("Ano", "1982"));
        persona1.add(new Element("Direccion").addContent(persona1Direccion));
        persona1.add(new Element("Varon"));

        // Creamos un ArrayList para la primera direccion de la segunda persona
        ArrayList<Element> persona2Direccion1 = new ArrayList<Element>();
        persona2Direccion1.add(new Element("Calle").setText("Roncito,1"));
        persona2Direccion1.add(new Element("Poblacion").setText("Ilesas"));
        persona2Direccion1.add(new Element("Provincia").setText("Toledo"));
        persona2Direccion1.add(new Element("CodigoPostal").setText("45200"));

        // Creamos un ArrayList para la segunda direccion de la segunda persona
        ArrayList<Element> persona2Direccion2 = new ArrayList<Element>();
        persona2Direccion2.add(new Element("Calle").setText("Paseo de la Esperanza,15-1ro"));
        persona2Direccion2.add(new Element("Poblacion").setText("Madrid"));
        persona2Direccion2.add(new Element("Provincia").setText("Madrid"));
        persona2Direccion2.add(new Element("CodigoPostal").setText("28005"));

        // Creamos un ArrayList para la segunda persona
        ArrayList<Element> persona2 = new ArrayList<Element>();
        persona2.add(new Element("Nombre").setText("Maria"));
        persona2.add(new Element("Apellidos").setText("Lopez"));
        persona2.add(new Element("Direccion").addContent(persona2Direccion1));
        persona2.add(new Element("Direccion").addContent(persona2Direccion2));
        persona2.add(new Element("Hembra"));

        // Creamos un ArrayList para los hijos de root
        ArrayList<Element> personas = new ArrayList<Element>();
        personas.add(new Element("Persona"));
        personas.add(new Element("Persona"));

        // Creamos al elemento root
        Element root = new Element("Personas");

        // Creamos un ArrayList que contendra los datos de todas las personas
        ArrayList<ArrayList<Element>> datos = new ArrayList<ArrayList<Element>>();
        datos.add(persona1);
        datos.add(persona2);

        // Creamos el arbol
        Herramientas.crearArbolNivel3(root, personas, datos);

        // Creamos el documento
        Document doc = new Document(root);

        // Creamos el fichero
        try {
            Herramientas.escribirFichero(doc, "personas");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
