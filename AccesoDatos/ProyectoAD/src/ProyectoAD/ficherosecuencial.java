package ProyectoAD;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ficherosecuencial {

    public static void main(String args[]) {
        try {
            BufferedWriter fe = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Documents\\ejemplo.txt"));

            for (int i = 1; i <= 3; i++) {
                fe.write("linea" + i);
                fe.newLine();
            }
            fe.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
