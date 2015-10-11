package processbuilderfichero2;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class ProcessBuilderFichero2 {

    /**
     * This program will create a child process. If the process is well done and
     * finished, return the finish information to salida.txt, if it has an
     * error, return the error to error.txt
     *
     * @param args
     */
    public static void main(String args[]) {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "dir");

        try {
//		File fOut = new File("C\\Users\\Alumnot\\salida.txt");
//		File fErr = new File("C\\Users\\Alumnot\\error.txt");
//		File fBat = new File("C\\Users\\Alumnot\\fichero.bat");
            File fOut = new File("D:\\Libraries\\Documents\\salida.txt");
            File fErr = new File("D:\\Libraries\\Documents\\error.txt");
            File fBat = new File("D:\\Libraries\\Documents\\fichero.bat");

            pb.redirectInput(fBat);
            pb.redirectOutput(fOut);
            pb.redirectError(fErr);
            pb.start();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
