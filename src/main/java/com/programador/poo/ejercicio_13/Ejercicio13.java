/*
 * Realizar un programa en  el cual exista una clase padre y 3 clases hijas. 
 * Vamos a simular que somos una compañía de soporte técnico en donde recibimos 
 * elementos electrónicos como celulares, tablet y joystick. 
 * El operador tiene que poder realizar la registración del elemento
 * electrónico que ingreso , teniendo un ingreso de sus atributos por consola.
 * Atributos como :
 * Numero de cliente:
 * Elemento:(celular,tablet,jostick..)
 * Marca:
 * Modelo:
 * Batería: 3000ma  5hs,4000ma  9hs,7000ma  12hs
 * Defecto:
 * Para luego realizar una impresión en pantalla con el detalle del elemento recibido.
 * Adjunte el comentario con el repositorio para ver el funcionamiento.
 */
package com.programador.poo.ejercicio_13;

import com.programador.poo.ejercicio_13.dispositivo.Celular;
import com.programador.poo.ejercicio_13.dispositivo.Elemento;
import com.programador.poo.ejercicio_13.dispositivo.Joystick;
import com.programador.poo.ejercicio_13.dispositivo.Tablet;
import com.programador.poo.utils.ValidateNumbers;
import java.util.Scanner;

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio13 {

    public static void inicializarEjercicio13() {

        Scanner sc = new Scanner(System.in);
        //Variables 
        String temp = "";
        int numeroCliente = 0;
        String marca = "";
        String modelo = "";
        int amperaje = 0;
        int duracion = 0;
        int tipoElemento = 0;
        String defecto = "";

        boolean isNumeric = false;
        System.out.println("Datos del dispositivo electrónico");

        do {
            System.out.println("Ingresar número de cliente: ");
            temp = sc.next();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar un número válido");
            } else {
                numeroCliente = Integer.parseInt(temp);
            }
        } while (!isNumeric);
        do {
            System.out.println("Seleccione el elemento electronico: ");
            System.out.println("1 - Celular");
            System.out.println("2 - Tablet");
            System.out.println("3 - Joystick");
            temp = sc.next();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar un número válido");
            } else if (Integer.parseInt(temp) < 1 || Integer.parseInt(temp) > 3) {
                System.out.println("Debe seleccionar un elemento de la lista");
                isNumeric = false;
            } else {
                tipoElemento = Integer.parseInt(temp);
            }
        } while (!isNumeric);
        do {
            System.out.println("Ingrese marca: ");
            marca = sc.nextLine();
            if (marca.isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (marca.isEmpty());
        do {
            System.out.println("Ingrese modelo: ");
            modelo = sc.nextLine();
            if (modelo.isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (modelo.isEmpty());

        do {
            System.out.println("Ingrese el amperaje de la bateria en mA: ");
            temp = sc.nextLine();
            if (temp.isEmpty()) {
                System.out.println("Error, debe ingresar un número válido");
            } else {
                isNumeric = ValidateNumbers.validateNumbersInString(temp);
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar un número válido");
                } else {
                    if (Integer.parseInt(temp) < 0) {
                        System.out.println("El ampaeraje no puede ser negativo");
                        isNumeric = false;
                    } else {
                        amperaje = Integer.parseInt(temp);
                    }
                }
            }
        } while (!isNumeric || temp.isEmpty());
        do {
            System.out.println("Ingrese la duración de la bateria en horas: ");
            temp = sc.nextLine();
            if (temp.isEmpty()) {
                System.out.println("Error, debe ingresar un número válido");
            } else {
                isNumeric = ValidateNumbers.validateNumbersInString(temp);
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar un número válido");
                } else {
                    if (Integer.parseInt(temp) < 0) {
                        System.out.println("La duración no puede ser negativa");
                        isNumeric = false;
                    } else {
                        duracion = Integer.parseInt(temp);
                    }
                }
            }
        } while (!isNumeric || temp.isEmpty());
        do {
            System.out.println("Ingrese defecto del dispositivo");
            defecto = sc.nextLine();
            if (defecto.isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (defecto.isEmpty());

        Elemento dispositivoIngresado = new Elemento();
        switch (tipoElemento) {
            case 1:
                dispositivoIngresado = new Celular(numeroCliente, marca, modelo, defecto, amperaje, duracion);
                break;
            case 2:
                dispositivoIngresado = new Tablet(numeroCliente, marca, modelo, defecto, amperaje, duracion);
                break;
            case 3:
                dispositivoIngresado = new Joystick(numeroCliente, marca, modelo, defecto, amperaje, duracion);
                break;

        }
        System.out.println("---Dispositivo ingresado al servicio técnico---");
        System.out.println(dispositivoIngresado.toString());
        System.out.println("");
    }
}
