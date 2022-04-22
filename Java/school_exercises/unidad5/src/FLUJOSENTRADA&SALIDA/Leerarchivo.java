
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CarlosAmbriz
 */
public class Leerarchivo {

    public void lee() {
        try {
            FileReader archivo = new FileReader("C:\\Users\\HP\\Desktop\\Programación\\hola.txt");
            BufferedReader a = new BufferedReader(archivo);
            //int c=0;
            String linea = "";
            while (linea != null) {
                /*while(c!=-1){
                  
                   c=archivo.read();
                   System.out.print(c);
                   System.out.print((char)c);
                 */
                linea = a.readLine();
                System.out.println(linea);
            }
            archivo.close();
        } catch (Exception ex) {
            System.err.println("Error en la lectura del archivo");
        }
    }

    public void escribe() {
        String frase = "michael";
        try {
            FileWriter escribe = new FileWriter("C:\\Users\\HP\\Desktop\\Programación\\hola1.txt");
            BufferedWriter a = new BufferedWriter(escribe);
            for (int i=0; i<frase.length(); i++){
                escribe.write(frase.charAt(i));
            }
            //escribe.write(frase);

            //a.write(frase);
            a.close();
            escribe.close();
        } catch (Exception e) {
            System.err.println("Error en la escritura del archivo" + e);
        }

    }

    public static void main(String[] args) {
        Leerarchivo a1 = new Leerarchivo();

        //a1.lee();
        a1.escribe();

    }

}
