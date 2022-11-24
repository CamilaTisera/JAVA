/*
4- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en 
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así 
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 
40 cupos de casting.
Una vez finalizada la inscripción: 
b) Informar para cada día y turno el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona y pensar en la estructura de datos a utilizar. 
 */
package Practica2;

import PaqueteLectura.Lector;

public class Ejercicio4 {

    public static void main(String[] args) {
        int F = 5;
        int C = 8;
        int cupo = 0;
        int dia = 0;
        int turno = 0;
        Persona [][] matriz = new Persona [F][C];
       
        System.out.println("Nombre: ");
        String nombre = Lector.leerString();
        while((cupo < 40) && (!"ZZZ".equals(nombre))){
            while((dia < F) && (turno < 8) && (!"ZZZ".equals(nombre))){
              System.out.println("DNI: ");
              int DNI = Lector.leerInt();
              System.out.println("EDAD: ");
              int edad = Lector.leerInt();
              Persona p = new Persona(nombre, DNI, edad);
              matriz[dia][turno] = p;
              cupo++;
              turno++;
              System.out.println("Nombre: ");
              nombre = Lector.leerString();
        }
            turno = 0;
            dia++;
        }
        
        for (int i = 0; i < dia; i++) {
            for (int j = 0; j < C; j++) {
               if(matriz[i][j] != null){
                System.out.println("Dia: " + i + " Turno " + j + " Persona: " + matriz[i][j]);
               }
            }
            
        }
      
    }   
          
  }