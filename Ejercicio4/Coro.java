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
public abstract class Coro {
    private String nombre;
    private Director unDirector;

    public Coro(String nombre, Director unDirector) {
        this.nombre = nombre;
        this.unDirector = unDirector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract boolean Lleno();
    public abstract boolean Formado();
    
    @Override
    public String toString(){
        return "Nombre del Coro " + this.getNombre() + "Director " + unDirector.toString();
    }
}
