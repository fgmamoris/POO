/*
 */
package com.programador.poo.ejercicio_2;

import com.programador.poo.utils.ValidateNumbers;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio2 {

    public static void inicializarEjercicio2() {
        Scanner sc = new Scanner(System.in);
        Auto auto = new Auto();
        String temp = "";
        boolean isNumeric = true;
        System.out.println("Datos del vehículo");
        do {
            System.out.println("Ingrese marca:");
            auto.setMarca(sc.nextLine());
            if (auto.getMarca().isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (auto.getMarca().isEmpty());
        do {
            System.out.println("Ingrese modelo:");
            auto.setModelo(sc.nextLine());
            if (auto.getModelo().isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (auto.getModelo().isEmpty());

        do {
            System.out.println("Ingrese kilometraje:");
            temp = sc.nextLine();
            if (temp.isEmpty()) {
                System.out.println("Debe ingresar un número valido");
            } else {
                isNumeric = ValidateNumbers.validateNumbersInString(temp);
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar un número válido");
                } else {
                    auto.setKilometraje(Integer.parseInt(temp));
                }
            }
        } while (!isNumeric || temp.isEmpty());
        System.out.println("----Resultado-----");
        estadoAuto(auto.getKilometraje());
        System.out.println("-------------------");
    }

    private static void estadoAuto(int kilometraje) {

        if (kilometraje == 0) {
            System.out.println("El auto está nuevo");
        } else if (kilometraje < 10000) {
            System.out.println("El auto tiene poco uso");
        } else if (kilometraje < 100000) {
            System.out.println("El auto esta usadao");
        } else {
            System.out.println("El auto está bastante usado");
        }

    }
}
