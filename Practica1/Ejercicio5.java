/*
 5- El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen 
(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad 
de la comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes 
para cada uno de los aspectos y almacene la información en una estructura. Luego 
imprima la calificación promedio obtenida por cada aspecto
 */
package Practica1;

import PaqueteLectura.Lector;

public class Ejercicio5 {

    public static void main(String[] args) {
        int F = 4;
        int C = 5;
        int DF = 4;
        int [][] matriz = new int [F][C];
        int [] vector = new int [DF];
        int suma = 0;
        double promedio;
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                System.out.println("Ingrese puntaje del aspecto " + i + " el cliente " + j);
                int puntaje = Lector.leerInt();
                suma += puntaje;
            }
            promedio = (double) suma / 5;
            System.out.println("El promedio del aspecto " + i + " es " + promedio);
        }
        
    }
    
}