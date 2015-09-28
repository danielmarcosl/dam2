package Ejercicio3;

import java.io.*;
import java.util.*;

public class Ejercicio3 {

    public static String convertUTF(String txt, int largo) {

        if (txt.length() > largo) {
            return txt.substring(0, largo);
        }
        for (int n = txt.length(); n < largo; n++) {
            txt = txt + " ";
        }
        return txt;
    }

    public static void main(String args[]) {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        try {
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\ej3.txt", "rw");

            System.out.println("Selecciona una opcion\na. Mostrar todos los datos\nb.Mostrar el ultimo data\nc.Mostrar el primer y tercer dato");
            String opcion = teclado.readLine();

            switch (opcion) {
                case "a":
                    // Leer todo el fichero
                    for (int i = 0; i < 5; i++) {
                        raf.seek(i * 34);

                        int codigo = raf.readInt();
                        String nombre = raf.readUTF();
                        double sueldo = raf.readDouble();

                        System.out.println(codigo + " " + nombre + " " + sueldo);
                    }
                    break;
                case "b":
                    // Leer el ultimo registro introducido
                    raf.seek(4 * 34);
                    int codigo = raf.readInt();
                    String nombre = raf.readUTF();
                    double sueldo = raf.readDouble();

                    System.out.println(codigo + " " + nombre + " " + sueldo);
                    break;
                case "c":
                    // Leer el primer y tercer registro
                    raf.seek(0 * 34);
                    codigo = raf.readInt();
                    nombre = raf.readUTF();
                    sueldo = raf.readDouble();

                    System.out.println(codigo + " " + nombre + " " + sueldo);

                    raf.seek(0 * 34);
                    codigo = raf.readInt();
                    nombre = raf.readUTF();
                    sueldo = raf.readDouble();

                    System.out.println(codigo + " " + nombre + " " + sueldo);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            raf.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
