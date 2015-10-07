import java.io.IOException;
import java.util.Arrays;
import java.lang.ProcessBuilder;

public class Multiprocesos {

	public static void main (String args[]) {

		ProcessBuilder pb1 = new ProcessBuilder("NOTEPAD");
		ProcessBuilder pb2 = new ProcessBuilder("EXPLORER");
		pb1.inheritIO();
		
		try {
			final Process process = pb1.start();
			System.out.println("ejecucion de Notepad");
		} catch (IOException e) {
			System.err.println("Excepcion de E/S");
			System.exit(-1);
		}
		try {
			final Process process = pb2.start();
			System.out.println("ejecucion de Explorer");
		} catch (IOException e) {
			System.err.println("Excepcion de E/S");
			System.exit(-1);
		}
	}
}