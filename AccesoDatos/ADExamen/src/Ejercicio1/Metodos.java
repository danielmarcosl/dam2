package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Metodos {

    /**
     * Metodo para inicializar el fichero con datos prestablecidos
     *
     * @param ruta Ruta del fichero
     * @param map HashMap Que contendra los valores de los productos
     * @throws IOException Excepcion de teclado
     */
    public static void inicializarMap(HashMap<String, Integer> map) {
        // Metemos valores por defecto en el HashMap
        map.put("melon", 16);
        map.put("huevo", 4);
        map.put("monitor", 43);
    }

    public static void escribirFichero(String ruta, HashMap<String, Integer> map) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta));
        oos.writeObject(map);
        oos.close();
    }

    /**
     * Metodo para mostrar el menu
     */
    public static void mostrarMenu() {
        System.out.println("\nElige una de las siguientes opciones"
                + "\n1. Introduce un producto"
                + "\n2. Modifica precio"
                + "\n3. Mostrar el producto"
                + "\n4. Salir");
    }

    /**
     * Metodo para pedir al usuario una opcion
     *
     * @return Opcion introducida por teclado
     * @throws IOException Excepcion de teclado
     */
    public static String pedirOpcion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Tu opcion: ");
        return br.readLine();
    }

    /**
     * Metodo para tratar la opcion introducida por el usuario
     *
     * @param ruta Ruta del fichero
     * @param opcion Opcion introducida por el usuario
     * @throws IOException
     */
    public static void tratarOpciones(String ruta, String opcion, HashMap<String, Integer> map) throws IOException, FileNotFoundException, ClassNotFoundException {
        // Buffer para leer del teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Filtramos la opcion
        switch (opcion) {
            case "1":
                introducirProducto(ruta, map);
                break;
            case "2":
                // Pedimos al usuario que introduzca el nombre del producto
                System.out.print("Introduce el nombre del producto: ");
                String nombreProducto = br.readLine();
                modificarPrecio(ruta, nombreProducto, map);
                break;
            case "3":
                mostrarMasAlto(ruta, map);
                break;
            case "4":
                System.out.println("Gracias por su visita!");
                break;
            default:
                System.out.println("Opcion no valida, vuelve a intentarlo.");
                break;
        }
    }

    /**
     * Metodo para escribir en el fichero
     *
     * @param ruta Ruta donde esta el fichero
     * @throws IOException Excepcion de teclado
     */
    public static void introducirProducto(String ruta, HashMap<String, Integer> map) throws IOException {
        // Buffer para leer del teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Pedimos al usuario que introduzca los valores del producto nuevo
        System.out.print("Introduce el nombre del producto: ");
        String producto = br.readLine();
        System.out.print("Introduce el precio del producto: ");
        int precio = Integer.parseInt(br.readLine());

        map.put(producto, precio);

        // Escribimos el map en el fichero
        escribirFichero(ruta, map);
    }

    /**
     * Metodo para comprobar la existencia de un nombre en el fichero
     *
     * @param ruta Ruta del fichero
     * @param nombre Nombre del producto introducido por el usuario
     * @throws FileNotFoundException Excepcion de fichero
     */
    public static void modificarPrecio(String ruta, String nombre, HashMap<String, Integer> mapProducto) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
        HashMap<String, Integer> map = (HashMap) ois.readObject();
        // Boolean para saber si existe el nombre introducido por el usuario
        boolean existeProducto = false;

        Iterator it = map.keySet().iterator();
        // Lo recoremos y escribimos los datos introducidos en el fichero
        while (it.hasNext()) {
            String n = (String) it.next();
            int p = (Integer) map.get(n);

            if (n.equals(nombre)) {
                // Buffer para leer por teclado
                BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
                // Pedimos al usuario que introduzca el nuevo precio
                System.out.print("Introduce el nuevo precio: ");
                p = Integer.parseInt(teclado.readLine());
                map.replace(nombre, p);
                existeProducto = true;
            }
        }

        // Cerramos el fichero
        ois.close();

        // Si existe el producto, modificamos el fichero, sino mostramos mensaje de error
        if (existeProducto) {
            escribirFichero(ruta, map);
        } else {
            System.out.println("Nombre de producto no existe");
        }

        mapProducto = map;
    }

    /**
     * Metodo para comprobar el producto mas caro
     *
     * @param ruta Ruta del fichero
     * @throws FileNotFoundException Excepcion de fichero
     * @throws IOException Excepcion de teclado
     */
    public static void mostrarMasAlto(String ruta, HashMap<String, Integer> mapProducto) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
        HashMap<String, Integer> map = (HashMap) ois.readObject();
        boolean existeProducto = false;
        int precioMayor = 0;
        String productoMayor = "";

        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String n = (String) it.next();
            int p = (Integer) map.get(n);

            if (p > precioMayor) {
                precioMayor = p;
                productoMayor = n;
            }
        }

        // Mostramos el resultado
        System.out.println("El producto mas caro es " + productoMayor + ", con el precio " + precioMayor);

        // Cerramos el fichero
        ois.close();
    }
}
