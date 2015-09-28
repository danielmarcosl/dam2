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

        System.out.print("Elige una opción:\na) Listar fichero\nb) Cantidad de numeros de 1 cifra\nc) Cantidad de numeros de 2o más cifras\nd) La media de cada tipo\nTu opción: ");
        String opcion = teclado.readLine();

        herramientas.leerFichero(fl,nums);
        
        switch (opcion) {
            case "a":
                herramientas.listarFichero(nums);
                break;
            case "b":
                int cantidadUnaCifra = herramientas.contarUnaCifra(nums);
                System.out.println(cantidadUnaCifra);
                break;
            case "c":
                int cantidadDosCifras = herramientas.contarDosCifras(nums);
                System.out.println(cantidadDosCifras);
                break;
            case "d":
                double mediaUnaCifra = (double) herramientas.sumaUnaCifra(nums) / herramientas.contarUnaCifra(nums);
                double mediaDosCifras = (double) herramientas.sumaDosCifras(nums) / herramientas.contarDosCifras(nums);
                System.out.println("La media de los numeros de una cifra es " + (mediaUnaCifra));
                System.out.println("La media de los numeros de dos cifra es " + (mediaDosCifras));
                break;
            default:
                System.out.println("Error en la opcion");
                break;
        }
    }
}
