/*
3-A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros. 
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para: 
(i) devolver la cantidad de libros que almacenados 
(ii) devolver si el estante está lleno 
(iii) agregar un libro al estante 
(iv) devolver el libro con un título particular que se recibe.
B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante, 
busque e informe el autor del libro “Mujercitas”.
C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que 
almacenen como máximo N libros? ¿Cómo instanciaría el estante?
 */
package Practica3;

import PaqueteLectura.Lector;

/**
 *
 * @author Admin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int DF = 2;
        int DL = 0;
        Estante e = new Estante ();
        
        while(DL < DF){ 
            System.out.println("Nombre");
            String nombre = Lector.leerString();
            System.out.println("Biografia");
            String biografia = Lector.leerString();
            System.out.println("Origen");
            String origen = Lector.leerString();
        
            Autor a = new Autor (nombre, biografia, origen);
            
            System.out.println("Titulo");
            String titulo = Lector.leerString();
            System.out.println("Editorial");
            String editorial = Lector.leerString();
            System.out.println("Año edicion");
            int añoEdicion = Lector.leerInt();
            System.out.println("ISBN");
            String ISBN = Lector.leerString();
            System.out.println("Precio");
            int precio = Lector.leerInt();
            
            Libro libro= new  Libro(titulo, editorial, añoEdicion, a, ISBN, precio);
            
            e.agregarLibro(libro);
            DL++;
        }
        System.out.println(e.buscarLibro("Mujercitas"));
    }
    
}
