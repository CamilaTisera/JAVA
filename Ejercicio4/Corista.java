/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Admin
 */
public class Corista {
    private String nombre;
    private int DNI;
    private int edad;
    private int tonoFundamental;

    public Corista(String nombre, int DNI, int edad, int tonoFundamental) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.tonoFundamental = tonoFundamental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTonoFundamental() {
        return tonoFundamental;
    }

    public void setTonoFundamental(int tonoFundamental) {
        this.tonoFundamental = tonoFundamental;
    }
    
    @Override
    public String toString (){
        return "Nombre " + this.getNombre() + " DNI " + this.getDNI() + " Edad " + this.getEdad() + " Tono fundamental " + this.getTonoFundamental();
    }
}
