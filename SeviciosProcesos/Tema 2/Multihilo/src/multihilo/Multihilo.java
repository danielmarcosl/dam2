package multihilo;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Multihilo extends Thread {

    private static int nHilos = 4; // Numero de hilos que se van a crear
    private static int hiloActual = 0; // Numero del hilo que se esta ejecutando actualmente
    private static int resultado = 0; // Variable para almacenar los resultados de las operaciones de los hilos

    /**
     * Metodo para sumar los 10 primeros numeros naturales
     * @return Resultado de la suma
     */
    public int suma() {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += i;
        }
        return suma;
    }

    /**
     * Metodo para multiplicar los 10 primeros numeros naturales
     * @return Resultado de la suma
     */
    public int multiplicacion() {
        int multiplicacion = 1;
        for (int i = 1; i < 11; i++) {
            multiplicacion *= i;
        }
        return multiplicacion;
    }

    /**
     * Metodo para sumar los 10 primeros numeros pares naturales
     * @return Resultado de la suma
     */
    public int sumaPar() {
        int contador = 0;
        int posiblePar = 1;
        int sumaPar = 0;

        while (contador < 10) {
            if (posiblePar % 2 == 0) {
                sumaPar += posiblePar;

                posiblePar++;
                contador++;
            } else {
                posiblePar++;
            }
        }
        return sumaPar;
    }

    /**
     * Metodo para sumar los 10 primeros numeros impares naturales
     * @return Resultado de la suma
     */
    public int sumaImpar() {
        int contador2 = 0;
        int posibleImpar = 0;
        int sumaImpar = 0;

        while (contador2 < 10) {
            if (posibleImpar % 2 != 0) {
                sumaImpar += posibleImpar;

                posibleImpar++;
                contador2++;
            } else {
                posibleImpar++;
            }
        }
        return sumaImpar;
    }

    /**
     * Metodo para crear nuevo hilo
     * @param h Numero de hilo
     */
    public Multihilo(int h) {
        this.hiloActual = h;
    }

    /**
     * Metodo que se iniciar al lanzar los hilos
     * Segun el numero del hilo ejecutara una accion
     */
    public void run() {                
        System.out.print("Hilo " + hiloActual + ": ");
        switch (hiloActual) {
            case 0:
                resultado = suma();
                System.out.print("La suma de los 10 primeros numeros naturales es ");
                break;
            case 1:
                resultado = multiplicacion();
                System.out.print("La multiplicacion de los 10 primeros numeros naturales es ");
                break;
            case 2:
                resultado = sumaPar();
                System.out.print("La suma de los 10 primeros numeros pares es ");
                break;
            case 3:
                resultado = sumaImpar();
                System.out.print("La suma de los 10 primeros numeros impares es ");
                break;
        }
    }
    
    /**
     * Metodo principal, crea hilos, los lanza y devuelve el resultado de las acciones que hagan
     * @param args No se usa
     * @throws InterruptedException 
     */
    public static void main(String args[]) throws InterruptedException {
        Multihilo hilo = null;

        while (hiloActual < nHilos) {
            hilo = new Multihilo(hiloActual);
            hilo.start();
            hilo.join();
            
            System.out.println(resultado);
            
            hiloActual++;
        }
    }
}
