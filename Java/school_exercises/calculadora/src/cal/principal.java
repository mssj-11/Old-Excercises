/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class principal {

    public static void main (String[] args){ //metodo principal
        
        int op=0, n1=0, n2=0; //op variables para el menu, n1 y n2 variables de los numeros
        String ax; //variable que recibe los numeros
        operaciones trin = new operaciones(); //objeto llamado trin de la clase operaciones para usar los metodos
        
        do{//comienzo del ciclo
            op = JOptionPane.showConfirmDialog(null,"Desea ingresar dos numeros y mostrar el resultado "
                    + "\nde las 4 operaciones basicas?");//cuadro de dialogo de tipo entrada
            if(op == JOptionPane.YES_OPTION){//si se selecciona SI hara lo que hay en el bloque
                ax = JOptionPane.showInputDialog(null, "Digite el primer numero: ");
                if(trin.isNum(ax)){//primera validacion
                    n1 = Integer.parseInt(ax);//n1 toma el valor convertido del anterior cuadro de dialogo
                    ax = JOptionPane.showInputDialog(null, "Digite el segundo numero: ");
                    
                    if(trin.isNum(ax)){//segunda validacion
                        n2 = Integer.parseInt(ax);//n2 toma le valor convertido del anterior cuadro de dialogo
                        JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+trin.suma(n1, n2)//se usa el metodo de suma de la clase operacioes
                                                   +"\nEl resultado de la resta es: "+trin.resta(n1, n2)//se usa el metodo de resta de la clase operaciones
                                                   +"\nEl resultado de la multiplicacion es: "+trin.multiplicacion(n1, n2)//se usa el metodo de multiplicacion de la clase operaciones
                                                   +"\nEl resultado de la division es: "+trin.division(n1, n2));//se usa el metodo de division de la clase operaciones
                    }//final segunda validacion
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese un numero","Advertencia !!!", JOptionPane.WARNING_MESSAGE);
                    }
                }  //final primera validacion
                else{//se muestra un mensaje y no se realiza las operaciones ya que el primer valor no es un numero
                    JOptionPane.showMessageDialog(null, "Ingrese un numero","Advertencia !!!", JOptionPane.WARNING_MESSAGE);
                }                     
            }//finaliza bloque
            
            else if(op == JOptionPane.NO_OPTION){//si se selecciona NO hara lo que hay en el bloque
                JOptionPane.showMessageDialog(null, "Si desea terminar la aplicacion elige Cancelar.","Advertencia !!!" ,JOptionPane.WARNING_MESSAGE);//mensaje de advertencia
            }//finaliza bloque
            
        }while(op!= JOptionPane.CANCEL_OPTION);//el ciclo finaliza cuando se da cancelar
        
        System.exit(0);//linea para asegurar la finalizacion del programa     
        
    }  //fin metodo principal  
} //fin de la clase
