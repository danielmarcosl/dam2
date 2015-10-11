package multiprocesos;

import java.io.IOException;
import java.util.Arrays;

/**
 * This program will create two child process at the same time.
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class MultiProcesos {

    public static void main(String args[]) {

        ProcessBuilder pb1 = new ProcessBuilder("NOTEPAD");
        ProcessBuilder pb2 = new ProcessBuilder("EXPLORER");

        try {
            Process process = pb1.start();

            System.out.println("Ejecucion de Notepad");
        } catch (IOException e) {
            System.err.println("Excepcion de E/S");
            System.exit(-1);
        }

        try {
            final Process process = pb2.start();

            System.out.println("Ejecucion de Explorer");
        } catch (IOException e) {
            System.err.println("Excepcion de E/S");
            System.exit(-1);
        }
    }
}
