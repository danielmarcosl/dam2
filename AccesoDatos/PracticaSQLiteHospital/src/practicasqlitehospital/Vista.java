package practicasqlitehospital;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Vista extends JFrame {

    // Panel con scroll para el panel de texto
    private JScrollPane scrollpanel;
    // Panel de texto
    static JTextArea textarea;
    // Botones
    static JButton bAlta;
    static JButton bBaja;
    static JButton bMod;
    static JButton bSalir;
    // Campo de texto
    static JTextField campoTexto;

    /**
     * Constructor de Vista
     */
    public Vista() {
        // Detalles de la ventana
        setTitle("Hospital");
        setLayout(null);
        setBounds(0, 0, 435, 440);
        setResizable(false);

        // Inicializamos los botones
        bAlta = new JButton("Alta");
        bBaja = new JButton("Baja");
        bMod = new JButton("Modificar");
        bSalir = new JButton("Salir");

        // Inicializamos el campod e texto
        campoTexto = new JTextField("");

        // Inicializamos el panel de texto y lo anadimos al scroll
        textarea = new JTextArea();
        scrollpanel = new JScrollPane(textarea);

        // Posicionamos los botones y su tamano, y los anadimos a la ventana
        bAlta.setBounds(10, 10, 100, 30);
        add(bAlta);
        bBaja.setBounds(110, 10, 100, 30);
        add(bBaja);
        bMod.setBounds(210, 10, 100, 30);
        add(bMod);
        bSalir.setBounds(310, 10, 100, 30);
        add(bSalir);

        // Posicionamos el scroll y lo anadimos a la ventana
        scrollpanel.setBounds(10, 50, 400, 300);
        add(scrollpanel);

        // Posicionamos el campo de texto y lo anadimos a la ventana
        campoTexto.setBounds(10, 360, 400, 40);
        add(campoTexto);

        // Hacemos que el panel de texto no sea editable
        textarea.setEditable(false);
    }
}
