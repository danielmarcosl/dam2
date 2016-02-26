package dialogtest;

import javax.swing.JOptionPane;

/**
 *
 * @author AlumnoT
 */
public class elegirOpcion extends javax.swing.JDialog {

    public elegirOpcion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        String[] opciones = {"Di hola", "Di adios"};
        
        int X = JOptionPane.showOptionDialog(this, "Elige una opcion", "Elegir opcion",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);

        switch (X) {
            case JOptionPane.YES_OPTION:
                // new mostrarHola();
                break;
            case JOptionPane.NO_OPTION:
                // new mostrarAdios();
                break;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }

    private void initComponents() {

    }
}
