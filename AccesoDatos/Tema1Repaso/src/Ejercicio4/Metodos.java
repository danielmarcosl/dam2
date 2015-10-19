package Ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Metodos {

    public static void escribirMenu() {
        System.out.print("1) Volcado de ArrayList\n2) Mostrar el numero de la posicion 3\n3) Salir\nTu opcion: ");
    }

    public static int preguntarOpcion() throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        int opcion = Integer.parseInt(teclado.readLine());

        return opcion;
    }

    public static ArrayList<String> arrayPar() {

        ArrayList<String> ar = new ArrayList<String>();
        int parActual = 1;
        String par;
        for (int i = 0; i < 100; i++) {
            while (!(parActual % 2 == 0)) {
                parActual++;
            }
            ar.add(Integer.toString(parActual));
            parActual++;
        }
        return ar;
    }

    public static String preguntarFichero() throws IOException {

        System.out.print("Elije el nombre del fichero: ");

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String fichero = teclado.readLine();

        return fichero;
    }

    public static void escribirArrayPares(ArrayList<String> ar, String fichero) throws IOException {
        Iterator it = ar.iterator();

        BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Documents\\" + fichero + ".txt"));

        // Recorremos la coleccion e imprimimos todos los valores
        while (it.hasNext()) {
            escribir.write((String) it.next());
            escribir.newLine();
        }
        escribir.close();
    }

    public static void mostrarTerceraPosicion(String fichero) throws IOException, FileNotFoundException {
        BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\" + fichero + ".txt"));
        String linea = null;
        int contador = 0;

        while ((linea = file.readLine()) != null) {
            if (contador == 3) {
                System.out.println("La tercera posicion es " + linea);
                break;
            } else {
                contador++;
            }
        }
    }
}
