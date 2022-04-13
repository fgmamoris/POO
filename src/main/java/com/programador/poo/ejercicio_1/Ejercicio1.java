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
        do {
            System.out.println("Ingrese nombre:");
            perro.setNombre(sc.nextLine());
            if (perro.getNombre().isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (perro.getNombre().isEmpty());

        do {
            System.out.println("Ingrese raza:");
            perro.setRaza(sc.nextLine());
            if (perro.getRaza().isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (perro.getRaza().isEmpty());

        do {
            System.out.println("Ingrese color:");
            perro.setColor(sc.nextLine());
            if (perro.getColor().isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (perro.getColor().isEmpty());
        System.out.println("----Resultado-----");
        System.out.println(perro.toString());
        perro.ladrar();
        System.out.println("-------------------");
    }
}
