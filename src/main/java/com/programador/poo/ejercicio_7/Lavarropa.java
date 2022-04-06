/*
 *
 */
package com.programador.poo.ejercicio_7;

/**
 *
 * @author Federico Mamoris
 */
public class Lavarropa {

    private String marca;
    private String modelo;
    private int kilosDeLavado;

    public Lavarropa(String marca, String modelo, int kilosDeLavado) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilosDeLavado = kilosDeLavado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilosDeLavado() {
        return kilosDeLavado;
    }

    public void setKilosDeLavado(int kilosDeLavado) {
        this.kilosDeLavado = kilosDeLavado;
    }

    @Override
    public String toString() {
        return "Lavarropa{" + "marca=" + marca + ", modelo=" + modelo + ", kilosDeLavado=" + kilosDeLavado + '}';
    }

}
