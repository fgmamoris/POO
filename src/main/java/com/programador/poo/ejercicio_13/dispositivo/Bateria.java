/*
 */
package com.programador.poo.ejercicio_13.dispositivo;

/**
 *
 * @author Federico Mamoris
 */
public class Bateria {

    private int amperaje;
    private int duracionEnHoras;

    public Bateria() {
    }

    public Bateria(int amperaje, int duracionEnHoras) {
        this.amperaje = amperaje;
        this.duracionEnHoras = duracionEnHoras;
    }

    public int getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(int amperaje) {
        this.amperaje = amperaje;
    }

    public int getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public void setDuracionEnHoras(int duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }

    @Override
    public String toString() {
        return "Bateria{" + "amperaje=" + amperaje + ", duracionEnHoras=" + duracionEnHoras + '}';
    }

}
