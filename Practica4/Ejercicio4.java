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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            VisorFiguras v = new VisorFiguras();
    
            Circulo c1 = new Circulo(10,"Violeta","Rosa");
            Triangulo t= new Triangulo(20,10,5,"Azul","Celeste");
            v.GuardarFigura(c1);
            v.GuardarFigura(t);
            System.out.println(v.quedaEspacio());
            v.mostrar();
            c1.Despintar();
} 
}

