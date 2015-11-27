package practica2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumnoT
 */
public class Practica2 {

    /**
     * Metodo para crear un alumno pidiendo datos por teclado
     *
     * @param ob Array de objetos
     * @param num Numero del objeto
     * @param te BufferedReader para leer por teclado
     * @throws IOException
     */
    public static void crearAlumno(Object ob[], int num, BufferedReader te) throws IOException {

        System.out.print("Creando alumno " + (num + 1) + "\nIntroduce nombre: ");
        String nombre = te.readLine();
        System.out.print("\nIntroduce nota: ");
        int nota = Integer.parseInt(te.readLine());

        ob[num] = new Alumno(nombre, nota);
    }

    /**
     * Metodo para pedir dni por teclado ya nadir objeto y dni al HashMap
     *
     * @param ob Array de objetos
     * @param num Numero del objeto
     * @param te BufferedReader para leer por teclado
     * @param map HashMap donde anadiremos los objetos
     * @throws IOException
     */
    public static void anadirHashMap(BufferedReader te, HashMap map) throws IOException {

        System.out.print("Introduce nombre: ");
        String nombre = te.readLine();

        System.out.print("Introduce nota: ");
        int nota = Integer.parseInt(te.readLine());

        System.out.print("Introduce el dni: ");
        String dni = te.readLine();

        Alumno a = new Alumno(nombre, nota);

        map.put(dni, a);
    }

    /**
     * Metodo para crear un fichero con el HashMap serializado
     *
     * @param map HashMap
     * @param ruta Ruta del archivo
     * @throws IOException
     */
    public static void serializarMap(HashMap map, String ruta) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta));
        oos.writeObject(map);
        oos.close();
    }

    /**
     * Metodo para mostrar el menu
     */
    public static void mostrarLista() {
        System.out.println("Elige una opción:\n\t"
                + "A) Mostrar alumnos y sus notas\n\t"
                + "B) Mostrar media de clase\n\t"
                + "C) Mostrar alumnos con media superior a la clase\n\t"
                + "F) Salir");
    }

    public static void main(String[] args) {

        // Numero de alumnos
        int numeroAlumnos = 1;
        // Metodo para leer por teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        // Map de alumnos con su dni
        HashMap<String, Alumno> mapAlumno = new HashMap<String, Alumno>();

        // Creamos los alumnos pidiendo sus datos y los anadimos al hashmap
        for (int i = 0; i < numeroAlumnos; i++) {
            try {
                anadirHashMap(teclado, mapAlumno);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\petra\\alumno.obj");
            ObjectOutputStream objStream = new ObjectOutputStream(fileOut);
            objStream.writeObject(mapAlumno);
            objStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Practica2.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Creamos el fichero del map
//        try {
//            serializarMap(mapAlumno, "C:\\petra\\alumnos.obj");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        // Mostramos la lista
        mostrarLista();

        // Variable donde se almacenará la letra del menu introducida por el usuario
        String letra = null;
        try {
            letra = teclado.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Switch para filtrar el resultado
        while (!letra.equals("F")) {
            switch (letra) {
                case "A":

                    break;
                case "B":
                    break;
                case "C":
                    break;
            }
        }
    }
}
