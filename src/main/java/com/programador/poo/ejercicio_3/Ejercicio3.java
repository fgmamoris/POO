package com.programador.poo.ejercicio_3;

import com.programador.poo.utils.ValidateNumbers;
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
        do {
            System.out.println("Ingrese nombre del titular de la cuenta:");
            titular.setNombre(sc.nextLine());
            if (titular.getNombre().isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (titular.getNombre().isEmpty());

        do {
            System.out.println("Ingrese apellido del titular de la cuenta:");
            titular.setApellido(sc.nextLine());
            if (titular.getApellido().isEmpty()) {
                System.out.println("Debe ingresar al menos una palabra");
            }
        } while (titular.getApellido().isEmpty());

        do {
            System.out.println("Ingrese dni:");
            temp = sc.nextLine();
            if (temp.isEmpty()) {
                System.out.println("Debe ingresar un dni válido");
            } else {
                isNumeric = ValidateNumbers.validateNumbersInString(temp);
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar un dni válido");
                } else {
                    titular.setDni(Integer.parseInt(temp));
                }
            }
        } while (!isNumeric || temp.isEmpty());

        System.out.println("Datos de la cuenta");
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular(titular);
        temp = "";
        do {
            System.out.println("Ingrese saldo de la cuenta:");
            temp = sc.nextLine();
            if (temp.isEmpty()) {
                System.out.println("Debe ingresar un monto válido");
            } else {
                isNumeric = ValidateNumbers.validateNumbersInString(temp);
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar un monto válido");
                } else {
                    cuenta.setSaldo(Integer.parseInt(temp));
                }
            }
        } while (!isNumeric || temp.isEmpty());
        do {
            System.out.println("Ingrese tipo de cuenta:");
            System.out.println("1 - Cuenta Corriente");
            System.out.println("2 - Caja de ahorro en pesos");
            System.out.println("3 - Caja de ahorro en dolares");
            temp = sc.nextLine();
            if (temp.isEmpty()) {
                System.out.println("Debe seleccionar al menos una opción válida");
            } else {
                isNumeric = ValidateNumbers.validateNumbersInString(temp);
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar una opción válida");
                } else {
                    TipoCuenta[] arr = TipoCuenta.values();
                    switch (Integer.parseInt(temp)) {
                        case 1:
                            cuenta.setTipo(arr[0]);
                            System.out.println("----Cuenta creada satifactoriamente----");
                            break;
                        case 2:
                            cuenta.setTipo(arr[1]);
                            System.out.println("----Cuenta creada satifactoriamente----");
                            break;
                        case 3:
                            cuenta.setTipo(arr[2]);
                            System.out.println("----Cuenta creada satifactoriamente----");
                            break;
                        default:
                            System.out.println("No es una opción valida");
                            isNumeric = false;
                    }
                }
            }
        } while (!isNumeric || temp.isEmpty());
        System.out.println("Datos del titular de la cuenta");
        System.out.println(titular.toString());
        System.out.println("Datos de la cuenta");
        System.out.println("Tipo de cuenta: " + cuenta.getTipo().getTipoDeCeunta());
        System.out.println("Saldo: " + cuenta.getSaldo());
        do {
            System.out.println("Ingrese monto a debitar de la cuenta:");
            temp = sc.nextLine();
            if (temp.isEmpty()) {
                System.out.println("Error, debe ingresar un monto válido");
            } else {
                isNumeric = ValidateNumbers.validateNumbersInString(temp);
                if (!isNumeric) {
                    System.out.println("Error, debe ingresar un monto válido");
                } else if (Integer.parseInt(temp) < 0) {
                    System.out.println("El monto a debitar no puede ser menor a cero");
                    isNumeric = false;
                } else if (Integer.parseInt(temp) > cuenta.getSaldo()) {
                    System.out.println("Saldo insuficiente para realizar la operación");
                    isNumeric = false;
                } else {
                    cuenta.setSaldo(cuenta.getSaldo() - Integer.parseInt(temp));
                    System.out.println("Operación realizada con exito");
                    System.out.println("Monto debitado de la cuenta: " + temp);
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                }
            }
        } while (!isNumeric || temp.isEmpty());

    }

}
