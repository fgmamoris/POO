/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programador.poo.ejercicio_2;

import com.programador.poo.methods.ValidateNumbers;
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

        System.out.println("Ingrese marca:");
        auto.setMarca(sc.nextLine());
        System.out.println("Ingrese modelo:");
        auto.setModelo(sc.nextLine());

        do {
            System.out.println("Ingrese kilometraje:");
            temp = sc.nextLine();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar un número válido");
            } else {
                auto.setKilometraje(Integer.parseInt(temp));
            }
        } while (!isNumeric);

    }

    public static void estadoAuto(int kilometraje) {

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
