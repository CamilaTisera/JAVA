/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Admin
 */
public class Auto {
  private String nombre;
  private int patente;

    public Auto(String nombre, int patente) {
        this.nombre = nombre;
        this.patente = patente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }  
  
  @Override
    public String toString(){
        return " Nombre " + this.getNombre() + " Patente " + this.getPatente();
    }
}
