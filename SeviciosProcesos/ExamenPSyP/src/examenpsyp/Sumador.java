package examenpsyp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Sumador extends Thread {

    int numero;
    // Array para los 50 numeros aleatorios
    int numerosAleatorios[] = new int[50];

    Sumador(int n) {
        this.numero = n;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            // Generamos un numero aleatorio y lo guardamos en el array
            numerosAleatorios[i] = Metodos.generarAleatorio();
            System.out.println("Hilo " + numero + ", genera numero aleatorio " + numerosAleatorios[i]);

            try {
                // Llamamos al metodo para aumentar el valor de la posiciond el array
                Metodos.aumentar(numerosAleatorios[i], numero);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sumador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
