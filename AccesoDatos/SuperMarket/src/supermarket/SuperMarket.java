package supermarket;

import java.util.Random;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class SuperMarket {

    // Numero de cajas
    public static int cajas = 5;
    // Numero de clientes
    public static int clientes = 0;
    // Indicador de si hay una caja libre
    public static boolean cajaLibre = true;

    // Boolean para controlar las cajas
    public static boolean pagando[] = new boolean[cajas];

    public static void comprobarCajasLibres() {
        boolean libre = false;

        while (!libre) {
            for (int i = 0; i < SuperMarket.cajas; i++) {
                if (SuperMarket.pagando[i] == false) {
                    cajaLibre = true;
                    break;
                }
            }
            cajaLibre = false;
            break;
        }
    }

    public static void main(String[] args) {

        // Se declaran que estan libres las cajas
        for (int i = 0; i < cajas; i++) {
            pagando[i] = false;
        }

        // Se crea un numero aleatorio de clientes
        Random r = new Random();
        int m = r.nextInt(500) + 1;
        clientes = m;
        System.out.println("Hay " + clientes + " clientes");

        // Creamos un array de clientes para lanzarlos
        Cliente cli[] = new Cliente[clientes];

        for (int i = 0; i < clientes; i++) {
            cli[i] = new Cliente(i);
            cli[i].start();
        }

    }
}
