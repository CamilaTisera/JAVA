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
public class Evento extends Recital{
    private String motivo;
    private String nombreContratante;
    private int dia;

    public Evento(String motivo, String nombreContratante, int dia, String nombreBanda, int temas) {
        super(nombreBanda, temas);
        this.motivo = motivo;
        this.nombreContratante = nombreContratante;
        this.dia = dia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNombreContratante() {
        return nombreContratante;
    }

    public void setNombreContratante(String nombreContratante) {
        this.nombreContratante = nombreContratante;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    @Override
    public void Actuar(){
        if("Show beneficio".equals(this.getMotivo())){
            System.out.println("Recuerden colaborar con " + this.getNombreContratante());
        }
        else
            if("Show de TV".equals(this.getMotivo())){
                System.out.println("Saludos amigos televidentes");
            }
            else{
                System.out.println("Un feliz cumpleaños para " + this.getNombreContratante());
            }
        super.Actuar();
    }
    
    @Override
    public double calcularCosto (){
        int costo = 0;
        if("Show beneficio".equals(this.getMotivo())){
            costo = 0;
        }
        else
            if("Show de TV".equals(this.getMotivo())){
                costo = 50000;
            }
            else{
                costo = 150000;
            }
        return costo;
    }
    
}
