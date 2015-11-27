package practica2;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumnoT
 */
public class Practica2 {

    public static void main(String[] args) {

        // Numero de alumnos
        int numeroAlumnos = 1;
        // Metodo para leer por teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        // Map de alumnos con su dni
        HashMap<String, Object> mapAlumno = new HashMap();

        // Creamos los alumnos pidiendo sus datos y los anadimos al hashmap
        for (int i = 0; i < numeroAlumnos; i++) {
            try {
                anadirHashMap(teclado, mapAlumno);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        //Creamos el fichero del map
        try {
            serializarMap(mapAlumno, "C:\\petra\\alumnos.obj");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //Mostramos la lista
        mostrarLista();

        // Variable donde se almacenará la letra del menu introducida por el usuario
        String letra = null;
        try {
            System.out.print("Tu opcion: ");
            letra = teclado.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Switch para filtrar el resultado
        while (!letra.equals("F")) {
            switch (letra) {
                case "A": {
                    try {
                        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\petra\\alumnos.obj"));
                        leerMap(ois);
                        ois.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Practica2.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Practica2.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Practica2.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //Mostramos la lista
                    mostrarLista();

                    // Variable donde se almacenará la letra del menu introducida por el usuario
                    letra = null;
                    try {
                        System.out.print("Tu opcion: ");
                        letra = teclado.readLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                break;
                case "B":

                    //Mostramos la lista
                    mostrarLista();

                    // Variable donde se almacenará la letra del menu introducida por el usuario
                    letra = null;
                    try {
                        System.out.print("Tu opcion: ");
                        letra = teclado.readLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case "C":

                    //Mostramos la lista
                    mostrarLista();

                    // Variable donde se almacenará la letra del menu introducida por el usuario
                    letra = null;
                    try {
                        System.out.print("Tu opcion: ");
                        letra = teclado.readLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    break;
            }
        }
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

        Alumno a = new Alumno();

        a.nuevoAlumno(nombre, nota);

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
     * Metodo para leer un map dentro de un fichero
     *
     * @param ob ObjectInputStream con la ruta del fichero
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void leerMap(ObjectInputStream ob) throws IOException, ClassNotFoundException {
        HashMap<String, Alumno> m = null;
        try {
            while (true) {
                m = (HashMap) ob.readObject();
            }
        } catch (EOFException e) {
            System.out.println("Final del fichero");

            Iterator it = m.keySet().iterator();
            while (it.hasNext()) {
                String clave = (String) it.next();
                Object valor = (Object) m.get(clave);
                System.out.println(m.toString());
            }
        } finally {
            if (ob != null) {
                ob.close();
            }
        }
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
}
