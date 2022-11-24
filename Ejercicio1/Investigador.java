/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Admin
 */
public class Investigador {
    private String nombreCompleto;
    private int categoria;
    private String especialidad;
    private int DF = 5;
    private int DL = 0;
    private Subsidio [] vector;

    public Investigador(String nombreCompleto, int categoria, String especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.vector = new Subsidio [DF];
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getDL() {
        return DL;
    }
    
    public  void agregarSubsidio(Subsidio unSubsidio){
         if(this.DL < this.DF){
            this.vector[this.DL] = unSubsidio;
            this.vector[this.DL].setOtorgado(true);
        }
         this.DL++;
    }
    
    public double montoSucidio (){
        double montoTotal = 0;
        for (int i = 0; i < this.getDL(); i++) {
            if(this.vector[i].isOtorgado()==true){
                montoTotal = montoTotal + this.vector[i].getMontoPedido();
            }
        }
        return montoTotal;
    }
    public  void otorgar(){     
        for (int i = 0; i < this.DF; i++) {
           if(vector[i].isOtorgado() == false){
               vector[i].setOtorgado(true);
           }
        }
    }
    
    @Override
    public String toString(){
        return "Nombre " + this.getNombreCompleto() + " Categoria " + this.getCategoria() + " Especialidad " + this.getEspecialidad() +
                " Dinero del subsidio " + this.montoSucidio();
    }
    
    
}
