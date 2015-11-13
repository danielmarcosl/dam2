package supermarket;

import java.util.Random;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Cliente extends Thread {
    
    int caja;
    int num = 0;
    
    public Cliente(int n, int c) {
        this.num = n;
        this.caja = c;
    }
    
    public void run() {
        
        Caja c = new Caja();
        
        //Random r = new Random();
        //int pago = r.nextInt(40) + 1;
        
        c.atenderCliente(num,30,caja);
    }
}
