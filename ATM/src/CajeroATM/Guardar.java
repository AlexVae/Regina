/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroATM;

import java.util.HashMap;

/**
 *
 * @author alexcastaneda
 */
public class Guardar {
    HashMap guardar;
    public Guardar(){
        guardar= new HashMap();
    }
    public void guardar(Tarjeta t){
        String nT= t.getnTarjeta();
        guardar.put(nT, t);
    }
    public HashMap getGuardar() {
        return guardar;
    }

    public void setGuardar(HashMap guardar) {
        this.guardar = guardar;
    }
}
