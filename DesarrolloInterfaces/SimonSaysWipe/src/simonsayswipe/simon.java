package simonsayswipe;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import static java.lang.Math.random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;

public class simon extends JFrame {

    public static int pulsaciones = 1;
    public static int pulsa = 0;
    public static boolean usuario = false;
    public static boolean esperarListener = false;
    BufferedImage bi;
    int tama = 0;
    private JPanel contentPane;
    public static JButton btnCuadrado;
    public static JButton btnCirculo;
    public static JButton btnRombo;
    public static JButton btnTriangulo;
    public static JButton empezar;
    Border borde = new LineBorder(new Color(204, 0, 0), 1);
    private boolean rom = false;
    private boolean cir = false;
    private boolean cua = false;
    private boolean tri = false;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    boolean main = true;
                    simon frame = new simon();
                    frame.setVisible(true);
                        main=jugar();
                        System.out.println("estamos jugando");
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public simon() throws InterruptedException {
        ImageIcon tr = new ImageIcon("F:\\mars.jpg");
        Image img = tr.getImage();
        bi = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bi.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        //g.drawImage(img, 0, 0, 100, 100,null);
        g.setColor(Color.blue);
        g.fillRect(30, 30, 40, 40);
        g.dispose();
        ImageIcon figura = new ImageIcon(bi);

        bi = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        g = bi.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setColor(Color.green);
        g.fillOval(30, 60, 40, 40);
        g.dispose();
        ImageIcon figura2 = new ImageIcon(bi);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 440, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        Image uno = figura.getImage();
        Image dos = figura2.getImage();

        //int y = Math.max(uno.getHeight(uno),dos.getHeight());
        JLabel lbl = new JLabel("New label");
        lbl.setBounds(12, 100, 408, 30);
        lbl.setLayout(new BoxLayout(lbl, BoxLayout.X_AXIS));
        lbl.setIconTextGap(4);
        //lbl.setIcon(figura);
        JLabel lbl1 = new JLabel();
        lbl1.setBounds(12, 100, 408, 30);
        //lbl1.setIcon(figura);
        lbl.add(lbl1);

        //lbl.add(lbl1);
        contentPane.add(lbl);

//        empezar = new JButton("Empezar");
//        empezar.setBounds(0, 200, 100, 50);
//        contentPane.add(empezar);
//        empezar.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                jugar();
//            }
//        });;//Fin boton 7

        //Boton cuadrado
        btnCuadrado = new JButton("");
        btnCuadrado.setBounds(10, 0, 100, 100);
        btnCuadrado.setBackground(new Color(0, 0, 0));
        btnCuadrado.setBorder(borde);
        btnCuadrado.setIcon(Figuras.cuadrado());
        contentPane.add(btnCuadrado);
        btnCuadrado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usuario) {
                    pulsa = 1;
                    pulsaciones++;
                    esperarListener = true;
                }
            }
        });;//Fin boton cuadrado

        //Boton circulo
        btnCirculo = new JButton("");
        btnCirculo.setBounds(110, 0, 100, 100);
        btnCirculo.setBackground(new Color(0, 0, 0));
        btnCirculo.setBorder(borde);
        btnCirculo.setIcon(Figuras.circulo());
        contentPane.add(btnCirculo);
        btnCirculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usuario) {
                    pulsa = 2;
                    pulsaciones++;
                    esperarListener = true;
                }
            }
        });;//Fin boton circulo

        //Boton rombo		
        btnRombo = new JButton("");
        btnRombo.setBounds(210, 0, 100, 100);
        btnRombo.setBackground(new Color(0, 0, 0));
        btnRombo.setBorder(borde);
        btnRombo.setIcon(Figuras.rombaco());
        contentPane.add(btnRombo);
        btnRombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usuario) {
                    pulsa = 3;
                    pulsaciones++;
                    esperarListener = true;
                }
            }
        });;//Fin boton rombo

        //Boton triangulo		
        btnTriangulo = new JButton("");
        btnTriangulo.setBounds(310, 0, 100, 100);
        btnTriangulo.setBackground(new Color(0, 0, 0));
        btnTriangulo.setBorder(borde);
        btnTriangulo.setIcon(Figuras.triangulo());
        contentPane.add(btnTriangulo);
        btnTriangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (usuario) {
                    pulsa = 4;
                    pulsaciones++;
                    esperarListener = true;
                }
            }
        });;//Fin boton triangulo

    }

    public static boolean jugar() {
        boolean jugar = true;
        int contador = 1;
        boolean jugando = true;
        Random generator = new Random();
        while (jugando) {
            int array[] = new int[contador];
            System.out.println("pulsa la maquina");
            for (int i = 0; i < contador; i++) {
                int ran = generator.nextInt(4) + 1;
                switch (ran) {
                    case 1:
                        btnCuadrado.doClick(400);
                        array[i] = 1;
                        break;
                    case 2:
                        btnCirculo.doClick(400);
                        array[i] = 2;
                        break;
                    case 3:
                        btnRombo.doClick(400);
                        array[i] = 3;
                        break;
                    case 4:
                        btnTriangulo.doClick(400);
                        array[i] = 4;
                        break;
                }
            }
            System.out.println("la maquina ha acabado");
            int pulsacion[] = new int[contador];
            usuario = true;
            System.out.println("pulsa el usuario");
            pulsacion[pulsaciones] = pulsa;
            while (pulsaciones < contador && pulsaciones != 0) {
                if (pulsacion[pulsaciones] != array[pulsaciones] && pulsaciones != 0) {
                    jugando = false;
                    pulsaciones = contador;
                    jugar = false;
                    System.out.println("has fallado");
                } else {
                    System.out.println("todo bn todo correcto");
                }
                pulsacion[pulsaciones] = pulsa;
            }
            System.out.println("termina el usuario");
            contador++;
            usuario = false;
        }
        return jugar;
    }
}