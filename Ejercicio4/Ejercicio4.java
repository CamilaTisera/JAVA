/*
4- Una escuela de música arma coros para participar de ciertos eventos. Los coros poseen 
un nombre y están formados por un director y una serie de coristas. Del director se 
conoce el nombre, DNI, edad y la antigüedad (un número entero). De los coristas se conoce 
el nombre, DNI, edad y el tono fundamental (un número entero). Asimismo, hay dos tipos 
de coros: coro semicircular en el que los coristas se colocan en el escenario uno al lado 
del otro y coro por hileras donde los coristas se organizan en filas de igual dimensión.
a. Implemente las clases necesarias teniendo en cuenta que los coros deberían crearse 
con un director y sin ningún corista, pero sí sabiendo las dimensiones del coro.
b. Implemente métodos (en las clases donde corresponda) que permitan:
 agregar un corista al coro. 
o En el coro semicircular los coristas se deben ir agregando de izquierda 
a derecha
o En el coro por hileras los coristas se deben ir agregando de izquierda a 
derecha, completando la hilera antes de pasar a la siguiente.
 determinar si un coro está lleno o no. Devuelve true si el coro tiene a todos sus 
coristas asignados o false en caso contrario.
 determinar si un coro (se supone que está lleno) está bien formado. Un coro 
está bien formado si:
o En el caso del coro semicircular, de izquierda a derecha los coristas 
están ordenados de mayor a menor en cuanto a tono fundamental. 
o En el caso del coro por hileras, todos los miembros de una misma hilera 
tienen el mismo tono fundamental y además todos los primeros
miembros de cada hilera están ordenados de mayor a menor en cuanto 
a tono fundamental.
 devolver la representación de un coro formada por el nombre del coro, todos 
los datos del director y todos los datos de todos los coristas.
c. Escriba un programa que instancie un coro de cada tipo. Lea o bien la cantidad de 
coristas (en el caso del coro semicircular) o la cantidad de hileras e integrantes por 
hilera (en el caso del coro por hileras). Luego cree la cantidad de coristas necesarios,
leyendo sus datos, y almacenándolos en el coro. Finalmente imprima toda la 
información de los coros indicando si están bien formados o no.
 */
package Ejercicio4;

import PaqueteLectura.Lector;

/**
 *
 * @author Admin
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Coro");
        System.out.println("Nombre");
        String nombre = Lector.leerString();
        
        System.out.println("Director");
        System.out.println("Nombre");
        String nombreD = Lector.leerString();
        System.out.println("DNI");
        int DNI = Lector.leerInt();
        System.out.println("Edad");
        int edad = Lector.leerInt();
        System.out.println("Antiguedad");
        int antiguedad = Lector.leerInt();
        
        Director d = new Director (nombreD, DNI, edad, antiguedad);
        
        System.out.println("SemiCircular");
        System.out.println("Cantidad");
        int cantidad = Lector.leerInt();
        
        Semicircular sc = new Semicircular(cantidad, nombre, d);
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Corista");
            System.out.println("Nombre");
            nombreD = Lector.leerString();
            System.out.println("DNI");
            DNI = Lector.leerInt();
            System.out.println("Edad");
            edad = Lector.leerInt();
            System.out.println("Tono fundamental");
            int tonoFundamental = Lector.leerInt();
            
            Corista c = new Corista (nombre, DNI, edad, tonoFundamental);
            
            sc.agregarCorista(c);
            
        }
        System.out.println(sc.Lleno());
        System.out.println(sc.Formado());
        System.out.println(sc.toString());
        
        System.out.println("Coro");
        System.out.println("Nombre");
        nombre = Lector.leerString();
        
        System.out.println("Director");
        System.out.println("Nombre");
        nombreD = Lector.leerString();
        System.out.println("DNI");
        DNI = Lector.leerInt();
        System.out.println("Edad");
        edad = Lector.leerInt();
        System.out.println("Antiguedad");
        antiguedad = Lector.leerInt();
        
        Director d1 = new Director (nombreD, DNI, edad, antiguedad);
        
        System.out.println("SemiCircular");
        System.out.println("Fila");
        int fila = Lector.leerInt();
        System.out.println("Columna");
        int columna = Lector.leerInt();
        
        Hilera h = new Hilera (fila, columna, nombre, d1);
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                 System.out.println("Corista");
                 System.out.println("Nombre");
                 nombreD = Lector.leerString();
                 System.out.println("DNI");
                 DNI = Lector.leerInt();
                 System.out.println("Edad");
                 edad = Lector.leerInt();
                 System.out.println("Tono fundamental");
                 int tonoFundamental = Lector.leerInt();
            
                 Corista c1 = new Corista (nombre, DNI, edad, tonoFundamental);
                 
                 h.agregarCorista(c1);
            }
            
        }
        System.out.println(h.Lleno());
        System.out.println(h.Formado());
        System.out.println(h.toString());
    }
    
}
