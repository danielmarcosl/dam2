import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ProcesosAleatorios {

	static int aleatorios = 6;
	
	public static void main(String args[]) throws IOException {

		Process[] p = new Process[aleatorios]; // Array de procesos
		InputStream is[] = new InputStream[aleatorios];
		InputStreamReader isr[] = new InputStreamReader[aleatorios];
		BufferedReader br[] = new BufferedReader[aleatorios];

		for (int i = 0; i < aleatorios; i++) {
			p[i] = new ProcessBuilder(".\\aleatorioHijo.java").start();
			is[i] = p[i].getInputStream();
			isr[i] = new InputStreamReader(is[i]);
			br[i] = new BufferedReader(isr[i]);
		}
		
		for (int i = 0; i < aleatorios; i++) {
			p[i].waitFor();
		}

		String linea;

		for (int i = 0; i < aleatorios; i++) {
			System.out.println("Salida del proceso aleatorio" + i + " ");
			while ((linea = br[i].readLine()) != null) {
				System.out.println(linea);
			}
		}
	}
}
