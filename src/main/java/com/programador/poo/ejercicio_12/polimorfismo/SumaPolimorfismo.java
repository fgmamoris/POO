/*
 
 */
package com.programador.poo.ejercicio_12.polimorfismo;

import com.programador.poo.ejercicio_12.*;

/**
 *
 * @author Federico Mamoris
 */
public class SumaPolimorfismo extends OperacionDeDosVariablesPolimorfismo {

    public SumaPolimorfismo(int variableUno, int variableDos) {
        super(variableUno, variableDos);
    }

    @Override
    public int operacion() {
        return getVariableUno() + getVariableDos();
    }

}
