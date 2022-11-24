/*
 3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice 
la matriz con números aleatorios entre 0 y 30. 
Luego realice las siguientes operaciones: 
- Mostrar el contenido de la matriz en consola. 
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma 
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de 
encontrarse indique su ubicación (fila y columna) en caso contrario 
imprima “No se encontró el elemento”.
NOTA: Dispone de un esqueleto para este programa en Ej03Matrices.java
 */
package Practica1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ejercicio3 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int F = 5;
        int C = 5;
        int [][] matriz = new int [F][C];
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                int num =GeneradorAleatorio.generarInt(31);
                matriz[i][j] = num;
                System.out.println("Contenido de la matriz en fila " + i + " columna " + j + " es "+ matriz[i][j]);
            }
            
        }
        int suma = 0;
        for (int j = 0; j < C; j++) {
            suma += matriz[1][j];    
        }
        System.out.println("La suma de la fila 1 es " + suma);
        
        int [] vector = new int[5];
        
        for (int j = 0; j < 5; j++) {
            int sumaC = 0;
            for (int i = 0; i < 5; i++) {
                sumaC += matriz[i][j];
            }          
            vector[j] = sumaC;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Contenido de la vector en la columna " + i + " es " + vector[i]);
        }
        
        System.out.println("Ingrese valor a buscar");
        int valor = Lector.leerInt();
        boolean encontre = false;
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                 if(valor == matriz[i][j]){
                     encontre = true;
                     System.out.println("Encontre el valor en la fila " + i + " la columna " + j);
                 }
            }
            
        }
        if (encontre == false){
            System.out.println("No se encontró el elemento");
        }
    }
    
}
