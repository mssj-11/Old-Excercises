
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Contacto {

    public String Indice;
    public String Nombre;
    public String Direccion;
    public String Telefono;

    public void Escritura() {

        String Usuario;
        Scanner Scan = new Scanner(System.in);

        PrintWriter Escribir;
        File arch = new File("usuario.txt");

        if (!arch.exists()) {

            try {
                arch.createNewFile();
                System.out.println("El archivo se llama: " + arch);

            } catch (IOException e) {

            }
        } else {
        }
    }

    public void Escritura2() {

        FileWriter Escribirt;
        PrintWriter linea;

        File archt = new File("Agenda.txt");
        String nuev = null;
        do {

            try {

                Scanner Scan = new Scanner(System.in);
                Scanner Scan2 = new Scanner(System.in);
                Scanner Scan3 = new Scanner(System.in);

                System.out.println("¿Cual Es Su Nombre? ");
                this.Nombre = Scan.nextLine();
                System.out.println("¿Cual Es Su Numero De Telefono? ");
                this.Telefono = Scan2.nextLine();
                System.out.println("¿Cual Es Su Direccion? ");
                this.Direccion = Scan3.nextLine();
                String cd = "";

                Escribirt = new FileWriter(archt, true);
                linea = new PrintWriter(Escribirt);

                linea.println("Nombre: " + Nombre);
                linea.println("Telefono: " + Telefono);
                linea.println("Direccion: " + Direccion);
                linea.println(cd);

                linea.close();
                Escribirt.close();

            } catch (IOException e) {

            }
            Scanner dd = new Scanner(System.in);

            System.out.println("");
            System.out.println("¿Quieres Agregar Un Nuevo Contacto?");
            System.out.println("");
            System.out.println("1.-) Si");
            System.out.println("2.-) No");
            nuev = dd.nextLine();

        } while ("1".equals(nuev));

    }

    public void Lectura2() {

        String cadena;

        try {

            File arch = new File("Agenda.txt");

            FileReader leer = new FileReader(arch);

            BufferedReader alm = new BufferedReader(leer);

            cadena = "";

            while (cadena != null) {

                try {

                    cadena = alm.readLine();

                    if (cadena != null) {

                        System.out.println(cadena);

                    }

                } catch (IOException e) {

                }

            }

            try {

                alm.close();

                leer.close();

            } catch (IOException e) {
            }

        } catch (FileNotFoundException e) {

        }

    }

    public void Borrar() {

        String Usuario;
        Scanner Scan = new Scanner(System.in);

        PrintWriter Escribir;

        File arch = new File("Agenda.txt");

        if (!arch.exists()) {

        } else {

            try {

                Usuario = "";
                Escribir = new PrintWriter(arch, "utf-8");
                Escribir.println(Usuario);
                Escribir.close();

                System.out.println("Archivos borrados");

            } catch (IOException e) {

            }

        }

    }

    public static void main(String[] args) {

        Contacto cnto = new Contacto();

        cnto.Escritura();

    }

}

