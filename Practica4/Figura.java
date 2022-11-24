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
public abstract class Figura {
    private String relleno;
    private String linea;

    public Figura(String relleno, String linea) {
        this.relleno = relleno;
        this.linea = linea;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    public void Despintar(){
        this.setLinea("Negro");
        this.setRelleno("Blanco");
    }
    @Override
    public String toString(){
        return "Color de relleno " + this.getRelleno() + " Color de Linea " + this.getLinea() + " Perimetro " + this.calcularPerimetro();
    }
    
    public abstract double  calcularPerimetro();
    public abstract double  calcularArea();
}
