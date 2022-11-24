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
public class Entrenador extends Empleado{
    private int campeonatosGanador;

    public Entrenador(int campeonatosGanador, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.campeonatosGanador = campeonatosGanador;
    }

    public int getCampeonatosGanador() {
        return campeonatosGanador;
    }

    public void setCampeonatosGanador(int campeonatosGanador) {
        this.campeonatosGanador = campeonatosGanador;
    }
    
    
    @Override
    public double calcularEfectividad (){
        double promedio = this.getCampeonatosGanador() / super.getAntiguedad();
        return promedio;
    }
    
    @Override
    public double calcularSueldoACobrar(){
        double sueldoActual = 0;
        double adicional = super.getSueldoBasico() * 0.10;
        double sueldo = super.getSueldoBasico() + (adicional * super.getAntiguedad());
        if(this.getCampeonatosGanador() >= 1 && this.getCampeonatosGanador() <= 4){
            return sueldo + 5000;
        }
        else
            if(this.getCampeonatosGanador() >= 5 && this.getCampeonatosGanador() <= 10){
                return sueldo + 30000;
            } 
            else{
                if(this.getCampeonatosGanador() > 10){
                    return sueldo + 50000;
                }
                else{
                    return sueldo;
                }
            }
    }
    
}
