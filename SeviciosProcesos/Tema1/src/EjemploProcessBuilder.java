import java.io.*;

public class EjemploProcessBuilder {

	public static void main(String args[]) throws IOException{
		
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C","dir");
		
		File fOut = new File ("C:\\salida.txt");
		File fErr = new File ("C:\\error.txt");
		File fIn = new File ("C:\\entrada.txt");
		
		pb.redirectInput(fIn);
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
	}
	
}
