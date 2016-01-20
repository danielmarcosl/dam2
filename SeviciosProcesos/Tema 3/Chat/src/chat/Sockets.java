package chat;

import java.io.*;
import java.net.*;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Sockets extends Thread {

    Socket clientSocket = null;

    Sockets(Socket s) {
        clientSocket = s;
    }

    public void run() {
        try {
            // Buffer de salida
            OutputStream os = clientSocket.getOutputStream();
            PrintWriter fOut = new PrintWriter(os, true);

            // Buffer de entrada
            InputStream is = clientSocket.getInputStream();
            BufferedReader fIn = new BufferedReader(new InputStreamReader(is));

            requestName(fOut, fIn);

            String message = "";
            while ((message = fIn.readLine()) != null) {
                fOut.println(message);
                printMessage(message);
            }

            // Cerrar buffers
            fOut.close();
            fIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void requestName(PrintWriter fo, BufferedReader fi) throws IOException {
        fo.println("Introduce tu nombre de usuario: ");
        ServerWindow.serverText.setText(fi.readLine() + "\n");
    }

    private void printMessage(String m) {
        if (!m.equals("cerrar")) {
            ServerWindow.serverText.setText(ServerWindow.serverText.getText() + m + "\n");
        } else {
            ServerWindow.serverText.setText(ServerWindow.serverText.getText() + "Usuario se ha desconectado." + "\n");
        }
    }
}
