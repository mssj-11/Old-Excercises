/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONVERTID;

/**
 *
 * @author Daniel
 */
public class pueba {

    /* public void  D(int n, int base){
        int aux, cadena ; 
         
                String resul="" , cadenaF = "" ;
 do{ 
    aux = n; 
    
    cadena = n/base;
    int mod = (aux%base);
    
  cadenaF = cadenaF + mod; 
    n = cadena;
            }while(n!=0);
  
    
   
    
    for(int i = cadenaF.length()-1; i>=0; i -- ){
      
      resul = resul + cadenaF.charAt(i);
       
    }
    System.out.println(resul);
     
    
    
    }*/
    public void D(int n, int base) {
        int cifra, valor, i = 0, potencia = base, resultado = 0;
        do {

            if (i == 0) {
                potencia = 1;

            } else if (i == 1) {
                potencia = base;

            } else {
                potencia = potencia * base;
            }

            cifra = n % 10;

            if (cifra == 0) {
                valor = 0;
                i = i + 1;
            } else {

                valor = cifra * potencia;
                i = i + 1;

            }

            resultado = resultado + valor;

            n = n / 10;

        } while (n != 0);
        System.out.println(resultado);

    }

    public static void main(String[] args) {
        pueba A = new pueba();
        A.D(6600, 8);
    }
}
