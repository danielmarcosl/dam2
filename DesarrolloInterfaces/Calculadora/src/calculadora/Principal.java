package calculadora;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 4 27/10/2015
 */
public class Principal {

    /**
     * Metodo principal que llama al constructor y muestra la ventana creada
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseVista vista = new ClaseVista(); // Invocamos al constructor de ClaseVista
        ClaseModelo modelo = new ClaseModelo(); // Invocamos al constructor de ClaseModelo

        new ClaseControlador(vista, modelo);
    }
}
