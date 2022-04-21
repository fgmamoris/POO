/*

 */
package com.programador.poo;

import com.programador.poo.ejercicio_1.Ejercicio1;
import com.programador.poo.ejercicio_12.Ejercicio12;
import com.programador.poo.ejercicio_13.Ejercicio13;
import com.programador.poo.ejercicio_17.Ejercicio17;
import com.programador.poo.ejercicio_2.Ejercicio2;
import com.programador.poo.ejercicio_3.Ejercicio3;
import com.programador.poo.ejercicio_6.Ejercicio6;
import com.programador.poo.ejercicio_7.Ejercicio7;
import com.programador.poo.utils.ValidateNumbers;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos al modulo de POO del trayecto programador CFP36");
        int quit = 0;
        do {
            System.out.println("Seleccione el ejercicio que desea consultar");
            System.out.println("1 - Ejercicio 1 - 4 - 10");
            System.out.println("2 - Ejercicio 2 - 5 - 11");
            System.out.println("3 - Ejercicio 3");
            System.out.println("4 - Ejercicio 6");
            System.out.println("5 - Ejercicio 7 - 8 - 9");
            System.out.println("6 - Ejercicio 12");
            System.out.println("7 - Ejercicio 13");
            System.out.println("8 - Ejercicio 17 - 18 - 19");
            System.out.println("0 - Para salir");
            String opcion = sc.nextLine();
            if (!opcion.isEmpty() && ValidateNumbers.validateNumbersInString(opcion)) {
                switch (Integer.parseInt(opcion)) {
                    case 0:
                        System.out.println("Programa finalizado");
                        quit = 1;
                        break;
                    case 1:
                        Ejercicio1.inicializarEjercicio1();
                        break;
                    case 2:
                        Ejercicio2.inicializarEjercicio2();
                        break;

                    case 3:
                        Ejercicio3.inicializarEjercicio3();

                        break;
                    case 4:
                        Ejercicio6.inicializarEjercicio6();

                        break;
                    case 5:
                        Ejercicio7.inicializarEjercicio7();

                        break;
                    case 6:
                        Ejercicio12.inicializarEjercicio12();
                        break;
                    case 7:
                        Ejercicio13.inicializarEjercicio13();
                        break;
                    case 8:
                        Ejercicio17.inicializarEjercicio17();
                        break;

                    default:
                        System.out.println("Por favor ingrese una opción válida");

                }
            } else {
                System.out.println("Por favor ingrese una opción válida");
            }
        } while (quit != 1);
    }
}
