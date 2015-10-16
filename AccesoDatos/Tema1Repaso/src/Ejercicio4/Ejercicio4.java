package Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio4 {

    public static void main(String args[]) {

        System.out.print("1) Volcado de ArrayList\n2) Mostrar el numero de la posicion 3\n3) Salir\nTu opcion: ");

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        int opcion = 0;
        
        try {
            opcion = Integer.parseInt(teclado.readLine());
        } catch (IOException e) {
            System.out.println("Error; " + e);
        }

        switch (opcion) {
            case 1:
                //TODO
                break;
            case 2:
                break;
        }
    }
}
