import java.util.Random;

public class aleatorioHijo {

	public static void main(String args[]) {
		int cantidad = 16;
		Random randomNum = new Random();
		
		for (int i = 0; i <= cantidad; i++) {
			int randomInt = randomNum.nextInt(10);
			System.out.println(randomInt);
		}
	}

}
