package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String args[]) {

        try {
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\numero.txt"));
            ArrayList<Integer> ar = new ArrayList<Integer>();
            String str = null;
            int num = 0;
            
            while (fl.ready()) {
                str = fl.readLine();
                num = Integer.parseInt(str);
                ar.add(num);
            }
            
            int total= 0;
            
            for (int i = 0; i < ar.size(); i++) {
                total += ar.get(i);
            }
            
            System.out.println(num);
            
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
