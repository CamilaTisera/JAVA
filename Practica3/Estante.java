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
public class Estante {
    private int DF;
    private int DL;
    private Libro [] vector;

    public Estante() {
        this.DF = 20;
        this.DL = 0;
        this.vector = new Libro [DF];
        for (int i = 0; i < DF; i++) {
            vector[i] = null;
        }
    }

    public int getDL() {
        return DL;
    }

    public void setDL(int DL) {
        this.DL = DL;
    }
    
    public boolean Lleno (){ 
        return (this.getDL() == this.DF);
    }
    public void agregarLibro (Libro unLibro){
        if(this.DL < this.DF){
            vector[this.DL] = unLibro;           
        }
        this.DL++;
    }
    public Autor buscarLibro (String unTitulo){
        Autor aux = null;
        int i = 0;
        while (vector[i].getTitulo().equals(unTitulo) && i < this.getDL()) {          
            if(vector[i].getTitulo().equals(unTitulo)){
                 aux = vector[i].getPrimerAutor();
                }
             i++;
        }
        return aux;
    }
    
    
}
