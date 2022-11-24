/*
2-A- Modifique la clase Libro.java (carpeta tema3) para ahora considerar que el primer 
autor es un objeto instancia de la clase Autor. 
Implemente la clase Autor, sabiendo que se caracterizan por nombre, biografía y origen 
y que deben permitir devolver/modificar el valor de sus atributos y devolver una 
representación String formada por nombre, biografía y origen. 
Luego realice las modificaciones necesarias en la clase Libro.
B- Modifique el programa Demo01Constructores (carpeta tema3) para instanciar los 
libros con su autor, considerando las modificaciones realizadas. Luego, a partir de uno de 
los libros instanciados, obtenga e imprima la representación del autor de ese libro.

 */
package Practica3;

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
        System.out.println("Nombre");
        String nombre = Lector.leerString();
        System.out.println("Biografia");
        String biografia = Lector.leerString();
        System.out.println("Origen");
        String origen = Lector.leerString();
        
        Autor a = new Autor (nombre, biografia, origen);
        
        System.out.println("Nombre");
        nombre = Lector.leerString();
        System.out.println("Biografia");
        biografia = Lector.leerString();
        System.out.println("Origen");
        origen = Lector.leerString();
        
        Autor a1 = new Autor (nombre, biografia, origen);
        
        Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 a, "978-0071809252", 21.72);
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                              "CreateSpace Independent Publishing", 
                               a1, "978-1512108347");
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Precio del libro2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        Libro libro3= new Libro(); 
        System.out.println(libro1.getPrimerAutor().toString());
        System.out.println(libro2.getPrimerAutor().toString());
    }
    
}
