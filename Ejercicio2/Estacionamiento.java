/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Admin
 */
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private int horaApertura;
    private int horaCierre;
    private int piso;
    private int plaza;
    private Auto [][] matriz;

    public Estacionamiento(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = 8;
        this.horaCierre = 21;
        this.piso = 5;
        this.plaza = 10;
        this.matriz = new Auto [piso][plaza];
    }

    public Estacionamiento(String nombre, String direccion, int horaApertura, int horaCierre, int piso, int plaza) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.piso = piso;
        this.plaza = plaza;
        this.matriz = new Auto [piso][plaza];
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public int getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }
       

   public void agregarAuto (Auto unAuto, int N, int M){
       this.matriz[N][M] = unAuto;
   }
    
   public String buscarPatente (int unaPatente){
       String aux = "Auto inexistente";
       for (int i = 0; i < this.piso; i++) {
           for (int j = 0; j < this.plaza; j++) {
               if(this.matriz[i][j] != null && this.matriz[i][j].getPatente() == unaPatente){
                   aux = "Piso " + i + " Plaza " + j;
               }
           }
           
       }
       return aux;
   }
   
      
   public int cantidadPlazas (int y){
       int cantidad = 0;
       for (int i = 0; i < this.piso; i++) {
           if(this.matriz[i][y] != null){
               cantidad++;
           }
       }
       return cantidad;
       }
   
    @Override
   public String toString (){
        String aux = "";
        for (int i = 0; i < this.piso; i++) {
            for (int j = 0; j < this.plaza; j++) {
                if(this.matriz[i][j] == null){
                    aux = aux + "Piso " + i + " Plaza " + j + " Libre";
                }
                else{
                    aux = aux + "Piso " + i + " Plaza " + j + this.matriz[i][j].toString();
                }
                 
            }
            
        }
        return aux;
   }

       
   
    
    
    
}
