public class ExtendHelloThread extends Thread {

	public void run() {
		System.out.println("Hola desde el hilo creado!");
	}
}

class RunT {
	public static void main(String args[]) {
		new HelloThread(); // Crea un nuevo hilo de ejecuci�n
		System.out.println("Hola desde el hilo prinicpal");
		System.out.println("Proceso acabado");
	}
}
