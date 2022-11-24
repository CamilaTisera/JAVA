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
public class Semicircular extends Coro{
    private int DF;
    private int DL = 0;
    private Corista [] vector;

    public Semicircular(int DF, String nombre, Director unDirector) {
        super(nombre, unDirector);
        this.DF = DF;
        this.vector = new Corista [DF];
    }

    public int getDF() {
        return DF;
    }

    public int getDL() {
        return DL;
    }
    
    public void agregarCorista(Corista unCorista){
        if (this.DL < this.getDF()) {
            this.vector[this.DL] = unCorista;
        }
        this.DL++;
    }
    
    @Override
    public boolean Lleno(){
        boolean aux = false;
        if(this.getDL() == this.getDF()){
            aux = true;
        }
        return aux;
    }
    
    @Override
    public boolean Formado(){
        int mayor = 0;
        boolean aux = false;
        int max = -1;
        for (int i = 0; i < this.getDL(); i++) {
                if(this.vector[i].getTonoFundamental() > max){
                  max = this.vector[i].getTonoFundamental();
                  mayor++;
            }
        }
        if(mayor == this.getDL()-1){
            aux = true; 
        }
        return aux;
    }
    @Override
    public String toString(){
        String aux = super.toString();
        for (int i = 0; i < this.getDL(); i++) {
            aux = aux + "Posicion " + i +this.vector[i].toString();
        }
        return aux;
    }
    
}
