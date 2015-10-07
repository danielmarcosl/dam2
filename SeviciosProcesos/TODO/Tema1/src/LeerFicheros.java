import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;

public class LeerFicheros {

	public static void main(File f) throws Exception {
		
		BufferedReader linea = new BufferedReader(new FileReader(f));
		try {
			String cadena = linea.readLine();
			
			while(cadena != null) {
				System.out.println(cadena);
				cadena = linea.readLine();
			}
		} catch (EOFException e) {
			linea.close();
		}
	}
}
