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
public class Trabajador extends Barrio {
    private String tarea;

    public Trabajador(String tarea, String nombre, int DNI, int edad) {
        super(nombre, DNI, edad);
        this.tarea = tarea;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    @Override
    public String toString(){
        return super.toString() + " mi tarea es " + this.getTarea();
    }
}
