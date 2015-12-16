package Ejercicio2;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class OperacionesXML {

    public static void main(String args[]) {
        // Declaramos el elemento
        Document doc = null;
        try {
            doc = new SAXBuilder().build(".\\src\\Ejercicio2\\ficheroEXML.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Cogemos el element root
        Element root = doc.getRootElement();
        // Cogemos los hijos de root
        List<Element> alumno = root.getChildren("alumno");

        // Los iteramos
        Iterator ialumno = alumno.iterator();
        // Recorremos la lista de alumnos
        while (ialumno.hasNext()) {
            // Cogemos el element
            Element a = (Element) ialumno.next();
            // Cogemos sus hijos
            Element apellido1 = a.getChild("apellido1");
            Element apellido2 = a.getChild("apellido2");
            Element nombre = a.getChild("nombre");
            Element sexo = a.getChild("sexo");
            Element modulos = a.getChild("Modulos");

            // Cogemos el hijo de modulos
            Element asignaturas = modulos.getChild("asignaturas");
            Element inicio = asignaturas.getChild("inicio");
            // Cogemos los hijos de asignaturas
            List<Element> listAsignaturas = asignaturas.getChildren("asignatura");

            // Las iteramos
            Iterator ilistasignaturas = listAsignaturas.iterator();
            // Recorremos la lista
            while (ilistasignaturas.hasNext()) {
                // Cogemos el primer hijo
                Element asig = (Element) ilistasignaturas.next();
                
                // OPERACION 2
                if (asig.getText().equals("Matematicas")) {
                    a.setAttribute("repetidor", "no");
                }
                // OPERACION 3
                if (a.getAttributeValue("becado") != null && asig.getAttributeValue("codigo").equals("a05")) {
                     asignaturas.removeContent(asig);
                     break;
                }
            }

            // OPERACION 1
            if (inicio.getText().equals("febrero") && sexo.getText().equals("Mujer")) {
                a.setAttribute("id", "E0555");
            }
        }

        try {
            Metodos.escribirFicheroXML(doc, null, ".\\src\\Ejercicio2\\ficheroEXML.xml");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
