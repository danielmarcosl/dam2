package multihilo;

import multihilo.Operaciones;

/**
 *
 * @author Alumnot
 */
class Hijo extends Thread {

    private int hiloActual = 0;
    public int resultado = 0;

    Hijo(int nHilo) {
        this.hiloActual = nHilo;
    }

    public int resultado(int re) {
        resultado = re;
        return resultado;
    }
    
    public int getResultado() {
        return resultado;
    }

    /**
     * Metodo que se iniciar al lanzar los hilos. Segun el numero del hilo
     * ejecutara una accion
     */
    public void run() {
        System.out.print("Hilo " + hiloActual + ": ");
        switch (hiloActual) {
            case 0:
                resultado(Operaciones.suma());
                System.out.print("La suma de los 10 primeros numeros naturales es ");
                break;
            case 1:
                resultado(Operaciones.multiplicacion());
                System.out.print("La multiplicacion de los 10 primeros numeros naturales es ");
                break;
            case 2:
                resultado(Operaciones.sumaPar());
                System.out.print("La suma de los 10 primeros numeros pares es ");
                break;
            case 3:
                resultado(Operaciones.sumaImpar());
                System.out.print("La suma de los 10 primeros numeros impares es ");
                break;
        }
    }
}
