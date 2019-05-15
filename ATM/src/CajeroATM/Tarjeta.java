/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroATM;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author alexcastaneda
 */
public class Tarjeta implements Serializable {
   private ArrayList gastos;
   private String tipo;
   private String numeroC;
   private String nTarjeta; 
   private String dueñoTarjeta;
   private String bancoTarjeta;
   private double cantidadDinero;
   private Cuenta cuenta; 
   private String clave;
   private double deuda;
    public Tarjeta(String tt,String a, String b, String c, double d,Cuenta e,String numero,String clave, double dd){
       this.tipo=tt;
       this.nTarjeta=a;
       this.dueñoTarjeta=b;
       this.bancoTarjeta=c; 
       this.cantidadDinero=d;
       this.cuenta=e;
       this.numeroC=numero;
       gastos= new ArrayList();
       this.clave=clave;
       this.deuda=dd;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void PagoServicios(String h,double d){
        
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getnTarjeta() {
        return nTarjeta;
    }

    public void setnTarjeta(String nTarjeta) {
        this.nTarjeta = nTarjeta;
    }

    public String getDueñoTarjeta() {
        return dueñoTarjeta;
    }

    public void setDueñoTarjeta(String dueñoTarjeta) {
        this.dueñoTarjeta = dueñoTarjeta;
    }

    public String getBancoTarjeta() {
        return bancoTarjeta;
    }

    public void setBancoTarjeta(String bancoTarjeta) {
        this.bancoTarjeta = bancoTarjeta;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }
     public void guardaGasto(Gasto a){
        this.gastos.add(a);
    }

    public ArrayList getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList gastos) {
        this.gastos = gastos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }
    
}
