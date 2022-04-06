package com.programador.poo.ejercicio_12;

/**
 *
 * @author Federico Mamoris
 */
public class Resta extends OperacionDeDosVariables {

    public Resta(int variableUno, int variableDos) {
        super(variableUno, variableDos);
    }

    @Override
    public int operacion(int variableUno, int variableDos) {
        return (variableUno - variableDos);
    }
}
