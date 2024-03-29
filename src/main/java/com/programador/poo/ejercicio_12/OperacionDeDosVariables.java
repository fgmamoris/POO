/*
 */
package com.programador.poo.ejercicio_12;

/**
 *
 * @author Federico Mamoris
 */
public class OperacionDeDosVariables {

    protected int variableUno;
    protected int variableDos;

    public OperacionDeDosVariables(int variableUno, int variableDos) {
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

    @Override
    public String toString() {
        return "OperacionDeDosVariables{" + "variableUno=" + variableUno + ", variableDos=" + variableDos + '}';
    }

}
