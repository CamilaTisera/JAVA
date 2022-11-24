/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;


/**
 *
 * @author Admin
 */
public class Habitacion {
    private double costo;
    private boolean ocupada;
    private Cliente unCliente;
    

    public Habitacion(double costo) {
        this.costo = costo;
        this.ocupada = false;
        }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }


    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
  
    @Override
    public String toString (){

            return  "Costo: " + this.getCosto() + " Libre o Ocupada: " + this.isOcupada() +  " Cliente: " + unCliente.toString() ;
        
}
}    
