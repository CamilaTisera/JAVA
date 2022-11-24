/*
 2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de 
básquet y las almacene en un vector. Luego informe: 
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
NOTA: Dispone de un esqueleto para este programa en Ej02Jugadores.java
 */
package Practica1;
import PaqueteLectura.Lector;
public class Ejercicio2 {
    public static void main(String[] args) {
        int DF = 15;
        double altura;
        double [] vector = new double [DF];
        double promedio;
        double suma = 0;
        int cantidad = 0;
        for (int i = 0; i < DF; i++) {
            System.out.println("Ingrese altura");
            altura = Lector.leerDouble();
            vector[i] = altura;
            suma = suma + vector[i];
        }
        promedio = suma / DF;
        System.out.println("La altura promedio es " + promedio);
        
        for (int i = 0; i < DF; i++) {
            if (vector[i] > promedio){
              cantidad++;
            }
        }
        System.out.println("La cantidad de alumnos por encima del promedio de edad es: " + cantidad);
    }
    
}