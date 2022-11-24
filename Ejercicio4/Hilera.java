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
public class Hilera extends Coro {
    private int F;
    private int C;
    private int Fdiml = 0;
    private int Cdiml = 0;
    private Corista [][] matriz;

    public Hilera(int F, int C, String nombre, Director unDirector) {
        super(nombre, unDirector);
        this.F = F;
        this.C = C;
        this.matriz = new Corista [F][C];
    }

    public int getF() {
        return F;
    }

    public int getC() {
        return C;
    }

    public int getFdiml() {
        return Fdiml;
    }

    public int getCdiml() {
        return Cdiml;
    }
    
    
    public void agregarCorista(Corista unCorista){                          
          if (this.Cdiml < this.getC()) {
            this.matriz[this.Fdiml][this.Cdiml] = unCorista;
            this.Cdiml++;          
          }
    }
    
    @Override
    public boolean Lleno(){
        boolean aux = false;
        if((this.getFdiml() == this.getF()) && (this.getCdiml() == this.getC())) {
            aux = true;
        }
        return aux;
    }
    
    @Override
      public boolean Formado(){
        int mayor = 0;
        int mayor2 = 0;
        int max1 = -1;
        int max2 = -1;
        boolean aux = false;
        for (int i = 0; i < this.getFdiml(); i++) {          
            for (int j = 0; j < this.getCdiml(); j++) {
                if (this.matriz[i][j].getTonoFundamental() >  max2) {
                    max2 = this.matriz[i][j].getTonoFundamental();
                    mayor2++;
                }
                if(this.matriz[i][0].getTonoFundamental() > max1){
                max1 = this.matriz[i][0].getTonoFundamental();
                mayor++;
            }
            }
            
        }
        if(mayor == this.getFdiml()-1 && mayor2 == this.getCdiml()-1){
            aux = true;
        }
        return aux;
    }
      
      
    @Override
      public String toString(){
        String aux = super.toString();
          for (int i = 0; i < this.getFdiml(); i++) {
              for (int j = 0; j < this.getCdiml(); j++) {
                  aux = aux + this.matriz[i][j].toString();
              }
              
          }
        return aux;
    }
}
