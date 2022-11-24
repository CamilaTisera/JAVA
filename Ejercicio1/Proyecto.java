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
public class Proyecto {
    private String nombre;
    private int codigo;
    private String nombreDirector;
    private int DF = 50;
    private int DL = 0;
    private Investigador [] vector;

    public Proyecto(String nombre, int codigo, String nombreDirector) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nombreDirector = nombreDirector;
        this.vector = new Investigador [DF];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public int getDL() {
        return DL;
    }
    
    public void agregarInvestigador(Investigador unInvestigador){
        if(this.DL < this.DF){
            this.vector[this.DL] = unInvestigador;
        }
        this.DL++;
    }
    
     public double dineroTotalOtorgado(){
        double montoTotal = 0;
         for (int i = 0; i < this.getDL(); i++) {
             montoTotal = montoTotal + this.vector[i].montoSucidio();
                 
             }
         return montoTotal;
         }
     
     public  void otorgarTodos(String nombre_completo){
         for (int i = 0; i < this.getDL(); i++) {
             if(vector[i].getNombreCompleto().equals(nombre_completo)){
                 vector[i].otorgar();
             }
         }
     }
     
    @Override
     public String toString(){
         String aux = "Nombre del proyecto " + this.getNombre() + " Codigo " + this.getCodigo() + " Nombre del director " + this.nombreDirector + " Dinero otorgado para el proyecto "
                 + this.dineroTotalOtorgado();
         
         for (int i = 0; i < this.getDL(); i++) {
            aux = aux + vector[i];
        }
           
         return aux;
     }
    
     
    }
