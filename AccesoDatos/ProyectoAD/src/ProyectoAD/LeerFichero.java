package ProyectoAD;

import java.io.*;
import java.util.*;

public class LeerFichero {

    public static void main(String args[]) {

        try {
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\ejemplo.txt"));
            
            while (fl.ready()) {
                System.out.println(fl.readLine());
            }
        fl.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
