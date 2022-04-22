/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO;

/**
 *
 * @author HP
 */
public class Control_Cola {
    
    private Nodo primero;
    private Nodo ultimo;
    
    public Control_Cola() {
        
        primero = null;
        ultimo = null;
        
    }
    
    public void insertarInicio(String nombre) {
        if (primero == null) {
            primero = new Nodo(null, nombre, null);
            ultimo = primero;
            
        } else {
            Nodo nuevo = new Nodo(null, nombre, primero);
            primero.setAdelante(nuevo);
            primero = nuevo;
            
        }
        
    }
    
    public void insertarFin(String nombre) {
        if (primero == null) {
            
            ultimo = new Nodo(null, nombre, null);
            primero = ultimo;
            
        } else {
            Nodo nuevo = new Nodo(ultimo, nombre, null);
            ultimo.setAtras(nuevo);
            ultimo = nuevo;
            
        }
        
    }
    
    public String extraerInicio() {
        
        String nombre = primero.getNombre();
        primero = primero.getAtras();
        if (primero!= null) {
            
            ultimo.setAdelante(null);
        } else {
            ultimo = null;
            
        }
        return nombre;
    }
    
    public String extraerUltimo() {
        
        String nombre = ultimo.getNombre();
        ultimo = ultimo.getAdelante();
        if (ultimo!= null) {
            ultimo.setAtras(null);
            
        } else {
            primero = null;
        }
        return nombre;
    }
    
    public void muestraAscendente() {
        
        Nodo aux = primero;
        while (aux!= null) {
            System.out.println(aux.getNombre());
            aux = aux.getAtras();
            
        }
        
    }
    
    public void muestraDescendente() {
        
        Nodo aux = ultimo;
        while (aux!= null) {
            System.out.println(aux.getNombre());
            aux = aux.getAdelante();
        }
    }
    
    public boolean buscarElemento(String nombre) {
        
        Nodo aux = primero;
        while (aux!= null) {
            if (aux.getNombre().equals(nombre)) {
                return true;
            }
            
            aux = aux.getAtras();
        }
        return false;
    }
    
}