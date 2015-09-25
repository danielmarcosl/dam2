import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder;

public class ProcessBuilderFichero {

	public static void main (String args[]) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("CMD","/C","dir");
		
		File fOut = new File("C\\Users\\Alumnot\\salida.txt");
		File fErr = new File("C\\Users\\Alumnot\\error.txt");
		
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}
}
