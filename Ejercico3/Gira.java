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
public class Gira extends Recital {
    private String nombre;   
    private Fecha fechaActual;
    private int fechas;
    private Fecha [] vector;
    private int pos = 0;

    public Gira(String nombre, int fechas, String nombreBanda, int temas) {
        super(nombreBanda, temas);
        this.nombre = nombre;
        this.fechas = fechas;
        this.vector = new Fecha [fechas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechas() {
        return fechas;
    }
     
    
    public void agregarFecha (Fecha unaFecha){
        for (int i = 0; i < this.getFechas(); i++) {
          this.vector[i] = unaFecha; 
          fechaActual = this.vector[i];
          pos = i;
        }
    }
    
    @Override
    public void Actuar() {
        System.out.println("Buenas noches " + fechaActual.getCiudad());
        super.Actuar();
        fechaActual = this.vector[pos++];
    }
    
    @Override
    public double calcularCosto(){
        return 30000 * this.getFechas();
    }
    
}
