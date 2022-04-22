/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author hp
 */
public class Elemento {
    Elemento adelante;
   String nombre;
   String edad;
   String direccion;
   String email;
   String telefono;
   Elemento atras;

    public Elemento(Elemento adelante, String nombre, String edad, String direccion, String email,String telefono, Elemento atras) {
        this.adelante = adelante;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.email = email;
        this.telefono=telefono;
        this.atras = atras;
    }
   
   
  

    /**
     * @return the adelante
     */
   Elemento getAdelante() {
        return adelante;
    }

    /**
     * @param adelante the adelante to set
     */
    void setAdelante(Elemento adelante) {
        this.adelante = adelante;
    }

    /**
     * @return the nombre
     */
    String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the email
     */
    String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the atras
     */
    Elemento getAtras() {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    void setAtras(Elemento atras) {
        this.atras = atras;
    }

    /**
     * @return the telefono
     */
    String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
   

}
