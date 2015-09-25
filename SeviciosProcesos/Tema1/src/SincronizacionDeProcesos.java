import java.io.IOException;
import java.util.Arrays;
import java.lang.ProcessBuilder;

public class SincronizacionDeProcesos {

	public static void main(String[] args) throws IOException, InterruptedException {

		try {
			Process process = new ProcessBuilder(args).start();
			int retorno = process.waitFor();

			System.out.println("Comando " + Arrays.toString(args) + " devolvió: " + retorno);
		} catch (IOException e) {
			System.out.println("Error ocurrió ejecutando el comando:" + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("El comando fue interrumpido. Descripción del error: " + e.getMessage());
		}
	}
}