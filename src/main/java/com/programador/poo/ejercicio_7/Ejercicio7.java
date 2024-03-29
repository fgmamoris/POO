/*
 * Crear la clase Lavarropas con los atributos marca, modelo y kilos de lavado, 
 * elegir el tipo de dato adecuado para ellos. 
 * Además se debe crear el método TipodeRopa e imprimir el tipo seleccionado:
 * Tipos de Ropa:
 * 1_Lana
 * 2_Ropa Sucia
 * 3_Economico
 * 4_Ropa de Bebe
 */
package com.programador.poo.ejercicio_7;

import com.programador.poo.ejercicio_3.TipoCuenta;
import com.programador.poo.utils.ValidateNumbers;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio7 {

    public static void inicializarEjercicio7() {

        Lavarropa unidad = new Lavarropa("Deean", "Family max", 14);
        Scanner sc = new Scanner(System.in);
        String temp = "";
        boolean isNumeric = false;
        System.out.println(unidad.toString());
        do {
            System.out.println("Seleccione programa de lavado:");
            System.out.println("1 - Lana");
            System.out.println("2 - Ropa Sucia");
            System.out.println("3 - Económico");
            System.out.println("4 - Ropa de bebe");
            temp = sc.nextLine();
            if (temp.isEmpty()) {
                System.out.println("Error, debe ingresar al menos un número");
            } else {
                isNumeric = ValidateNumbers.validateNumbersInString(temp);
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar un número válido");
                } else {
                    if (Integer.parseInt(temp) < 1 || Integer.parseInt(temp) > 4) {
                        System.out.println("Debe ingresar una opción válida");
                        isNumeric = false;
                    } else {
                        TipoDeRopa[] arr = TipoDeRopa.values();
                        System.out.println(unidad.toString());
                        System.out.println("Programa seleccionado: " + arr[Integer.parseInt(temp) - 1].getTipo());
                        Programa.llenado(arr[Integer.parseInt(temp) - 1]);
                    }
                }
            }
        } while (!isNumeric);
    }
}
