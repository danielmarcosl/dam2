package supermarket;

import java.util.Random;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Cliente extends Thread {

    int num = 0;

    public static Caja c = new Caja();

    public Cliente(int n) {
        this.num = n;
    }

    public void run() {

        Random r = new Random();
        int pago = r.nextInt(40) + 1;

        int caja = c.cogerNumero();

        c.atenderCliente(num, pago, caja);
    }
}
