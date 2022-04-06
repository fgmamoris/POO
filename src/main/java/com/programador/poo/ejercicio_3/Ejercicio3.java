package com.programador.poo.ejercicio_3;

import com.programador.poo.methods.TipoCuenta;
import com.programador.poo.methods.ValidateNumbers;
import java.util.Scanner;

/*
 * Crear la clase cuentaBancaria que tenga como atributo nombreTitular, 
 * tipoDeCuenta y saldo. Elegir el tipo de dato adecuado para cada uno 
 * de ellos. Además hacer el método extraer() que permita extraer dinero, 
 * si se puede. Crear un objeto de esta clase y comprobar el funcionamiento
 * package com.programador.poo.ejercicio_3;
 */

/**
 *
 * @author Federico Mamoris
 */
public class Ejercicio3 {

    public static void inicializarEjercicio3() {
        Scanner sc = new Scanner(System.in);
        Persona titular = new Persona();
        String temp = "";
        boolean isNumeric = true;
        System.out.println("Datos del titular de la cuenta");

        System.out.println("Ingrese nombre:");
        titular.setNombre(temp);

        System.out.println("Ingrese apellido:");
        titular.setApellido(temp);

        do {
            System.out.println("Ingrese dni:");
            temp = sc.nextLine();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar un dni válido");
            } else {
                titular.setDni(Integer.parseInt(temp));
            }
        } while (!isNumeric);

        System.out.println("Datos de la cuenta");
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular(titular);
        temp = "";
        do {
            System.out.println("Ingrese saldo de la cuenta:");
            temp = sc.nextLine();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar un monto válido");
            } else {
                cuenta.setSaldo(Integer.parseInt(temp));
            }
        } while (!isNumeric);
        do {
            System.out.println("Ingrese tipo de cuenta:");
            System.out.println("1 - Cuenta Corriente");
            System.out.println("2 - Caja de ahorro en pesos");
            System.out.println("3 - Caja de ahorro en dolares");
            temp = sc.nextLine();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar una opción válida");
            } else {
                if (1 < temp.charAt(0) && temp.charAt(0) < 3) {
                    TipoCuenta[] arr = TipoCuenta.values();
                    cuenta.setTipo(arr[Integer.parseInt(temp)]);
                    System.out.println("Cuenta creada satifactoriamente");
                }
            }

        } while (!isNumeric);
        System.out.println("Datos del titular de la cuenta");
        System.out.println(titular.toString());
        System.out.println("Datos de la cuenta");
        System.out.println("Tipo de cuenta: " + cuenta.getTipo().getTipo());
        System.out.println("Saldo: " + cuenta.getSaldo());
        do {
            System.out.println("Ingrese monto a debitar de la cuenta:");
            temp = sc.nextLine();
            isNumeric = ValidateNumbers.validateNumbersInString(temp);
            if (!isNumeric) {
                System.out.println("Error, debe ingresar un monto válido");
            } else if (Integer.parseInt(temp) < 0) {
                System.out.println("El monto a debitar no puede ser menor a cero");

            } else if (Integer.parseInt(temp) > cuenta.getSaldo()) {
                System.out.println("Saldo insuficiente para realizar la operación");
            } else {
                System.out.println("Operación realizada con exito");
            }
        } while (!isNumeric);
        System.out.println("Monto debitado de la cuenta: " + temp);
        System.out.println("Saldo actual: " + cuenta.getSaldo());

    }

}
