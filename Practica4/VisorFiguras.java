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
class VisorFiguras {
     private int guardadas;
     private int DF = 5;
     private Figura [] vector;

    public VisorFiguras() {
        this.guardadas = 0;
        this.vector = new Figura [DF];
    }

    public int getGuardadas() {
        return guardadas;
    }
    public void GuardarFigura (Figura unaFigura){
        if(this.guardadas < this.DF){
            this.vector[this.getGuardadas()] = unaFigura;
        }
       this.guardadas++;
    }
    public boolean quedaEspacio (){
        boolean espacio = false;
        if(this.getGuardadas() != this.DF){
            espacio =  true;
        }
         return espacio;
    }
    
    public void mostrar(){
        for (int i = 0; i < this.getGuardadas(); i++) {
            System.out.println(this.vector[i]);
            
        }
    }
    
          
     
 
    }
