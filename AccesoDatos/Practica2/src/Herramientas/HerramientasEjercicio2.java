package Herramientas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class HerramientasEjercicio2 {

    /**
     * Determinar el tamaño de una cadena dentro de un fichero aleatorio
     *
     * @param txt Cualquier string
     * @param largo Integer asociado al string
     * @return Cadena generada
     */
    public static String convertUTF(String txt, int largo) {
        // Si la longitud del String es mayor que el integer asociado
        // Devuelve un substring del String dado
        if (txt.length() > largo) {
            return txt.substring(0, largo);
        }
        // Si el String es menor, añadirle espacios en blanco
        for (int n = txt.length(); n < largo; n++) {
            txt = txt + " ";
        }
        return txt;
    }

    /**
     * Metodo para crear libros con los datos que introduce el usuario y
     * escribirlos en un fichero de acceso aleatorio
     *
     * @param teclado BufferedReader para pedir datos al usuario
     * @param ruta Ruta donde se creara el fichero
     * @param numeroLibros Numero de libros
     * @param maximo Numero para asignar el maximo de largo para convertir a UTF
     * @throws IOException Excepcion de teclado
     */
    public static void crearLibros(BufferedReader teclado, String ruta, int numeroLibros, int maximo) throws IOException {
        // Variable para escribir en el fichero
        RandomAccessFile raf = new RandomAccessFile(ruta, "rw");

        // Pedimos los datos y los escribimos en el fichero
        for (int i = 0; i < numeroLibros; i++) {
            System.out.println(i);
            System.out.print("Introduce el ISBN: ");
            raf.writeUTF(convertUTF(teclado.readLine(), maximo));
            System.out.print("Introduce el precio: ");
            raf.writeUTF(convertUTF(teclado.readLine(), maximo));
        }
        // Cerramos el fichero
        raf.close();
    }

    /**
     * Metodo para mostrar el ultimo libro
     *
     * @param ruta Ruta donde esta el fichero
     * @throws IOException Excepcion de entrada/salida
     */
    public static void mostrarUltimoLibro(String ruta) throws IOException {
        // Variable para leer el fichero
        RandomAccessFile raf = new RandomAccessFile(ruta, "rw");
        // Ponemos el puntero en la ultima posicion (4)
        raf.seek(22 * 4);
        // Mostramos los datos
        System.out.print("El ultimo libro introducido es:\n\tISBN: " + raf.readUTF() + "\n\tPrecio: " + raf.readDouble() + "\n");
        // Cerramos el fichero
        raf.close();
    }

    /**
     * Metodo para mostrar el menu
     */
    public static void mostrarLista() {
        System.out.println("\nElige una opción:\n\t"
                + "A) Mostrar ultimo libro introducido\n\t"
                + "B) Mostrar un libro en concreto\n\t"
                + "C) Mostrar todos los libros\n\t"
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
