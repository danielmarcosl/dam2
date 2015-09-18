package ProcessBuilder;

import java.io.IOException;
import java.util.Arrays;;

public class Ej1 {

	public static void main (String args[]) throws IOException {
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");;
			System.exit(-1);;
		}
		
		ProcessBuilder pb = new ProcessBuilder(args);
		
		try {
			Process process = pb.start();
			int retorno = process.waitFor();
			System.out.println("La ejecuci�n de " + Arrays.toString(args) + " devuelve " + retorno);
		} catch (IOException ex) {
			System.err.println("Excepci�n de E/S");
			System.exit(-1);
		} catch (InterruptedException ex) {
			System.err.println("El proceso hijo finaliz� de forma incorrecta");
			System.exit(-1);
		}
	}
}
