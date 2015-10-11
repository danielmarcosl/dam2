package hellothread;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class HelloThread implements Runnable {

    Thread t;

    HelloThread() {
        t = new Thread(this, "Nuevo Thread");
        System.out.println("Creado hilo: " + t);
        t.start(); // Arranca el nuevo hilo de ejecuci�n. Ejecuta run
    }

    public void run() {
        System.out.println("Hola desde el hilo creado!");
        System.out.println("Hilo finalizado");
    }
}

class RunThread {

    public static void main(String args[]) {
        new HelloThread(); // Crea un nuevo hilo de ejecuci�n
        System.out.println("Hola desde el hilo prinicpal");
        System.out.println("Proceso acabado");
    }
}
