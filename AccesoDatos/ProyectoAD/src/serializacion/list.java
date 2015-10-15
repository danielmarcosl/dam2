package serializacion;

import Herramientas.herramientas;
import java.io.IOException;

/**
 * 
 * @author Alumnot
 */
public class list implements java.io.Serializable {

    /**
     * 
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Creamos tres contactos
        contacto contacto1 = new contacto("Pepa", 123456789);
        contacto contacto2 = new contacto("Pepe", 987654321);
        contacto contacto3 = new contacto("Pepo", 456321789);

        // Serializamos y deserializamos los objetos
        herramientas.serializarObject(contacto1, "C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
        herramientas.deserializarObject("C:\\Users\\AlumnoT\\Desktop\\fichero.obj");

        herramientas.serializarObject(contacto2, "C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
        herramientas.deserializarObject("C:\\Users\\AlumnoT\\Desktop\\fichero.obj");

        herramientas.serializarObject(contacto3, "C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
        herramientas.deserializarObject("C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
    }
}
