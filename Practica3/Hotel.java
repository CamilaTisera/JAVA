/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author Admin
 */
public class Hotel {
    private int N;
    private Habitacion [] vector;  


    public Hotel(int N) {
        this.N = N;
        this.vector = new Habitacion [N];
        GeneradorAleatorio.iniciar();
        for (int i = 0; i < N; i++) {
            this.vector[i] = new Habitacion(GeneradorAleatorio.generarDouble(8000));
        }
    }

    public int getN() {
        return N;
    }
     public void agregarCliente (Cliente unCliente, int x){
       this.vector[x].setUnCliente(unCliente);
       this.vector[x].setOcupada(true);
    }
     
    // - Aumentar el precio de todas las habitaciones en un monto recibido.
    public void aumentar (double monto){
        for (int i = 0; i < N; i++) {
            double aux = vector[i].getCosto() + monto;
            vector[i].setCosto(aux);
        }
        }
    
    //- Obtener la representación String del hotel, siguiendo el formato: {Habitación 1: costo, libre u ocupada, información del cliente si está ocupada} 
    //…{Habitación N: costo, libre u ocupada, información del cliente si está ocupada}
    @Override
    public String toString (){
        String aux = "";
        for (int i = 0; i < this.getN(); i++) {
            if(this.vector[i].isOcupada() == false){
                 aux = aux  +  "Habitacion: " + i + " Costo " + this.vector[i].getCosto() + " Ocupada? " +  this.vector[i].isOcupada();
               }  
            else{
                 aux = aux +  "Habitacion: " + i + " Costo " + this.vector[i].getCosto() + " Ocupada? " +  this.vector[i].isOcupada() + this.vector[i].toString();
            }
           
        }
        return aux;
        }
                  
}