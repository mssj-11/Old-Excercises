/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encriptacion_j;

import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author HP
 */
public class JavaEnc {
    
    File archivo = new File("Texto.txt");
    
    public JavaEnc() {
        
        crearArchivo();
        
    }
    
    private void crearArchivo() {
        try {
            if (archivo.exists()) {
                
            } else {
                archivo.createNewFile();
            }
        } catch (Exception e) {
            
        }
    }

    //METODOS
    //encritar
    public void encriptar(Texto text) {
        
        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(archivo));
            escribir.writeObject(text);
            escribir.close();
        } catch (Exception e) {
            
        }
    }
    
    
        //desencritar
    public Texto desencriptar() {
        
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(archivo));
            Texto oTexto=(Texto)leer.readObject();
            leer.close();
            return oTexto;
        } catch (Exception e) {
            return null;
        }
    }
    
    

    public static void main(String[] args) {
//        System.out.println("El mensaje Encriptado es: ");
//        new JavaEnc().encriptar(new Texto("Michael"));
        System.out.println("El mensaje Desencriptado es: " + new JavaEnc().desencriptar().getPalabra());
    }
}
