/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MISEJERCICIOS.HERENCIA;

/**
 *
 * @author HP
 */
public class Cuenta {
    private int n_cuenta;
    private int n_cliente;
    private String tipo;
    private double saldo;

    public Cuenta(int n_cuenta, int n_cliente, String tipo, double saldo) {
        this.n_cuenta = n_cuenta;
        this.n_cliente = n_cliente;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public Cuenta() {
        this.n_cuenta = 0;
        this.n_cliente = 0;
        this.tipo = "cheque";
        this.saldo = 1000.00;  
    }
    
    public void imprimir (){
        System.out.println ("el numero de cuenta es:"+this.getN_cuenta()+"el numero de cliente"+this.getN_cliente()+"el tipo es"+this.getTipo()+"el sañldo es"+this.getSaldo());
        
    }

    /**
     * @return the n_cuenta
     */
    public int getN_cuenta() {
        return n_cuenta;
    }

    /**
     * @param n_cuenta the n_cuenta to set
     */
    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    /**
     * @return the n_cliente
     */
    public int getN_cliente() {
        return n_cliente;
    }

    /**
     * @param n_cliente the n_cliente to set
     */
    public void setN_cliente(int n_cliente) {
        this.n_cliente = n_cliente;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
