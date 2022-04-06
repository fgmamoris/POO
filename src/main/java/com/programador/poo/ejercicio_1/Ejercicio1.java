/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programador.poo.ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio1 {

    public static void inicializarEjercicio1() {
        Scanner sc = new Scanner(System.in);
        Perro perro = new Perro();

        System.out.println("Datos del perro");
        System.out.println("Ingrese nombre:");
        perro.setNombre(sc.nextLine());
        System.out.println("Ingrese raza:");
        perro.setRaza(sc.nextLine());
        System.out.println("Ingrese color:");
        perro.setColor(sc.nextLine());

        System.out.println(perro.toString());
        perro.ladrar();
    }
}
