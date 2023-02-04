/*
    CIFRADO AES
La longitud de la llave para el cifrado y descifrado AES debe ser de 128, 192 ó 256 bits. 
La longitud de 128 bits se logra codificando 16 caracteres en base64.

    Ejemplo de CLAVE de 128 bits = YTExMjhiaXRzMTI4Yml0cw==
*/
package IA;
/**
 * @author HP - MSS
 */
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Scanner;
import java.util.Base64;

public class AES {
    
    private static final String ALGORITMO = "AES";
    private static final String CIFRADO = "AES/ECB/PKCS5Padding";
    private static final String CODIFICACION = "UTF-8";
    private static final int LONGITUD_LLAVE = 128;

    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("*****   CIFRADO AES  *****");
        System.out.print("Introduce la clave de cifrado (debe tener una longitud de 128 bits): ");
        String clave = scan.nextLine();
        Key llave = new SecretKeySpec(clave.getBytes(CODIFICACION), ALGORITMO);

        System.out.print("Introduce el texto a cifrar: ");
        String textoPlano = scan.nextLine();
        byte[] textoCifrado = cifrar(textoPlano, llave);
        System.out.print("Texto cifrado: " + Base64.getEncoder().encodeToString(textoCifrado));

        System.out.println("\nTexto descifrado: " + descifrar(textoCifrado, llave));
    }

    
    public static byte[] cifrar(String textoPlano, Key llave) throws Exception {
        Cipher cipher = Cipher.getInstance(CIFRADO);
        cipher.init(Cipher.ENCRYPT_MODE, llave);

        return cipher.doFinal(textoPlano.getBytes(CODIFICACION));
    }

    
    public static String descifrar(byte[] textoCifrado, Key llave) throws Exception {
        Cipher cipher = Cipher.getInstance(CIFRADO);
        cipher.init(Cipher.DECRYPT_MODE, llave);

        byte[] textoPlano = cipher.doFinal(textoCifrado);

        return new String(textoPlano);
    }
    
}