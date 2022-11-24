/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercico3;

/**
 *
 * @author Admin
 */
public abstract class Recital {
    private String nombreBanda;
    private int temas;
    private String [] vector;
    private int i = 0;

    public Recital(String nombreBanda, int temas) {
        this.nombreBanda = nombreBanda;
        this.temas = temas;
        this.vector = new String [temas];
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public int getTemas() {
        return temas;
    }

    public void setTemas(int temas) {
        this.temas = temas;
    }
    
   public void agregarTema (String unTema){
       if(i < this.getTemas()){
           this.vector[i] = unTema;
       }
       i++;
   } 
   
   public void Actuar (){
       System.out.println("Nombre de la banda " + this.getNombreBanda());
       for (int i = 0; i < this.getTemas(); i++) {
           System.out.println("Y ahora tocaremos " + this.vector[i]);
       }
   }
   
   public abstract double calcularCosto();
}
