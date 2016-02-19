package cipherejemplo;

import javax.crypto.*;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class CipherEjemplo {

    public static void main(String[] args) {

        try {
            System.out.println("Obteniendo generador de claves de cifrado DES");
            KeyGenerator keygen = KeyGenerator.getInstance("DES");

            System.out.println("Generando la Clave");
            SecretKey key = keygen.generateKey();

            System.out.println("Obteniendo factoria de claves con cifrado DES");
            Cipher desCipher = Cipher.getInstance("DES");

            System.out.println("Configurando Cipher para encriptar");
            desCipher.init(Cipher.ENCRYPT_MODE, key);

            System.out.println("Preparando el mensaje");
            String mensaje = "Mensaje de prueba";
            System.out.println("Mensaje original: " + mensaje);

            System.out.println("Cifrando el mensaje");
            byte[] bitcodificado = desCipher.doFinal(mensaje.getBytes());
            String mensajeCifrado = new String(bitcodificado);
            System.out.println("Mensaje Cifrado: " + mensajeCifrado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
