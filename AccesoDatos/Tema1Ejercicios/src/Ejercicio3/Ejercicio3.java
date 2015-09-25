package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

    public static void main(String args[]) {

        try {
            BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Documents\\ej3.txt"));
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 5; i++) {
                System.out.println("Escribe código, nombre y sueldo del empleado");
                fw.write(teclado.readLine());
                fw.newLine();
            }
            fw.close();
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\ej3.txt"));

            System.out.println("Selecciona una opcion\na. Mostrar todos los datos\nb.Mostrar el ultimo data\nc.Mostrar el primer y tercer dato");
            String opcion = teclado.readLine();

            switch (opcion) {
                case "a":
                    while (fl.ready()) {
                        System.out.println(fl.readLine());
                    }
                    break;
                case "b":
                    String str = null;
                    while (fl.ready()) {
                        str = fl.readLine();
                    }
                    System.out.println(str);
                    break;
                case "c":
                    int count = 0;
                    String st = null;
                    while (fl.ready()) {
                        if (count == 0 || count == 2) {
                            st = fl.readLine();
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
