package comunicaciondeprocesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * The program will create a child process with the program contained in the
 * arguments (CMD /C DIR) for example, and the parent process will get the
 * return all that the child process do
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class ComunicacionDeProcesos {

    public static void main(String args[]) {

        try {
            Process process = new ProcessBuilder(args).start();
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;

            System.out.println("Salida del proceso " + Arrays.toString(args) + ":");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error type IOException: " + e);
        }
    }
}
