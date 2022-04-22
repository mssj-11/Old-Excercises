/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class Menu_lista {
    public static void main(String [] args){
       Control_cola id=new Control_cola();
       Scanner teclado= new Scanner (System.in);
       String nombre;
       boolean encontrado;
       
        int salir=1;
       do{
       int j;
       Scanner u=new Scanner (System.in);
           System.err.println("\nMenu lista doble");
           System.err.println("1) Insertar al inicio");
           System.err.println("2) Insertar al final");
           System.err.println("3) Mostar ascendente");
           System.err.println("4) Mostrar descendente");
           System.err.println("5) Extraer elemento al inicio");
           System.err.println("6) Extraer elemento al final");
           System.err.println("7) Buscar elemento dentro de la lista");
           System.err.println("8) Salir");
           System.err.println("Ingrese una opcion:  ");
           j=u.nextInt();
           
           switch(j){
               case 1:
                   System.err.println("Ingrese el nombre: ");
                   nombre=teclado.nextLine();
                   id.insertarInicio(nombre);
                   break;
               case 2: 
                   System.err.println("Ingrese nombre: ");
                   nombre=teclado.nextLine();
                   id.insertarFin(nombre);
                   
               break;
               case 3:
                   id.mostrarAscendente();
               break;
               case 4:
                   id.mostarDescendente();;
               break;
                 case 5:
                     id.extraerInicio();
               break;
               case 6:
                   id.extraerFin();
               break;
               case 7:
                   System.err.println("Elemento a buscar: ");
                   nombre=teclado.nextLine();
                   id.buscar(nombre);
                   if(id.buscar(nombre)==true)  System.out.println("Elemento encontrado");
                   else System.out.println("No se encontro el elemento");
                   
               break;
               case 8:
                   salir=2;
               break;
               default:
                   System.out.println("Opcion incorrecta");
               
               
                 
                   
           }
           
           
           
           
       }while (salir==1);
       
       
      
    }
    
}
