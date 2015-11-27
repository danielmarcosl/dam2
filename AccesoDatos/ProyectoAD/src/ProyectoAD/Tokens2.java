package ProyectoAD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Herramientas.herramientas;

public class Tokens2 {

    public static void main(String args[]) throws IOException {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\dam2\\AccesoDatos\\ProyectoAD\\src\\ProyectoAD\\numeros.txt"));

        System.out.print("Elige una opción:\na) Listar fichero\nb) Cantidad de numeros de 1 cifra\nc) Cantidad de numeros de 2 o más cifras\nd) La media de cada tipo\nTu opción: ");
        String opcion = teclado.readLine();

        herramientas.leerFichero(fl, nums);

        switch (opcion) {
            case "a":
                herramientas.listarFichero(nums);
                break;
            case "b":
                int cantidadUnaCifra = contarUnaCifra(nums);
                System.out.println(cantidadUnaCifra);
                break;
            case "c":
                int cantidadDosCifras = contarDosCifras(nums);
                System.out.println(cantidadDosCifras);
                break;
            case "d":
                double mediaUnaCifra = (double) sumaUnaCifra(nums) / contarUnaCifra(nums);
                double mediaDosCifras = (double) sumaDosCifras(nums) / contarDosCifras(nums);
                System.out.println("La media de los numeros de una cifra es " + (mediaUnaCifra));
                System.out.println("La media de los numeros de dos cifra es " + (mediaDosCifras));
                break;
            default:
                System.out.println("Error en la opcion");
                break;
        }
    }

    /**
     * Metodo para contar los Integers de un ArrayList menores de 10
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Cantidad de Integers menores de 10
     */
    public static int contarUnaCifra(ArrayList<Integer> ar) {
        // Declarar e inicializar contador
        int count = 0;

        // Recorrer el ArrayList<Integer>
        for (int i = 0; i < ar.size(); i++) {
            // Si un valor es menor de 10, aumentar el contador
            if (ar.get(i) < 10) {
                count++;
            }
        }
        // Devolver el valor del contador
        return count;
    }

    /**
     * Metodo para contar los Integers de un ArrayList mayores o igual a 10
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Cantidad de Integers mayores o igual a 10
     */
    public static int contarDosCifras(ArrayList<Integer> ar) {
        // Declarar e inicializar el contador
        int count = 0;

        // Recorrer el ArrayList<Integer>
        for (int i = 0; i < ar.size(); i++) {
            // Si un valor es igual o mayor a 10, aumentar el contador
            if (ar.get(i) >= 10) {
                count++;
            }
        }
        // Devolver el valor del contador
        return count;
    }

    /**
     * Metodo para sumar los Integers menores de 10 de un ArrayList
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Suma de los integers
     */
    public static int sumaUnaCifra(ArrayList<Integer> ar) {
        // Declarar e inicializar una variable para añadir numeros y sumarlos
        int suma = 0;

        // Recorremos el ArrayList<Integer>
        for (int i = 0; i < ar.size(); i++) {
            // Si un valor es menor a 10, sumarlo a la variable
            if (ar.get(i) < 10) {
                suma += ar.get(i);
            }
        }
        // Devolver el valor de la suma
        return suma;
    }

    /**
     * Metodo para sumar los Integers mayores o igual a 10 de un ArrayList
     *
     * @param ar ArrayList de Integers declarado previamente
     * @return Suma de los integers
     */
    public static int sumaDosCifras(ArrayList<Integer> ar) {
        // Declarar e inicializar una variable para añadir numeros y sumarlos
        int suma = 0;

        //Recorremos el ArrayList<Integer>
        for (int i = 0; i < ar.size(); i++) {
            // Si un valor es mayor o igual a 10, sumarlo a la variable
            if (ar.get(i) >= 10) {
                suma += ar.get(i);
            }
        }
        // Devolver el valor de la variable
        return suma;
    }

}
