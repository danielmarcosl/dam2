package ProcessBuilder;

import java.io.File;
import java.io.IOException;

public class Ej5 {
	
	public static void main(String args[]) throws IOException {
		
		ProcessBuilder pb = new ProcessBuilder("CMD","/C","ping 8.8.8.8");
		
		File fOut = new File ("C:\\Users\\Alumnot\\Downloads\\salida.txt");
		File fErr = new File ("C:\\Users\\Alumnot\\Downloads\\error.txt");
		
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}
}
