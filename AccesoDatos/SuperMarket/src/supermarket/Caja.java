package supermarket;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Caja {

    public synchronized int cogerNumero() {

        boolean buscando = true;
        int numCaja = 0;

        while (!SuperMarket.cajaLibre) {
            try {
                wait(500);

                SuperMarket.comprobarCajasLibres();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        for (int i = 0; i < SuperMarket.cajas; i++) {
            if (SuperMarket.pagando[i] == false) {
                SuperMarket.pagando[i] = true;
                buscando = false;
                numCaja = i;
            }
        }

        return numCaja;
    }

    public static void atenderCliente(int n, int p, int c) {

        int numCaja = c;

        System.out.println("El cliente " + n + " esta pagando en la caja " + numCaja);

        Random r = new Random();
        int tiempo = r.nextInt(4000) + 1;

        try {
            sleep(tiempo);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Total a pagar por cliente " + n + ": " + p);

        SuperMarket.pagando[numCaja] = false;
    }
}
