package cajero;

/**
 *
 * @author Daniel Marcos Lorrio
 */
class Cuenta {

    private int saldo;

    Cuenta(int s) {
        saldo = s;
    }

    int getsaldo() {
        return saldo;
    }

    void restar(int cantidad) {
        saldo = saldo - cantidad;
    }

    synchronized void retirardinero(int cant, String nom) {
        if (getsaldo() >= cant) {
            System.out.println(nom + " retira " + cant + " actual (" + getsaldo() + ")");

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            restar(cant);
        } else {
            System.out.println(nom + " sin saldo suficiente " + getsaldo());
        }

        if (getsaldo() < 0) {
            System.out.println("Saldo negativo " + getsaldo());
        }
    }
}

class sacardinero extends Thread {

    private Cuenta c;
    String nom;

    public sacardinero(String n, Cuenta c) {
        super(n);
        this.c = c;
        this.nom = n;
    }

    public void run() {
        for (int i = 0; i <= 4; i++) {
            c.retirardinero(10, nom);
        }
    }
}

public class Cajero {

    public static void main(String args[]) {
        Cuenta c = new Cuenta(40);
        
        sacardinero h1 = new sacardinero("Golondrino", c);
        sacardinero h2 = new sacardinero("Petra", c);
        
        h2.start();
        h1.start();
    }
}
