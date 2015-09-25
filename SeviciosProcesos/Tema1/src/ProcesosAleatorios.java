import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.ProcessBuilder;

public class ProcesosAleatorios {

	public static void main (String args[]) {
		
		String linea;
		
		try {			
			Process hijo = new ProcessBuilder("CMD","./aleatorioHijo").start();
			BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
			PrintStream ps = new PrintStream(hijo.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			while ((in.readLine()).compareTo("fin") != 0) {
				ps.println(""); // No es necesario escribir nada
				ps.flush(); // Asegura que los datos se han enviado
				if ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
			}
			
			System.out.println("Finalizado");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
