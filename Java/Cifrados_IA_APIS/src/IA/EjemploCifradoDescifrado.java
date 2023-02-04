/*
Este ejemplo muestra cómo cifrar y descifrar un mensaje usando el algoritmo AES. 
La clave de cifrado se define como una matriz de bytes y se utiliza para generar un objeto Llave. 
Luego, se crea un objeto Cifrador con la clave y el algoritmo.
*/
package IA;
/**
 * @author HP - MSS
 */
import java.security.Key;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class EjemploCifradoDescifrado {
    
  private static final String ALGORITMO = "AES";
  private static final byte[] valorLlave = 
    new byte[] { 'L', 'a', 'M', 'e', 'j', 'o', 'r', 'L', 'l', 'a', 'v','e', 'S', 'e', 'c', 'r', 'e', 't', 'a' };

  
  public static String cifrar(String datos) throws Exception {
    Key llave = generarLlave();
    Cipher c = Cipher.getInstance(ALGORITMO);
    c.init(Cipher.ENCRYPT_MODE, llave);
    byte[] valCifrado = c.doFinal(datos.getBytes());
    return DatatypeConverter.printBase64Binary(valCifrado);
  }

  
  public static String descifrar(String datosCifrados) throws Exception {
    Key llave = generarLlave();
    Cipher c = Cipher.getInstance(ALGORITMO);
    c.init(Cipher.DECRYPT_MODE, llave);
    byte[] valorDecodificado = DatatypeConverter.parseBase64Binary(datosCifrados);
    byte[] valDescifrado = c.doFinal(valorDecodificado);
    return new String(valDescifrado);
  }

  
  private static Key generarLlave() throws Exception {
    return new SecretKeySpec(valorLlave, ALGORITMO);
  }

  
  public static void main(String[] args) throws Exception {
      
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("*****   CIFRADO y DESCIFRADO  *****");
    System.out.print("Ingrese el mensaje que desea cifrar y descifrar: ");
    String mensajeOriginal = scanner.nextLine();
    System.out.println("Mensaje original: " + mensajeOriginal);

    String mensajeCifrado = cifrar(mensajeOriginal);
    System.out.println("Mensaje cifrado: " + mensajeCifrado);

    String mensajeDescifrado = descifrar(mensajeCifrado);
    System.out.println("Mensaje descifrado: " + mensajeDescifrado);
    scanner.close();
  }
  
  
}