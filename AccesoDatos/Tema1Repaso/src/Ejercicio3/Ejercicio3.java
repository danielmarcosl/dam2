package Ejercicio3;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

import herramientas.herramientas;
import java.io.IOException;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio3 {

    public static void main(String args[]) {

        // Escribimos el fichero
        try {
            RandomAccessFile escribir = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\rand.txt", "rw");

            escribir.writeInt(1);
            escribir.writeInt(5);
            escribir.writeDouble(900.2);

            escribir.writeInt(2);
            escribir.writeInt(23);
            escribir.writeDouble(1100.4);

            escribir.writeInt(3);
            escribir.writeInt(2);
            escribir.writeDouble(2000.5);

            escribir.writeInt(4);
            escribir.writeInt(49);
            escribir.writeDouble(1529.8);

            escribir.close();
        } catch (FileNotFoundException f) {
            System.out.println("Fichero no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // Leemos el fichero
        try {
            RandomAccessFile leer = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\rand.txt", "rw");

            for (int i = 0; i < 4; i++) {
                leer.seek(i * 16);
                int int1 = leer.readInt();
                int int2 = leer.readInt();
                double double1 = leer.readDouble();
                System.out.println(int1 + " " + int2 + " " + double1);
            }

            leer.close();
        } catch (FileNotFoundException f) {
            System.out.println("Fichero no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
