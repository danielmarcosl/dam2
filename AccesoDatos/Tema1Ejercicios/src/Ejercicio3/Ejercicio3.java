package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

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
            RandomAccessFile fw = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\ej3.txt", "rw");
            //BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Documents\\ej3.txt"));

            for (int i = 0; i < 5; i++) {
                System.out.println("Escribe código, nombre y sueldo del empleado");
                fw.writeUTF(convertUTF(teclado.readLine(), 20/*teclado.readLine().length()*/));
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        try {
            //BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\ej3.txt"));
            RandomAccessFile fl = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\ej3.txt", "r");

            System.out.println("Selecciona una opcion\na. Mostrar todos los datos\nb.Mostrar el ultimo data\nc.Mostrar el primer y tercer dato");
            String opcion = teclado.readLine();

            switch (opcion) {
                case "a":
                    for (int i = 0; i < 5; i++) {
                        fl.seek(i * 20);
                        String datos = fl.readUTF();
                        System.out.println(datos);
                    }
                    break;
                case "b":
                    String str = null;
                    for (int i = 0; i < 5; i++) {
                        fl.seek(i * 20);
                        String datos = fl.readUTF();
                    }
                    System.out.println(str);
                    break;
                case "c":
                    int count = 0;
                    String st = null;
                    for (int i = 0; i < 5; i++) {
                        fl.seek(i * 20);
                        if (count == 0 || count == 2) {
                            st = fl.readUTF();
                            System.out.println(st);
                        }
                        count++;
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            fl.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
