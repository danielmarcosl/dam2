
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class hijo {

    public static void main(String args[]) {
        int cantidad = 16;
        Random randomNum = new Random();

        PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));

        for (int i = 0; i <= cantidad; i++) {
            int randomInt = randomNum.nextInt(10);
            ps.println(randomInt);
        }
    }

}
