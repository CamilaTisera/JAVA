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
public class Jugador extends Empleado {
    private int partidosJugados;
    private int golesAnotados;

    public Jugador(int partidosJugados, int golesAnotados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.partidosJugados = partidosJugados;
        this.golesAnotados = golesAnotados;
    }


    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }
    
    @Override
    public double calcularEfectividad (){
        double promedio = this.golesAnotados / this.partidosJugados;
        return promedio;
    }
    @Override
    public double calcularSueldoACobrar(){
        double sueldoActual = 0;
        double adicional = super.getSueldoBasico() * 0.10;
        double sueldo = super.getSueldoBasico() + (adicional * super.getAntiguedad());
        if(this.calcularEfectividad() > 0.5) {
             return sueldoActual =  sueldo + super.getSueldoBasico();
        }
        else{
            return sueldo;
        }
    }
}
