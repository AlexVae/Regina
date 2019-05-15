/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajeroATM;

/**
 *
 * @author alexcastaneda
 */
public class Gasto {
    private String nombre; 
    private double cantidad; 
    public Gasto(String n, double c){
        this.nombre=n;
        this.cantidad=c; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
