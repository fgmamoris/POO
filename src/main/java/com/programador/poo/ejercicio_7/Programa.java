/*
 */
package com.programador.poo.ejercicio_7;

/**
 *
 * @author Federico Mamoris
 */
public class Programa {

    public static void llenado(TipoDeRopa tipo) {

        switch (tipo) {
            case LANA:
                System.out.println("Tiempo de llenado: 15 minutos");
                lavado(tipo);

                break;
            case ROPA_SUCIA:
                System.out.println("Tiempo de llenado: 20 minutos");
                lavado(tipo);

                break;
            case ECONOMICO:
                System.out.println("Tiempo de llenado: 10 minutos");
                lavado(tipo);

                break;
            case ROPA_DE_BEBE:
                System.out.println("Tiempo de llenado: 15 minutos");
                lavado(tipo);

                break;
            default:
                throw new AssertionError();
        }

    }

    private static void lavado(TipoDeRopa tipo) {

        switch (tipo) {
            case LANA:
                System.out.println("Tiempo de lavado: 35 minutos");
                secado(tipo);
                break;
            case ROPA_SUCIA:
                System.out.println("Tiempo de lavado: 55 minutos");
                secado(tipo);
                break;
            case ECONOMICO:
                System.out.println("Tiempo de lavado: 15 minutos");
                secado(tipo);
                break;
            case ROPA_DE_BEBE:
                System.out.println("Tiempo de lavado: 25 minutos");
                secado(tipo);
                break;
            default:
                throw new AssertionError();
        }

    }

    private static void secado(TipoDeRopa tipo) {

        switch (tipo) {
            case LANA:
                System.out.println("Tiempo de secado: 15 minutos");
                break;
            case ROPA_SUCIA:
                System.out.println("Tiempo de secado: 20 minutos");
                break;
            case ECONOMICO:
                System.out.println("Tiempo de secado: 10 minutos");
                break;
            case ROPA_DE_BEBE:
                System.out.println("Tiempo de secado: 12 minutos");
                break;
            default:
                throw new AssertionError();
        }

    }
}
