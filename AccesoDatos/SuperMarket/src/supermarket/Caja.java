package supermarket;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Caja {
    
    private int pago;
    
    int getPago() {
        return pago;
    }
    
    synchronized void atenderCliente(int n, int p, int c) {
        
        int numCaja = c;
        
        while(SuperMarket.pagando[numCaja]) {
                wait();
        }
        System.out.println("El cliente " + n + " esta pagando en la caja " + c);
        
        pago = p;
        
        Random r = new Random();
        int tiempo = r.nextInt(4000) + 1;
        
        try {
            sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Total a pagar por cliente " + n + ": " + p);
        notify();
    }
    
    
}
