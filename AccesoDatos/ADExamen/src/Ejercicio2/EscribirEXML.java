package Ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class EscribirEXML {

    public static void main(String args[]) {
        // Creamos el elemento root
        Element root = new Element("alumnos");

        // Creamos los hijos de root
        ArrayList<Element> hijosRoot = new ArrayList<Element>();
        hijosRoot.add(new Element("alumno").setAttribute("id", "e01"));
        hijosRoot.add(new Element("alumno").setAttribute("id", "e02"));
        hijosRoot.add(new Element("alumno").setAttribute("id", "e03").setAttribute("becado", "si"));

        // Hijo1
        // Creamos los hijos de modulo
        Element asignaturas1 = new Element("asignaturas");
        asignaturas1.addContent(new Element("asignatura").setAttribute("codigo", "a01").setText("Matematicas"));
        asignaturas1.addContent(new Element("asignatura").setAttribute("codigo", "a02").setText("Fisica"));
        asignaturas1.addContent(new Element("asignatura").setAttribute("codigo", "a03").setText("Lengua"));
        asignaturas1.addContent(new Element("inicio").setText("Marzo"));

        // Creamos los hijos del primer hijo de root
        ArrayList<Element> hijos1 = new ArrayList<Element>();
        hijos1.add(new Element("apellido1").setText("Sanchez"));
        hijos1.add(new Element("apellido2").setText("Cuarental"));
        hijos1.add(new Element("nombre").setText("Sonia"));
        hijos1.add(new Element("sexo").setText("Mujer"));
        hijos1.add(new Element("Modulos").addContent(asignaturas1));

        // Hijo2
        // Creamos los hijos de modulo
        Element asignaturas2 = new Element("asignaturas");
        asignaturas2.addContent(new Element("asignatura").setAttribute("codigo", "a05").setText("Lengua"));
        asignaturas2.addContent(new Element("asignatura").setAttribute("codigo", "a06").setText("Lengua Inglesa"));
        asignaturas2.addContent(new Element("inicio").setText("Septiembre"));

        // Creamos los hijos del primer hijo de root
        ArrayList<Element> hijos2 = new ArrayList<Element>();
        hijos2.add(new Element("apellido1").setText("Perez"));
        hijos2.add(new Element("apellido2").setText("Garcia"));
        hijos2.add(new Element("nombre").setText("Luis"));
        hijos2.add(new Element("sexo").setText("Hombre"));
        hijos2.add(new Element("Modulos").addContent(asignaturas2));

        // Hijo3
        // Creamos los hijos de modulo
        Element asignaturas3 = new Element("asignaturas");
        asignaturas3.addContent(new Element("asignatura").setAttribute("codigo", "a02").setText("Lengua Arabe"));
        asignaturas3.addContent(new Element("asignatura").setAttribute("codigo", "a01").setText("Matematicas"));
        asignaturas3.addContent(new Element("asignatura").setAttribute("codigo", "a03").setText("Fisica"));
        asignaturas3.addContent(new Element("asignatura").setAttribute("codigo", "a05").setText("Lengua"));
        asignaturas3.addContent(new Element("inicio").setText("febrero"));

        // Creamos los hijos del primer hijo de root
        ArrayList<Element> hijos3 = new ArrayList<Element>();
        hijos3.add(new Element("apellido1").setText("Perez"));
        hijos3.add(new Element("apellido2").setText("Perez"));
        hijos3.add(new Element("nombre").setText("Sofia"));
        hijos3.add(new Element("sexo").setText("Mujer"));
        hijos3.add(new Element("Modulos").addContent(asignaturas3));

        // Anadimos los hijos de los hijos de root a un ArrayList
        ArrayList<ArrayList<Element>> hijosHijos = new ArrayList<ArrayList<Element>>();
        hijosHijos.add(hijos1);
        hijosHijos.add(hijos2);
        hijosHijos.add(hijos3);

        Metodos.crearArbol(root, hijosRoot, hijosHijos);

        // Creamos el documento
        Document doc = new Document(root);

        try {
            // Lo escribimos en el fichero
            Metodos.escribirFicheroXML(doc, null, ".\\src\\Ejercicio2\\ficheroEXML.xml");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
