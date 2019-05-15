/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroATM;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author alexcastaneda
 */
public class Cajero {
      Guardar guardar;
      HashMap g;
    private Cuenta c,c1;
    private Tarjeta t;
    public Cajero(Tarjeta tt,Cuenta cc){
        /*c= new Cuenta(numeroC, dinero); 
        t= new Tarjeta(tipo,nT,nombre,banco,c.getSaldo(),c,c.getCuenta(),clave);
       String numeroC,String tipo,String nombre, String banco,String nombreC,double dinero,String nT,String clave*/
       
        this.t=tt;
        this.c=cc;
//        g=guardar.getGuardar();
        /*
          this.tipo=tt;
       this.nTarjeta=a;
       this.dueñoTarjeta=b;
       this.bancoTarjeta=c; 
       this.cantidadDinero=d;
       this.cuenta=e;
       this.numeroC=numero;
        */
    }

    public Guardar getGuardar() {
        return guardar;
    }

    public void setGuardar(Guardar guardar) {
        this.guardar = guardar;
    }
    
    public void PagoServicios(String nServicio,double c){
        Gasto g= new Gasto(nServicio,c);
        double cantidad=t.getCantidadDinero();
        double gas=g.getCantidad();
        double resultado=cantidad-gas; 
        this.t.setCantidadDinero(resultado);
        this.t.guardaGasto(g);
        double deuda=this.CalcularDeuda();
        if("Credito".equals(t.getTipo())){
            t.setDeuda(deuda+t.getDeuda());
        }else{
          t.setDeuda(0);
        }
        
    }
    public void retirarDinero(double retiro){
     Gasto gg= new Gasto("Retiro",retiro);
     double cantidad=t.getCantidadDinero();
     double resultado=cantidad-retiro;
     this.t.setCantidadDinero(resultado);
     this.t.guardaGasto(gg);
    }
    public void PagarTarjeta(double CantidadPago){
       double deuda=this.getT().getDeuda();
        if(deuda==0){
            
        }
        else{
        Tarjeta tt= this.getT();
     
       if(CantidadPago==deuda){
          tt.setDeuda(0);
          this.setT(tt);
       }else{
          deuda=deuda-CantidadPago;
          tt.setDeuda(deuda);
          this.setT(tt);
       }
    }
    }    
    public void depositos(double cantidad, String nT){
       
      Tarjeta auxiliar=(Tarjeta) g.get(nT);
      Cuenta original=t.getCuenta();
      double cantidadDinero=auxiliar.getCantidadDinero()+cantidad;
      auxiliar.setCantidadDinero(cantidadDinero);
      this.g.put(auxiliar.getnTarjeta(), auxiliar);
      double gastar=t.getCantidadDinero()-cantidad;
      t.setCantidadDinero(gastar);
      Gasto gg= new Gasto("Deposito",cantidad);
      guardar.setGuardar(g);
    }
  public double CalcularDeuda(){
       Tarjeta tt= this.getT();
       double deuda=0;
       ArrayList aux=tt.getGastos();
       for(int i=0;i<aux.size();i++){
          Gasto g= (Gasto) aux.get(i);
          deuda=deuda+g.getCantidad();
       }
       return deuda;
  }
    public Tarjeta getT() {
        return t;
    }

    public void setT(Tarjeta t) {
        this.t = t;
    }

    public Cuenta getC() {
        return c;
    }

    public void setC(Cuenta c) {
        this.c = c;
    }
    
    
    
}
