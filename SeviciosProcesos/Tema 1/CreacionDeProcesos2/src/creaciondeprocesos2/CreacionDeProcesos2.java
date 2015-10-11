package creaciondeprocesos2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class CreacionDeProcesos2 {

    /**
     * This program will create a new child process, executing the contained in
     * the String Comando. The parent process will wait for the child process to
     * finish. If the child process finish well, return a 0, if exits an error,
     * return a -1
     *
     * @param args Not used
     */
    public static void main(String args[]) {
        Runtime r = Runtime.getRuntime();
        String Comando = "CMD /C DIR";
        Process p = null;

        try {
            p = r.exec(Comando);
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String linea;

            while ((linea = br.readLine()) != null) // lee una linea
            {
                System.out.println(linea);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Comprobando error -0 bien -1 mal
        int exitVal;

        try {
            exitVal = p.waitFor(); // Padre bloqueado esperando al hijo
            System.out.println("Valor de Salida: " + exitVal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
