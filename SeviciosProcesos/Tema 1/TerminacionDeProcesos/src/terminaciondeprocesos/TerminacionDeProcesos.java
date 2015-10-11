package terminaciondeprocesos;

import java.io.IOException;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class TerminacionDeProcesos {

    /**
     * This program will create a new child process executing the contained in
     * the arguments. When the child process will be created, the parent will
     * destroy it. If there's nothing in the arguments, return an error.
     *
     * @param args
     */
    public static void main(String args[]) {

        if (args.length <= 0) {
            System.err.println("Se necesita un programa a ejecutar");
            System.exit(-1);
        }

        Runtime runtime = Runtime.getRuntime();

        try {
            Process process = runtime.exec(args);
            process.destroy();
        } catch (IOException ex) {

            System.err.println("Excepci�n de E/S!!");
            System.exit(-1);
        }
    }
}
