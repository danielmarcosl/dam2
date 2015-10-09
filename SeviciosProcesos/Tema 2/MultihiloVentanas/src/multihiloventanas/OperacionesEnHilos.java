package multihiloventanas;

/**
 *
 * @author Alumnot
 */
public class OperacionesEnHilos extends Thread {

    private int numHilo;
    Operaciones operacion;
    private ventanas ventana_hilo;

    OperacionesEnHilos(int i, Operaciones resultados) {
        this.numHilo = i;
        this.operacion = resultados;
        this.ventana_hilo = new ventanas("Hilo" + numHilo);
    }

    public void run() {
        String cadena = new String();
    }
}
