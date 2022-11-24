/*
 2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta 
obtener edad 0. Luego de almacenar la información:
 - Informe la cantidad de personas mayores de 65 años.
 - Muestre la representación de la persona con menor DNI.

 */
package Practica2;
import PaqueteLectura.GeneradorAleatorio;
public class Ejercicio2 {
    public static void main(String[] args) {
       int DF = 15;
       int DL = 0;
       Persona [] vector = new Persona [DF];

       GeneradorAleatorio.iniciar();
       
       int edad = GeneradorAleatorio.generarInt(DF);
       while ((DL < DF) && (edad != 0)){
           String nombre = GeneradorAleatorio.generarString(DF);
           int DNI = GeneradorAleatorio.generarInt(DF);
           Persona p = new Persona (nombre, DNI, edad);
           vector [DL] = p;
           DL++;
           edad = GeneradorAleatorio.generarInt(DF);
    }
        int cant = 0;
        int min = 9999;
        int pos = 0;
        for (int i = 0; i < DL; i++) {
            if(vector[i].getEdad()>65){
               cant++;
            }
            if(vector[i].getDNI()<min){
                min = vector[i].getDNI();
                pos = i;
            }
        }
        System.out.println("La cantidad de personas con edad mayor de 65 años es: " + cant);
        System.out.println("La persona con el DNI minimo es: " + vector[pos]);
       
    }
    
}
