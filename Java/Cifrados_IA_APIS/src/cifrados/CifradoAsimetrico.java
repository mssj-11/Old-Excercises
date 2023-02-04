/*
    El cifrado asimétrico es una técnica de cifrado que utiliza dos claves diferentes para cifrar y descifrar un mensaje. Aquí está un ejemplo de cifrado y descifrado asimétrico utilizando la biblioteca Java Cryptography Extension (JCE)
    
    Este ejemplo utiliza el algoritmo de cifrado RSA para cifrar y descifrar un mensaje que se ingresa por medio de un escáner. Se generan dos claves, una pública y una privada, y luego se utilizan para cifrar y descifrar el mensaje.
*/
package cifrados;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;
import javax.crypto.Cipher;
/**
 *
 * @author HP
 */
public class CifradoAsimetrico {

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
    keyGen.initialize(2048);
    KeyPair keyPair = keyGen.generateKeyPair();
    PrivateKey privateKey = keyPair.getPrivate();
    PublicKey publicKey = keyPair.getPublic();

    while (true) {
      System.out.println("Seleccione una opción:");
      System.out.println("1. Cifrar mensaje");
      System.out.println("2. Descifrar mensaje");
      System.out.println("3. Salir");

      int opcion = sc.nextInt();
      sc.nextLine();
      switch (opcion) {
        case 1:
          System.out.println("Ingrese el mensaje a cifrar:");
          String mensaje = sc.nextLine();
          byte[] mensajeCifrado = cifrarMensaje(mensaje, publicKey);
          System.out.println("Mensaje cifrado: " + mensajeCifrado);
          break;
        case 2:
          System.out.println("Ingrese el mensaje cifrado:");
          byte[] mensajeDescifrado = descifrarMensaje(sc.nextLine().getBytes(), privateKey);
          System.out.println("Mensaje descifrado: " + mensajeDescifrado);
          break;
        case 3:
          System.exit(0);
          break;
        default:
          System.out.println("Opción inválida, seleccione nuevamente.");
          break;
      }
    }
  }

  private static byte[] cifrarMensaje(String mensaje, PublicKey publicKey) throws Exception {
    Cipher cipher = Cipher.getInstance("RSA");
    cipher.init(Cipher.ENCRYPT_MODE, publicKey);
    return cipher.doFinal(mensaje.getBytes());
  }

  private static byte[] descifrarMensaje(byte[] mensajeCifrado, PrivateKey privateKey) throws Exception {
    Cipher cipher = Cipher.getInstance("RSA");
    cipher.init(Cipher.DECRYPT_MODE, privateKey);
    return cipher.doFinal(mensajeCifrado);
  }
}
/*  [B@7a92922  */