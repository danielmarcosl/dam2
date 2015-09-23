package ProcessBuilder;

import java.io.IOException;

public class Ej4 {
	
	public static void main (String args[]) {
		
		ProcessBuilder pb1 = new ProcessBuilder("NOTEPAD");
		ProcessBuilder pb2 = new ProcessBuilder("EXPLORER");
		
		try{
			Process process = pb1.start();
			System.out.println("Ejecucion de notepad");
		} catch(IOException ex) {
			System.err.println("Excepcion de E/S!!");
			System.exit(-1);
		}
		
		try{
			Process process = pb2.start();
			System.out.println("Ejecucion de explorer");
		} catch(IOException ex) {
			System.err.println("Excepcion de E/S!!");
			System.exit(-1);
		}
	}

}