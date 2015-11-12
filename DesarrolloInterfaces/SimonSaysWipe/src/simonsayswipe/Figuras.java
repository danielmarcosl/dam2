package simonsayswipe;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Figuras extends JFrame{

	static Graphics2D g;
	public static ImageIcon []figuras = new ImageIcon[4];
	
	
	public static ImageIcon rombaco(){
		int y=0,alto=40,ancho=40;
		ImageIcon figura;
		BufferedImage bi = new BufferedImage(125,100,BufferedImage.TYPE_INT_ARGB);		
		g = bi.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		    g.setColor(Color.yellow);
			//g.fillRect(35,30, alto, ancho);
			g.rotate(Math.toRadians(-45));
			y = alto/2;
			ancho=(int)Math.pow(Math.pow((ancho/2),2)*2,0.5);
			alto=ancho;
			g.fillRect(-5, 65, alto,ancho);
			g.dispose();   
			figura = new ImageIcon(bi);
		
		return figura;
				
	}
	
	public static ImageIcon circulo(){
		
		ImageIcon figura;
		BufferedImage bi = new BufferedImage(125,100,BufferedImage.TYPE_INT_ARGB);
		bi = new BufferedImage(100,100,BufferedImage.TYPE_INT_ARGB);
		g = bi.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.setColor(Color.green);
		g.fillOval(30,30, 40, 40);
		g.dispose();
		figura = new ImageIcon(bi);
		return figura;
		
	}
	
	public static ImageIcon cuadrado(){
		
		ImageIcon figura;
		BufferedImage bi = new BufferedImage(100,100,BufferedImage.TYPE_INT_ARGB);
		g = bi.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.setColor(Color.blue);
		g.fillRect(30,30, 40, 40);
		g.dispose();
		figura = new ImageIcon(bi);
		return figura;
		
	}
	
	public static ImageIcon triangulo(){
		
		ImageIcon figura;
		BufferedImage bi = new BufferedImage(100,100,BufferedImage.TYPE_INT_ARGB);
		g = bi.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.setColor(Color.red);
		int [] vx1 = {50, 65, 35};
        int [] vy1 = {35, 70, 70};
        g.fillPolygon(vx1, vy1, 3);
		g.dispose();
		figura = new ImageIcon(bi);	
		return figura;
		
	}
	
	
	
}