package dialogtest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AlumnoT
 */
public class Ventana extends JFrame implements ActionListener {

    JButton boton = new JButton("Clicka");

    public Ventana() {
        super("Ventana principal");
        setLayout(null);
        setBounds(0, 0, 150, 150);

        
        boton.setBounds(25, 25, 100, 50);
        add(boton);
        boton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            new elegirOpcion(this, true);
        }
    }
}
