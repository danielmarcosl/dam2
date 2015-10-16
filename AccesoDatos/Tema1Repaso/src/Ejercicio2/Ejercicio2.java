package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio2 {

    /**
     * Programa que lee de un fichero y lo imprime caracter a caracter
     *
     * @param args
     */
    public static void main(String args[]) {

        try {
            BufferedReader fichero = new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Documents\\porejemplo.txt"));
            char charac[] = new char[288];
            int count;

            while ((count = fichero.read(charac)) != -1) {
                for (int i = 0; i < count; i++) {
                    if (charac[i] != ' ') {
                        System.out.print(charac[i]);
                    }
                }
            }
        } catch (FileNotFoundException f) {
            System.out.println("Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
