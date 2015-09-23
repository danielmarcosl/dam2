package ProcessBuilder;

import java.io.IOException;
import java.util.Arrays;

public class Ej3 {

	public static void main(String[] args)

	throws IOException, InterruptedException {

		try {

			Process process = new ProcessBuilder(args).start();

			int retorno = process.waitFor();

			System.out.println("Comando " + Arrays.toString(args) + " devolvi�: " + retorno);

		} catch (IOException e) {

		} catch (InterruptedException e) {

			System.out.println("Error ocurri� ejecutando el comando:" + e.getMessage());

			System.out.println("El comando fue interrumpido. Descripci�n del error: " +

			e.getMessage());

		}

	}

}
