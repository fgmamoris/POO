/*
 * Realizar una suma y resta  de dos valores ingresados por el usuario 
 * utilizando herencia. Crear dos paquetes uno con la clase main y la otra 
 * con las operaciones. Crear una clase padre y dos hijas(resta, suma); 
 * luego con la clase principal main llamar a esas clases
 */
package com.programador.poo.ejercicio_12;

import com.programador.poo.ejercicio_12.polimorfismo.RestaPolimorfismo;
import com.programador.poo.ejercicio_12.polimorfismo.SumaPolimorfismo;
import com.programador.poo.utils.ValidateNumbers;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio12 {

    public static void inicializarEjercicio12() {

        Scanner sc = new Scanner(System.in);

        String temp = "";
        boolean isNumeric = true;
        int valorTempUno = 0, valorTempDos = 0;
        do {
            System.out.println("Ingresar primer valor: ");
            temp = sc.next();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar un número válido");
            } else {
                valorTempUno = Integer.parseInt(temp);
            }
        } while (!isNumeric);
        do {
            System.out.println("Ingresar segundo valor: ");
            temp = sc.next();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar un número válido");
            } else {
                valorTempDos = Integer.parseInt(temp);
            }
        } while (!isNumeric);
        do {
            System.out.println("Ejercicio de herencia");
            System.out.println("1 - Herencia");
            System.out.println("2 - Herencia con polimorfismo");
            temp = sc.next();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar un número válido");
            } else if (Integer.parseInt(temp) < 1 && Integer.parseInt(temp) > 2) {
                System.out.println("La opción seleccionada no es válida");
                isNumeric = false;
            }
        } while (!isNumeric);
        System.out.println("--------Resultado----------");
        System.out.println("Primer valor ingresado: " + valorTempUno);
        System.out.println("Segundo valor ingresado: " + valorTempDos);
        switch (Integer.parseInt(temp)) {

            case 1:

                Suma sum = new Suma(valorTempUno, valorTempDos);
                System.out.println("Resultado suma: " + sum.operacion());
                Resta rest = new Resta(valorTempUno, valorTempDos);
                System.out.println("Resultado resta: " + rest.operacion());
                break;
            case 2:
                SumaPolimorfismo sumaPolimorfismo = new SumaPolimorfismo(valorTempUno, valorTempDos);
                System.out.println("Resultado suma: " + sumaPolimorfismo.operacion());
                RestaPolimorfismo resta = new RestaPolimorfismo(valorTempUno, valorTempDos);
                System.out.println("Resultado resta: " + resta.operacion());
                break;

        }
    }
}
