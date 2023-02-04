/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IA;

/**
 *
 * @author HP
 */
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class EncryptionDecryptionExample {
  private static final String ALGO = "AES";
  private static final byte[] keyValue = 
    new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't', 'S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };

  public static String encrypt(String data) throws Exception {
    Key key = generateKey();
    Cipher c = Cipher.getInstance(ALGO);
    c.init(Cipher.ENCRYPT_MODE, key);
    byte[] encVal = c.doFinal(data.getBytes());
    return DatatypeConverter.printBase64Binary(encVal);
  }

  public static String decrypt(String encryptedData) throws Exception {
    Key key = generateKey();
    Cipher c = Cipher.getInstance(ALGO);
    c.init(Cipher.DECRYPT_MODE, key);
    byte[] decordedValue = DatatypeConverter.parseBase64Binary(encryptedData);
    byte[] decValue = c.doFinal(decordedValue);
    return new String(decValue);
  }

  private static Key generateKey() throws Exception {
    return new SecretKeySpec(keyValue, ALGO);
  }

  public static void main(String[] args) throws Exception {
    String originalMessage = "The quick brown fox jumps over the lazy dog";
    System.out.println("Original message: " + originalMessage);

    String encryptedMessage = encrypt(originalMessage);
    System.out.println("Encrypted message: " + encryptedMessage);

    String decryptedMessage = decrypt(encryptedMessage);
    System.out.println("Decrypted message: " + decryptedMessage);
  }
  
  
}


/*

Este ejemplo muestra cómo cifrar y descifrar un mensaje usando el algoritmo AES. La clave de cifrado se define como una matriz de bytes y se utiliza para generar un objeto Key. Luego, se crea un objeto Cipher con la clave y el algoritmo de cifrado especificados, y se usa para cifrar y descifrar el mensaje. La clase DatatypeConverter se utiliza para convertir la salida de cifrado en una cadena codificada en base64 para su fácil transmisión. Finalmente, se imprime el mensaje original, el mensaje cifrado y el mensaje descifrado para verificar que el proceso de cifrado y descifrado sea correcto.

*/