package processbuilderfichero;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class ProcessBuilderFichero {

    /**
     * This program will create a child process. If the process is well done and
     * finished, return the finish information to salida.txt, if it has an
     * error, return the error to error.txt
     *
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "dir");

        File fOut = new File("C\\Users\\Alumnot\\salida.txt");
        File fErr = new File("C\\Users\\Alumnot\\error.txt");

        pb.redirectOutput(fOut);
        pb.redirectError(fErr);
        pb.start();
    }
}
