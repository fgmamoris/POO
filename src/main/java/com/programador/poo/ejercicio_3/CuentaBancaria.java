/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programador.poo.ejercicio_3;

import com.programador.poo.methods.TipoCuenta;

/**
 *
 * @author Federico Mamoris
 */
public class CuentaBancaria {

    private Persona titular;
    private int saldo;
    private TipoCuenta tipo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(Persona titular, TipoCuenta tipo, int saldo) {
        this.titular = titular;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "titular=" + titular + ", tipo=" + tipo + ", saldo=" + saldo + '}';
    }

}
