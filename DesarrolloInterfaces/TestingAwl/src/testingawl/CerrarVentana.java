package testingawl;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 14/10/2015
 */
class CerrarVentana implements WindowListener {

    /**
     * Boton de cerrar
     *
     * @param e Boton pulsado
     */
    public void windowClosing(WindowEvent e) {
        //System.out.println("Aqui tampoco xdxd por favor no revientes el monitor");
        System.exit(0);
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowOpened(WindowEvent e) {
    }
}
