/*
 4- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
(1..4). Realice un programa que permita informar la cantidad de personas que 
concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al 
edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de 
oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro. 
de piso 9. Al finalizar la llegada de personas, informe lo pedido
 */
package Practica1;

import PaqueteLectura.Lector;

public class Ejercicio4 {

    public static void main(String[] args) {
        int F = 8;
        int C = 4;
        int [][] matriz = new int [F][C];
        
        int cant = 0;
        System.out.println("Ingrese oficina");
        int oficina = Lector.leerInt();
        System.out.println("Ingrese piso");
        int piso = Lector.leerInt();
        while(piso != 9){
            matriz[piso][oficina] += 1;
            System.out.println("Ingrese oficina");
            oficina = Lector.leerInt();
            System.out.println("Ingrese piso");
            piso = Lector.leerInt();
        }
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                System.out.println("La cantidad de personas que concurrieron en el piso " + i + " y la oficina " + j + " es " + matriz[i][j]);
            }
            
        }
    }
    
}