package procesosaleatorios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class ProcesosAleatorios {

    static int aleatorios = 6; // Number of child process that will be created

    /**
     * This program will created an specific number of child process, that will
     * run a program that generates a random number, and the parent process will
     * print those numbers.
     *
     * @param args
     */
    public static void main(String args[]) {

        Process[] p = new Process[aleatorios]; // Array de procesos
        InputStream is[] = new InputStream[aleatorios];
        InputStreamReader isr[] = new InputStreamReader[aleatorios];
        BufferedReader br[] = new BufferedReader[aleatorios];

        for (int i = 0; i < aleatorios; i++) {
            try {
                p[i] = new ProcessBuilder("C:\\Users\\Alumnot\\Desktop\\aleatorio.exe").start();
                is[i] = p[i].getInputStream();
                isr[i] = new InputStreamReader(is[i]);
                br[i] = new BufferedReader(isr[i]);
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }

        for (int i = 0; i < aleatorios; i++) {
            try {
                p[i].waitFor();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
        }

        String linea;

        for (int i = 0; i < aleatorios; i++) {
            System.out.println("Salida del proceso aleatorio" + i + " ");

            try {
                while ((linea = br[i].readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
