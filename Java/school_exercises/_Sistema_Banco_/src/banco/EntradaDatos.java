package banco;

import java.util.Scanner;

public class EntradaDatos {
    private Scanner entrada;

    EntradaDatos(){
        this.entrada = new Scanner(System.in);
    }

    public int entero(String mensaje){
        boolean control = false;
        int entero = -1;
        while(!control){
            try{
                System.out.print(" " + mensaje + " ");
                entero = Integer.parseInt(this.entrada.nextLine().trim().replace(" ", ""));
                control = true;
            }catch (Exception e) {
                System.out.println("\t----> No es un int valido.");
            }
        }
        return entero;
    }

    public String cadena(String mensaje){
        System.out.print(" " + mensaje + " ");
        String cadena = this.entrada.nextLine().trim().replace(" ", "");
        return cadena;
    }

    public double doble(String mensaje){
        boolean control = false;
        double doble = -1.0;
        while(!control){
            try{
                System.out.print(" " + mensaje + " ");
                doble = Double.parseDouble(this.entrada.nextLine().trim().replace(" ", ""));
                control = true;
            }catch (Exception e) {
                System.out.println("\t----> No es un double valido.");
            }
        }
        return doble;
    }
}