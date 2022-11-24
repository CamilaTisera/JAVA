/*
 2- Queremos representar a los empleados de un club: jugadores y entrenadores.
 Cualquier empleado se caracteriza por su nombre, sueldo básico y antigüedad. 
 Los jugadores son empleados que se caracterizan por el número de partidos jugados y 
el número de goles anotados.
 Los entrenadores son empleados que se caracterizan por la cantidad de campeonatos 
ganados.
A- Implemente la jerarquía de clases declarando atributos, métodos para 
obtener/modificar su valor y constructores que reciban los datos necesarios.
B- Cualquier empleado debe responder al mensaje calcularEfectividad. La efectividad 
del entrenador es el promedio de campeonatos ganados por año de antigüedad, mientras 
que la del jugador es el promedio de goles por partido.
C- Cualquier empleado debe responder al mensaje calcularSueldoACobrar. El sueldo a 
cobrar es el sueldo básico más un 10% del básico por cada año de antigüedad y además:
 Para los jugadores: si el promedio de goles por partido es superior a 0,5 se adiciona un 
plus de otro sueldo básico. 
 Para los entrenadores: se adiciona un plus por campeonatos ganados (5000$ si ha 
ganado entre 1 y 4 campeonatos; $30.000 si ha ganado entre 5 y 10 campeonatos; 
50.000$ si ha ganado más de 10 campeonatos). 
D- Cualquier empleado debe responder al mensaje toString, que devuelve un String que 
lo representa, compuesto por nombre, sueldo a cobrar y efectividad.
F- Realizar un programa que instancie un jugador y un entrenador. Informe la 
representación String de cada uno.
NOTA: para cada método a implementar piense en que clase/s debe definir el método.
 */
package Practica4;

import PaqueteLectura.Lector;

/**
 *
 * @author Admin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nombre ");
        String nombre = Lector.leerString();
        System.out.println("Sueldo ");
        double sueldoBasico = Lector.leerDouble();
        System.out.println("Antiguedad ");
        int antiguedad  = Lector.leerInt();
        
        System.out.println("Partidos jugados ");
        int partidosJugados = Lector.leerInt();
        System.out.println("Goles anotados ");
        int golesAnotados = Lector.leerInt();
        
        Jugador j = new Jugador (partidosJugados, golesAnotados, nombre, sueldoBasico, antiguedad);
        System.out.println(j.toString());
        
        System.out.println("Nombre ");
        nombre = Lector.leerString();
        System.out.println("Sueldo ");
        sueldoBasico = Lector.leerDouble();
        System.out.println("Antiguedad ");
        antiguedad  = Lector.leerInt();
        
        System.out.println("Campeonatos ganados ");
        int campeonatosGanados = Lector.leerInt();
        
        Entrenador e = new Entrenador (campeonatosGanados, nombre, sueldoBasico, antiguedad);
        System.out.println(e.toString());
    }
    
}
