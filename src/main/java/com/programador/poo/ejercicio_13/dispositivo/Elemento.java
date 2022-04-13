/*
 */
package com.programador.poo.ejercicio_13.dispositivo;

/**
 *
 * @author Federico Mamoris
 */
public class Elemento {

    private int numeroCliente;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private String defecto;

    public Elemento() {
    }

    public Elemento(int numeroCliente, String marca, String modelo, String defecto, int amperaje, int duracionEnHoras) {
        this.numeroCliente = numeroCliente;
        this.marca = marca;
        this.modelo = modelo;
        this.defecto = defecto;
        this.bateria = new Bateria(amperaje, duracionEnHoras);
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
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

    public String getDefecto() {
        return defecto;
    }

    public void setDefecto(String defecto) {
        this.defecto = defecto;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Elemento{" + "numeroCliente=" + numeroCliente + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", defecto=" + defecto + '}';
    }

}
