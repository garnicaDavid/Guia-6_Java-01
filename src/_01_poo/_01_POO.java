/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01_poo;

import _01_poo.newpackage.Libro;
import java.util.Scanner;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 * @author David
 */
public class _01_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro m1 = new Libro();
        System.out.println("Ingrese el código ISBN :");
        m1.ISBN = leer.nextInt();
        System.out.println("Ingrese el Título del libro :");
        m1.Titulo = leer.next();
        System.out.println("Ingrese el Nombre del Autor :");
        m1.Autor = leer.next();
        System.out.println("Ingrese cantidad de Páginas");
        m1.Número_de_páginas = leer.nextInt();
        
        System.out.println("ISBN : " + m1.ISBN);
        System.out.println("Título : " + m1.Titulo);
        System.out.println("Autor : " + m1.Autor);
        System.out.println("Páginas : " + m1.Número_de_páginas);
        
    }
    
//    public int ISBN;
//    public String Titulo;
//    public String Autor;
//    public int Número_de_páginas;
}
