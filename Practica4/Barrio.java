/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

/**
 *
 * @author Admin
 */
public class Barrio {
    private String nombre;
    private int DNI;
    private int edad;

    public Barrio(String nombre, int DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
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
    @Override
    public String toString(){
        return "Mi nombre es " + this.getNombre() + " mi DNI es " + this.getDNI() + " Mi edad es " + this.getEdad();
    }
}