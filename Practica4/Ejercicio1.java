/*
 1-A- Incluya la clase Triángulo a la jerarquía de figuras vista (carpeta tema4). Triángulo 
debe heredar de Figura todo lo que es común y definir su constructor y sus atributos y 
métodos propios. Además debe redefinir el método toString.
B- De igual manera, incluya la clase Círculo a la jerarquía de figuras.
C- Añada a la representación String el valor del perímetro. Piense ¿qué método toString
debe modificar: el de cada subclase o el de Figura?
D- Añada el método despintar que establece los colores de la figura a línea “negra” y 
relleno “blanco”. Piense ¿dónde debe definir el método: en cada subclase o en Figura?
E- Realizar un programa que instancie un triángulo y un círculo. Muestre en consola la
representación String de cada uno. Pruebe el funcionamiento del método despintar.
 */
package Practica4;

import PaqueteLectura.Lector;

/**
 *
 * @author Admin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese lado 1");
        double lado1 = Lector.leerDouble();
        System.out.println("Ingrese lado 2");
        double lado2 = Lector.leerDouble();
        System.out.println("Ingrese lado 3");
        double lado3 = Lector.leerDouble();
        System.out.println("Color Relleno");
        String relleno = Lector.leerString();
        System.out.println("Color Linea");
        String linea = Lector.leerString();
        
        Triangulo t = new Triangulo(lado1, lado2, lado3, relleno,linea);
        System.out.println("Area " + t.calcularArea());
        System.out.println("Perimetro " + t.calcularPerimetro());
        System.out.println(t.toString());
        t.Despintar();
        System.out.println(t.toString());
        
        
        System.out.println("Radio: ");
        double radio = Lector.leerDouble();
        System.out.println("Relleno: ");
        relleno = Lector.leerString();
        System.out.println("Linea: ");
        linea = Lector.leerString();
        
        Circulo c = new Circulo (radio, relleno, linea);
        System.out.println("Area " + c.calcularArea());
        System.out.println("Perimetro " + c.calcularPerimetro());
        System.out.println(c.toString());
        c.Despintar();
        System.out.println(c.toString());
    }
    
}
