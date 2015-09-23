package ProcessBuilder;

import java.io.File;
import java.io.IOException;

public class Ej6 {
	
	public static void main(String args[]) throws IOException {
		
		ProcessBuilder pb = new ProcessBuilder("CMD");
		
		File fBat = new File ("C:\\Users\\Alumnot\\Downloads\\salida.txt");
		File fOut = new File ("C:\\Users\\Alumnot\\Downloads\\salida.txt");
		File fErr = new File ("C:\\Users\\Alumnot\\Downloads\\error.txt");
		
		pb.redirectInput(fBat);
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}
}
