/*
 
 */
package com.programador.poo.ejercicio_12;

/**
 *
 * @author Federico Mamoris
 */
public class Suma extends OperacionDeDosVariables {

    public Suma(int variableUno, int variableDos) {
        super(variableUno, variableDos);
    }

    public int operacion() {
        return (variableUno + variableDos);
    }

}
