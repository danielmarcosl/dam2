package supermarket;

import java.util.Random;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class SuperMarket {

    public static int cajas = 5;
    public static int clientes = 0;

    public static boolean pagando[] = new boolean[cajas];

    public static void main(String[] args) {

        for (int i = 0; i < cajas; i++) {
            pagando[i] = false;
        }

        Random r = new Random();
        int m = r.nextInt(500) + 1;

        clientes = m;
        System.out.println("Hay " + clientes + " clientes");

        Cliente cli[] = new Cliente[clientes];
        Caja ca[] = new Caja[cajas];

        for (int i = 0; i < clientes; i++) {
            int n = r.nextInt(cajas) + 1;
            cli[i] = new Cliente(i, n);
            cli[i].start();
        }

    }
}
