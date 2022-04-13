/*
 * Crear una clase para calcular el área de un rectángulo.
 * Se necesita crear dos clases una para solicitar los datos
 * y otra para realizar la operación.
 
 */
package com.programador.poo.ejercicio_6;

import com.programador.poo.utils.ValidateNumbers;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio6 {

    public static void inicializarEjercicio6() {
        Scanner sc = new Scanner(System.in);
        int base = 0, altura = 0;

        String temp = "";
        boolean isNumeric = true;
        System.out.println("Calculo de área del rectangulo");

        do {
            System.out.println("Ingrese la base del rectangulo:");
            temp = sc.nextLine();
            if (temp.isEmpty()) {
                System.out.println("Error, debe ingresar un número válido");
            } else {
                isNumeric = ValidateNumbers.validateNumbersInString(temp);
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar un número válido");
                } else {
                    if (Integer.parseInt(temp) < 0) {
                        System.out.println("Error, el valor no puede ser menor a cero");
                        isNumeric = false;
                    } else {
                        base = Integer.parseInt(temp);
                    }
                }
            }
        } while (!isNumeric || temp.isEmpty());

        do {
            System.out.println("Ingrese la altura del rectangulo:");
            temp = sc.nextLine();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (temp.isEmpty()) {
                System.out.println("Error, debe ingresar un número válido");
            } else {
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar un número válido");
                } else {
                    if (Integer.parseInt(temp) < 0) {
                        System.out.println("Error, el valor no puede ser menor a cero");
                        isNumeric = false;
                    } else {

                        altura = Integer.parseInt(temp);
                    }
                }
            }
        } while (!isNumeric || temp.isEmpty());
        Rectangulo figura = new Rectangulo(base, altura);
        System.out.println("Área total de rectangulo: " + calcularArea(figura));
    }

    private static int calcularArea(Rectangulo figura) {
        return figura.getBase() * figura.getAltura();
    }
}
