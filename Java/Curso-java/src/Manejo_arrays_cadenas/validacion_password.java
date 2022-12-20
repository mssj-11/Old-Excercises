//    Ejemplo 5: Validacion de contraseñas - 10-20 caracteres y contenga alguno de los sig. caracteres [*, -, _]
package Manejo_arrays_cadenas;

import java.util.Scanner;

public class validacion_password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la contraseña a validar: ");
        String password = sc.nextLine();
        
        if(password.length() >= 10 && password.length() <= 20){
            
            boolean validacion = false;
                
            for(int i=0; i<password.length(); i++){
                if(password.charAt(i) == '*' || password.charAt(i) == '-' || password.charAt(i) == '_' ){
                    validacion = true;
                }
            }
            
            
            if(validacion){
                System.out.println("La contraseña es valida :)");
            }
            else{
                System.out.println("La contraseña no contiene los caracteres");
            }
            
            
        }
        else{
            System.out.println("La contraseña no es valida");
        }
        
        
        
    }
}