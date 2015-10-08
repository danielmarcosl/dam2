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
        contacto contacto1 = new contacto();
        contacto contacto2 = new contacto();
        contacto contacto3 = new contacto();

        // Asignamos nombre y telefono a los contactos
        contacto1.nuevoContacto("Pepa", 123456789);
        contacto2.nuevoContacto("Pepe", 987654321);
        contacto3.nuevoContacto("Pepo", 456321789);

        // Serializamos y deserializamos los objetos
        herramientas.serializarObject(contacto1, "C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
        herramientas.deserializarObject("C:\\Users\\AlumnoT\\Desktop\\fichero.obj");

        herramientas.serializarObject(contacto2, "C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
        herramientas.deserializarObject("C:\\Users\\AlumnoT\\Desktop\\fichero.obj");

        herramientas.serializarObject(contacto3, "C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
        herramientas.deserializarObject("C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
    }
}
