/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroATM;

import java.io.Serializable;

/**
 *
 * @author Eduardo
 abstract 
 */
public class Cuenta implements Serializable{
    protected String cuenta;
    protected double saldo;

    public Cuenta() {
    }

    public Cuenta(String cuenta, double saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

   // public abstract double ejecutar();
    
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cuenta=" + cuenta + ", saldo=" + saldo + '}';
    }
    
    
}
