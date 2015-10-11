package creaciondeprocesos;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 11/10/2015
 */
public class CreacionDeProcesos {

    /**
     * This program will create a new process, opening the program indicated in
     * the String comando
     *
     * @param args Not used
     */
    public static void main(String args[]) {
        Runtime r = Runtime.getRuntime();
        String comando = "NOTEPAD";
        Process p;

        try {
            p = r.exec(comando);
        } catch (Exception e) {
            System.out.println("Error en: " + comando);
            e.printStackTrace();
        }
    }
}
