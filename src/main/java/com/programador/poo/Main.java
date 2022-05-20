/*

 */
package com.programador.poo;

import com.programador.poo.ejercicio_25.Ejercicio25;
import com.programador.poo.ejercicio_20.Ejercicio20;
import com.programador.poo.ejercicio_21.Ejercicio21;
import com.programador.poo.ejercicio_1.Ejercicio1;
import com.programador.poo.ejercicio_12.Ejercicio12;
import com.programador.poo.ejercicio_13.Ejercicio13;
import com.programador.poo.ejercicio_17.Ejercicio17;
import com.programador.poo.ejercicio_2.Ejercicio2;
import com.programador.poo.ejercicio_23.Ejercicio23;
import com.programador.poo.ejercicio_26.Ejercicio26;
import com.programador.poo.ejercicio_28.Ejercicio28A;
import com.programador.poo.ejercicio_29.Ejercicio29;
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
            System.out.println("9 - Ejercicio 20");
            System.out.println("10 - Ejercicio 21 - 22");
            System.out.println("11 - Ejercicio 23 - 24");
            System.out.println("12 - Ejercicio 25");
            System.out.println("13 - Ejercicio 26- 27");
            System.out.println("14 - Ejercicio 28");
            System.out.println("15 - Ejercicio 29");
            System.out.println("16 - Ejercicio 23");

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
                    case 9:
                        Ejercicio20.inicializarEjercicio20();
                        break;
                    case 10:
                        Ejercicio21.inicializarEjercicio21();
                        break;
                    case 11:
                        Ejercicio23.inicializarEjercicio23();
                        break;
                    case 12:
                        Ejercicio25.inicializarEjercicio25();
                        break;
                    case 13:
                        Ejercicio26.inicializarEjercicio26();
                        break;
                    case 14:
                        Ejercicio28A.inicializarEjercicio28();
                        break;
                    case 15:
                        Ejercicio29.inicializarEjercicio29();
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
