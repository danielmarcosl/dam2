package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String args[]) {

        try {
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\numero.txt"));
            ArrayList<Integer> ar = new ArrayList<Integer>();
            String str = null;
            int num;
            
            while (fl.ready()) {
                str = fl.readLine();
                num = Integer.parseInt(str);
                ar.add(num);
            }
            
            for (int i = 0; i < ar.size(); i++) {
                if (ar.get(i) % 2 == 0) {
                    System.out.println("El numero " + ar.get(i) + " es par");
                } else {
                    System.out.println("El numero " + ar.get(i) + " es impar");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
