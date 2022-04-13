/*
 */
package com.programador.poo.ejercicio_12.polimorfismo;

import com.programador.poo.ejercicio_12.*;

/**
 *
 * @author Federico Mamoris
 */
public abstract class OperacionDeDosVariablesPolimorfismo {

    private int variableUno;
    private int variableDos;

    public OperacionDeDosVariablesPolimorfismo(int variableUno, int variableDos) {
        this.variableUno = variableUno;
        this.variableDos = variableDos;
    }

    public int getVariableUno() {
        return variableUno;
    }

    public void setVariableUno(int variableUno) {
        this.variableUno = variableUno;
    }

    public int getVariableDos() {
        return variableDos;
    }

    public void setVariableDos(int variableDos) {
        this.variableDos = variableDos;
    }

    public abstract int operacion();

    @Override
    public String toString() {
        return "OperacionDeDosVariables{" + "variableUno=" + variableUno + ", variableDos=" + variableDos + '}';
    }

}
