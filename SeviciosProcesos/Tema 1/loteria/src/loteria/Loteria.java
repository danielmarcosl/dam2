package loteria;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Loteria {

    public static void main(String[] args) throws IOException, InterruptedException {
        String line;
        Process[] p = new Process[6];
        InputStream[] is = new InputStream[6];
        InputStreamReader[] isr = new InputStreamReader[6];
        BufferedReader[] br = new BufferedReader[6];

        for (int i = 0; i < 6; i++) {
            p[i] = new ProcessBuilder("C:\\Users\\Alumnot\\Desktop\\aleatorios").start();
            is[i] = p[i].getInputStream();
            isr[i] = new InputStreamReader(is[i]);
            br[i] = new BufferedReader(isr[i]);
            Thread.sleep(800);
        }

        for (int h = 0; h < 6; h++) {
            p[h].waitFor();
        }

        for (int w = 0; w < 6; w++) {
            System.out.println("Salida del proceso Aleatorio" + w + ".");
            while ((line = br[w].readLine()) != null) {
                System.out.println(line);
            }
        }
    }

}
