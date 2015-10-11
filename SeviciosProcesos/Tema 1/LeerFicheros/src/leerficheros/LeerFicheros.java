package leerficheros;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class LeerFicheros {

    /**
     * This method will read the text file passed by parameter and printed it.
     *
     * @param f
     */
    public static void leer(File f) {

        try {
            BufferedReader linea = new BufferedReader(new FileReader(f));
            String cadena = linea.readLine();

            try {
                while (cadena != null) {
                    System.out.println(cadena);
                    cadena = linea.readLine();
                }

            } catch (EOFException e) {
                linea.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
