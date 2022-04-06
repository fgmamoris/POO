/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programador.poo.ejercicio_7;

/**
 *
 * @author Federico Mamoris
 */
public enum TipoDeRopa {

    LANA("Lana, lavado medio"), ROPA_SUCIA("Ropa Sucia, lavado intenso"), ECONOMICO("Lavado economico"), ROPA_DE_BEBE("Ropa de bebe, lavado suave");

    private String tipo;

    private TipoDeRopa(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
