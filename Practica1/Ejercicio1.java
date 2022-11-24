/*
 1- Analice el programa Ej01Tabla2.java, que carga un vector que representa la 
tabla del 2. Luego escriba las instrucciones necesarias para:
- generar enteros aleatorios hasta obtener el número 11. Para cada número 
muestre el resultado de multiplicarlo por 2 (accediendo al vector).
 */
package Practica1;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++) 
            tabla2[i]=2*i;
        System.out.println("2x" + "5" + "="+ tabla2[5]);
        
        GeneradorAleatorio.iniciar();
        int num =GeneradorAleatorio.generarInt(12);
        while(num != 11){
            System.out.println("resultado de multiplicar por 2 * " + num + " = " + tabla2[num]);
            num =GeneradorAleatorio.generarInt(12);
        }
    }
    
}
