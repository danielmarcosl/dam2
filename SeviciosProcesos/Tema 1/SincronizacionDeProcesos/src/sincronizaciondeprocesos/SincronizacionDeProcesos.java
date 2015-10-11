package sincronizaciondeprocesos;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2016
 */
public class SincronizacionDeProcesos {

    /**
     * This program will create a child process that execute the content in the
     * arguments. The parent process will print the information of finish of the
     * child process
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            Process process = new ProcessBuilder(args).start();
            int retorno = process.waitFor();

            System.out.println("Comando " + Arrays.toString(args) + " devolvio: " + retorno);
        } catch (IOException e) {
            System.out.println("Error ocurrido ejecutando el comando:" + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("El comando fue interrumpido. Descripcion del error: " + e.getMessage());
        }
    }
}
