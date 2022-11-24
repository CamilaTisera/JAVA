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
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, String relleno, String linea) {
        super(relleno, linea);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
        public double calcularPerimetro(){
        return 2 *Math.PI * radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * (radio * radio);
    }
    @Override
    public String toString (){
        return super.toString() + " Radio " + this.getRadio();
    }
    
}
