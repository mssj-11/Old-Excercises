/*
    Cifrado Simetrico
 */
package cifrados;


import java.security.Key;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
/**
 *
 * @author HP
 */

public class CifradoSimetrico {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 para cifrar o 2 para descifrar: ");
        int opcion = sc.nextInt();

        System.out.println("Ingrese la clave (16 caracteres): ");
        String clave = sc.next();

        System.out.println("Ingrese el texto a cifrar o descifrar: ");
        String texto = sc.next();

        // Crea la clave con algoritmo AES y tamaño de 128 bits
        Key key = new SecretKeySpec(clave.getBytes(), "AES");

        // Crea un objeto Cipher con el algoritmo AES
        Cipher cipher = Cipher.getInstance("AES");

        if (opcion == 1) {
            // Cifra el texto
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] textoCifrado = cipher.doFinal(texto.getBytes());
            System.out.println("Texto cifrado: " + DatatypeConverter.printHexBinary(textoCifrado));
        } else if (opcion == 2) {
            // Descifra el texto
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] textoDescifrado = cipher.doFinal(DatatypeConverter.parseHexBinary(texto));
            System.out.println("Texto descifrado: " + new String(textoDescifrado));
        } else {
            System.out.println("Opción inválida");
        }
    }
}



/*

Este ejemplo usa AES (Advanced Encryption Standard) como algoritmo de cifrado simétrico y ECB (Electronic Codebook) como modo de cifrado. La llave simétrica se especifica como un arreglo de bytes y se pasa a la clase **SecretKeySpec**. El proceso de cifrado y descifrado se realiza usando la clase **Cipher**.

*/