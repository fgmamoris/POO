/*
 * Ejercicio N°14
 •
 * Crea una clase llamada Libro que guarde la información de cada uno de los 
 * libros de una biblioteca. La clase debe guardar el título del libro, 
 * autor, número de ejemplares del libro y número de ejemplares prestados.
 * La clase contendrá los siguientes métodos:
 * Constructor por defecto.
 * Constructor con parámetros.
 * Métodos Setters/getters
 * Método préstamo que incremente el atributo correspondiente cada vez que se 
 * realice un préstamo del libro. No se podrán prestar libros de los que no 
 * queden ejemplares disponibles para prestar. Devuelve true si se ha podido 
 * realizar la operación y false en caso contrario.
 * Método devolución que decremente el atributo correspondiente cuando se
 * produzca la devolución de un libro. No se podrán devolver libros que no 
 * se hayan prestado. Devuelve true si se ha podido realizar la operación y 
 * false en caso contrario.
 * Método toString para mostrar los datos de los libros.
 * Este método se heredada de Object y lo debemos modificar 
 * (override) para adaptarlo a la clase Libro.
 * Escribe un programa para probar el funcionamiento de la clase Libronto.
 */
package com.programador.poo.ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio14 {

    public static void inicializarEjercicio14() {

        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;

        //se crea el objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
        //se crea el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro();

        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();

        //se asigna a libro2 los datos pedidos por teclado.
        //para ello se utilizan los métodos setters
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);

        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();

        //se realiza un préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }

        //se realiza una devolución de libro1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario
        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }

        //se realiza otro préstamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }

        //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
        //pantalla el mensaje No quedan ejemplares del libro…
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();

        //mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestados());
        System.out.println();
    }
}
