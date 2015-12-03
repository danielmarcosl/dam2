package Herramientas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

import Ejercicio1.Alumno;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class HerramientasEjercicio1 {

    /**
     * Metodo para crear los usuarios, anadirlos al HashMap y al fichero
     *
     * @param teclado BufferedReader para pedir la introduccion de datos por
     * teclado
     * @param ruta Ruta donde se creara el fichero
     * @param mapAlumnos HashMap donde se introduciran los alumnos y su dni
     * @param nAlumnos Numero de alumnos que se crearan
     * @throws IOException Excepcion de teclado
     */
    public static void escribirMapYFichero(BufferedReader teclado, String ruta, HashMap<String, Alumno> mapAlumnos, int nAlumnos) throws IOException {
        // BufferedWriter para escribir en el fichero de la ruta introducida
        BufferedWriter escribir = new BufferedWriter(new FileWriter(ruta));

        // Inicializamos el HashMap
        mapAlumnos = new HashMap<String, Alumno>();

        // Variables para los valores que se pediran por teclado
        String dni;
        String nombre;
        String nota;
        double notaAux;

        // Boolean para saber cual es la primera linea del ficheros
        boolean primeraLinea = true;

        // Declaracion de alumno
        Alumno alumno = new Alumno("", 0);

        for (int i = 0; i < nAlumnos; i++) {
            // Pedimos los valores por teclado
            System.out.print("Introduce el DNI: ");
            dni = teclado.readLine();

            System.out.print("Introduce el nombre: ");
            nombre = teclado.readLine();

            System.out.print("Introduce la nota: ");
            nota = teclado.readLine();

            // Los escribimos en el documento
            if (primeraLinea) {
                escribir.write(dni + "@");
                escribir.write(nombre + "@");
                escribir.write(nota);
                primeraLinea = false;
            } else {
                escribir.newLine();
                escribir.write("@" + dni);
                escribir.write("@" + nombre);
                escribir.write("@" + nota);
            }

            // Anadimos al Map el alumno y el dni
            notaAux = Double.parseDouble(nota);
            alumno.setNombre(nombre);
            alumno.setNota(notaAux);
            mapAlumnos.put(dni, alumno);
        }
        // Cerramos el BufferedWriter del fichero
        escribir.close();
    }

    /**
     * Metodo para mostrar los datos del fichero
     *
     * @param ruta Ruta del fichero
     * @throws IOException Excepcion de teclado
     */
    public static void mostrarDatos(String ruta) throws IOException {
        // BufferedReader para leer el fichero de la ruta
        BufferedReader leer = new BufferedReader(new FileReader(ruta));

        // Variable para almacenar cada linea del fichero
        String linea = null;

        // Variables para almacenar los datos del fichero
        String dni;
        String nombre;
        String nota;

        // Recorremos el documento y almacenamos cada linea en la variable
        while ((linea = leer.readLine()) != null) {
            // Declaramos un StringTokenizer para la linea
            StringTokenizer st = new StringTokenizer(linea, "@");
            // Recorremos la linea buscando tokens
            while (st.hasMoreTokens()) {
                // Almacenamos cada string separado por tokens en su correspondiente variable
                dni = st.nextToken();
                nombre = st.nextToken();
                nota = st.nextToken();
                // Mostramos las variables
                System.out.println("Dni: " + dni + ", Nombre: " + nombre + ", Nota: " + nota);
            }
        }
        // Cerramo el BufferedReader del fichero
        leer.close();
    }

    public static double calcularMedia(String ruta) throws IOException {
        // BufferedReader para leer el fichero de la ruta
        BufferedReader leer = new BufferedReader(new FileReader(ruta));

        // Variable para almacenar cada linea del fichero
        String linea = null;

        // Variables para almacenar los datos del fichero
        String dni;
        String nombre;
        String nota;

        // Variables para realizar la media
        double media = 0;
        int contador = 0;

        // Recorremos el documento y almacenamos cada linea en la variable
        while ((linea = leer.readLine()) != null) {
            // Declaramos un StringTokenizer para la linea
            StringTokenizer st = new StringTokenizer(linea, "@");
            // Recorremos la linea buscando tokens
            while (st.hasMoreTokens()) {
                // Almacenamos cada string separado por tokens en su correspondiente variable
                dni = st.nextToken();
                nombre = st.nextToken();
                nota = st.nextToken();

                // Anadimos las notas a la media
                media += Double.parseDouble(nota);
                // Aumentamos el contador
                contador++;
            }
        }
        // Cerramo el BufferedReader del fichero
        leer.close();

        // Calculamos la media
        media /= contador;
        // Mostramos el resutlado
        System.out.println("La meida es: " + media);

        // Retornamos la media
        return media;
    }

    public static void mostrarAlumnosMedia(String ruta, double media) throws IOException {
        // BufferedReader para leer el fichero de la ruta
        BufferedReader leer = new BufferedReader(new FileReader(ruta));

        // Variable para almacenar cada linea del fichero
        String linea = null;

        // Variables para almacenar los datos del fichero
        String dni;
        String nombre;
        String nota;

        System.out.println("Alumnos que superan la nota media de la clase: ");

        // Recorremos el documento y almacenamos cada linea en la variable
        while ((linea = leer.readLine()) != null) {
            // Declaramos un StringTokenizer para la linea
            StringTokenizer st = new StringTokenizer(linea, "@");
            // Recorremos la linea buscando tokens
            while (st.hasMoreTokens()) {
                // Almacenamos cada string separado por tokens en su correspondiente variable
                dni = st.nextToken();
                nombre = st.nextToken();
                nota = st.nextToken();

                // Mostramos al usuario cuya nota supere la media
                if (media < Double.parseDouble(nota)) {
                    System.out.println("Dni: " + dni + ", Nombre: " + nombre + ", Nota: " + nota);
                }
            }
        }
        // Cerramo el BufferedReader del fichero
        leer.close();
    }

    /**
     * Metodo para mostrar el menu
     */
    public static void mostrarLista() {
        System.out.println("\nElige una opción:\n\t"
                + "A) Mostrar alumnos y sus notas\n\t"
                + "B) Mostrar media de clase\n\t"
                + "C) Mostrar alumnos con media superior a la clase\n\t"
                + "F) Salir");
    }

    /**
     * Metodo para pedir al usuario que escoja una opcion del menu
     *
     * @param teclado BufferedReader para pedir la introduccion de datos por
     * teclado
     * @return Lo introducido por el teclado
     * @throws IOException Excepcion de teclado
     */
    public static String pedirOpcion(BufferedReader teclado) throws IOException {
        System.out.print("Tu opcion: ");
        return teclado.readLine();
    }
}
