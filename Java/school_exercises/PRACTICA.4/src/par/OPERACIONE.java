package par;
import java.util.Scanner; // libreria para poder capturar datos 


public class OPERACIONE { // llave de incio de la clase
    public static void main (String [] args){ // llave de inicio del main principal 
        Scanner dt = new Scanner(System.in);
        String operacion; // variable que contendra toda la operacion a realizar
        String snum1 = "",snum2= ""; // varibles donde se guardaran los numero pero en String
        int num1,num2; // variable donde se guardaran los numeros 
        char op='*'; // variable que guarda el simbolo de la operacion
        int bandera = 0; // varible que sirve de ayuda para saber en donde guardar los numeros 
        
        System.out.print("Escribe una operacon: ");
        operacion = dt.nextLine();
        
        for (int i = 0 ; i < operacion.length() ; i++) {
            if (operacion.charAt(i) != '-' && operacion.charAt(i) != '+' && operacion.charAt(i) != 'x' && operacion.charAt(i) != '/' ) {
                // compruba si el caracter no es un simbolo
                if(bandera == 0){ // comprueba en que variable se va a guardar 
                    snum1 = snum1 + operacion.charAt(i);
                }else{
                    snum2 = snum2 + operacion.charAt(i);
                }
            }else{
                op = operacion.charAt(i); // guarda el simbolo de la operacion 
                bandera = 1; // cambia el valor de la bandera 
            }
        }
        //System.out.println(snum1+" - "+op+" - "+snum2 ); // esta linea solo sirvio para comprobar que se sacaran los datos de manera
        // correcta
        
        num1 = Integer.parseInt(snum1); // convierte el num1 de string a int 
        num2 = Integer.parseInt(snum2); // convierte el num2 de string a int 
        
        switch (op){// incio del switch
            // dependiendo del signo realiza la operacion pertinente
            case '+':
                System.out.println(num1+num2);
            break;
            case '-':
                System.out.println(num1-num2);
            break;
            case 'x':
                System.out.println(num1*num2);
            break;
            case '/':
                System.out.println(num1/num2);
            break;
            
        }// llave de cierre del swicth
        
    }// llave de cierre del main principal 
    
}  // llave de cierre de la clase 

