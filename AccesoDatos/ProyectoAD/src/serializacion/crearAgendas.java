package serializacion;

import Herramientas.herramientas;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alumnot
 */
public class crearAgendas {

    public static void main(String args[]) {
        agenda ag1 = new agenda(new contacto("Juan Carlitos", 918545461));
        agenda ag2 = new agenda(new contacto("String Tokenizer", 912346578));
        agenda ag3 = new agenda(new contacto("Patxi", 288288288));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Alumnot\\Documents\\agenda.obj"));

            herramientas.escribirObjetos(oos, ag1);
            herramientas.escribirObjetos(oos, ag2);
            herramientas.escribirObjetos(oos, ag3);

            oos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Alumnot\\Documents\\agenda.obj"));

            herramientas.leerObjetos(ois);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } catch (ClassNotFoundException c) {
            System.out.println("Error: " + c);
        }
    }
}
