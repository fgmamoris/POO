/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programador.poo.ejercicio_3;

/**
 *
 * @author Federico Mamoris
 */
public enum TipoCuenta {
    C_C("Cuenta corriente"), C_A_PESOS("Caja de ahorro en pesos"), C_A_DOLARES("Caja de ahorro dolares");

    private String tipo;

    private TipoCuenta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoDeCeunta() {
        return tipo;
    }
}
