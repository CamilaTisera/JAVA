/*
5- Se dispone de la clase Partido (en la carpeta tema2). Un objeto partido representa un 
encuentro entre dos equipos (local y visitante). Un objeto partido puede crearse sin 
valores iniciales o enviando en el mensaje de creación el nombre del equipo local, el 
nombre del visitante, la cantidad de goles del local y del visitante (en ese orden). Un objeto 
partido sabe responder a los siguientes mensajes:
getLocal() retorna el nombre (String) del equipo local
getVisitante() retorna el nombre (String) del equipo visitante
getGolesLocal() retorna la cantidad de goles (int) del equipo local
getGolesVisitante() retorna la cantidad de goles (int) del equipo visitante
setLocal(X) modifica el nombre del equipo local al “String” X
setVisitante(X) modifica el nombre del equipo visitante al “String” X
setGolesLocal(X) modifica la cantidad de goles del equipo local al “int” X
setGolesVisitante(X) modifica la cantidad de goles del equipo visitante al “int” X
hayGanador() retorna un boolean que indica si hubo (true) o no hubo (false) ganador
getGanador() retorna el nombre (String) del ganador del partido (si no hubo retorna 
un String vacío). 
hayEmpate() retorna un boolean que indica si hubo (true) o no hubo (false) empate
Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en 
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con 
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local
 */
package Practica2;

import PaqueteLectura.Lector;

public class Ejercicio5 {

    public static void main(String[] args) {
          int DF = 20;
          int DL = 0;
          Partido [] vector = new Partido [DF];
          
          System.out.println("Nombre del visitante: ");
          String unVisitante = Lector.leerString();
          while(!"ZZZ".equals(unVisitante) && DL < DF){
              System.out.println("Goles del Visitante: ");
              int golVisitante = Lector.leerInt();
              System.out.println("Nombre del Local: ");
              String unLocal = Lector.leerString();
              System.out.println("Goles del Local: ");
              int golLocal = Lector.leerInt();
              Partido p = new Partido(unLocal, unVisitante, golLocal, golVisitante);
              vector[DL] = p;
              DL++;
              System.out.println("Nombre del visitante: ");
              unVisitante = Lector.leerString();
              
          }
          int cant = 0;
          int goles = 0;
          for (int i = 0; i < DL; i++) {
              System.out.println("Equipo local: " + vector[i].getLocal() + " Goles Local " + vector[i].getGolesLocal() 
                      + " VS " + " Equipo visitante " + vector[i].getVisitante() + " Goles visitante " + vector[i].getGolesVisitante());
          }
          for (int i = 0; i < DL; i++){
              if(vector[i].hayGanador() == true){
               if("River".equals(vector[i].getGanador())){
                   cant++;
              }
              }
              if("Boca".equals(vector[i].getLocal())){
                 goles = goles + vector[i].getGolesLocal();
              }
        }
          System.out.println("River gano: " + cant + " Partidos ");
          System.out.println("Boca goles: " + goles);
    }
    
}