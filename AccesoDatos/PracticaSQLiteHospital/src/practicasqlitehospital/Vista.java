package practicasqlitehospital;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Vista extends JFrame implements ActionListener {

    private JScrollPane scrollpanel;
    static JTextArea textarea;
    static JButton bAlta = new JButton("Alta");
    static JButton bBaja = new JButton("Baja");
    static JButton bMod = new JButton("Modificar");
    public static JButton bSalir = new JButton("Salir");

    public Vista() {
        super("BD del hospital");
        setLayout(null);

        textarea = new JTextArea();
        scrollpanel = new JScrollPane(textarea);

        bAlta.setBounds(10, 10, 100, 30);
        add(bAlta);
        bBaja.setBounds(110, 10, 100, 30);
        add(bBaja);
        bMod.setBounds(210, 10, 100, 30);
        add(bMod);
        bSalir.setBounds(310, 10, 100, 30);
        add(bSalir);

        scrollpanel.setBounds(10, 50, 400, 300);
        add(scrollpanel);

        textarea.setEditable(false);

        bSalir.addActionListener(this);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Vista.bSalir) {
            System.out.println("Se ha cerrado el programa");
            System.exit(0);
        } else if (e.getSource() == Vista.bAlta) {
            Herramientas.insertArrayListSQLite("ejemplo", Herramientas.crearArrayPaciente(), "paciente(cod_pac, dni, nombre, edad, sexo, alergias, cod_hab)");
        } else if (e.getSource() == Vista.bBaja) {
            //Herramientas.deleteSQLite();
        } else if (e.getSource() == Vista.bMod) {

        }
    }
}
