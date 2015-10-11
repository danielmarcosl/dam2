package processbuilder1;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class ProcessBuilder1 {

    /**
     * Include the name of an application in the arguments. The program will
     * create a child process with the program route content in the arguments.
     *
     * @param args
     */
    public static void main(String[] args) {

        if (args.length <= 0) {
            System.err.println("Se necesita un programa a ejecutar.");
            System.exit(-1);
        }

        ProcessBuilder pb = new ProcessBuilder(args);

        try {
            Process process = pb.start();
            int retorno = process.waitFor(); // The parent process will wait for the finish of the child process

            System.out.println("La ejecucion de " + Arrays.toString(args) + " devuelve " + retorno);
        } catch (IOException e) {
            System.err.println("Excepción de E/S " + e);
            System.exit(-1);
        } catch (InterruptedException ex) {
            System.err.println("El proceso hijo finalizo de forma incorrecta");
            System.exit(-1);
        }
    }
}
