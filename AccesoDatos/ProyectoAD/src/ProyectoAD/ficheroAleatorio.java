package ProyectoAD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

import Herramientas.herramientas;
import java.io.IOException;

public class ficheroAleatorio {

    public static void main(String args[]) {
        // Crear fichero aleatorio al que pasaremos nombres
        try {
            RandomAccessFile RAF = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\raf.txt", "rw");

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 2; i++) {
                System.out.println("Nombre");
                RAF.writeUTF(herramientas.convertUTF(teclado.readLine(), 20));
            }
            RAF.close();
        } catch (IOException ex) {
            System.out.println("hola");
        }

        // Leer
        try {
            RandomAccessFile x = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\raf.txt", "r");
            for (int i = 0; i < 2; i++) {
                x.seek(i * 22);
                String nombre = x.readUTF();
                System.out.println(nombre);
            }
            x.close();
        } catch (IOException ex) {
            System.out.println("que tal");
        }
    }
}
