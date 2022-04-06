/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programador.poo;

import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bienvenidos al modulo de POO del trayecto programador CFP36");

        do {
            System.out.println("Seleccione el ejercicio que desea consultar");
            System.out.println("1 - Clase Perro - método ladrar");
            System.out.println("2 - Clase Auto - método estadoAuto");
            System.out.println("3 - Pastillas de frenos ");
            System.out.println("4 - Alineación");
            System.out.println("5 - Balanceo");
            System.out.println("0 - Para salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    
                    break;
                case 1:
                    

                    break;
                case 2:
                    

                    break;

                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;

                default:
                    System.out.println("Por favor ingrese una opción válida");
                    if (minimo == 1 && opcion == 0) {
                        quit = 1;
                    }
            }

        } while (quit != 1);

    }
}
