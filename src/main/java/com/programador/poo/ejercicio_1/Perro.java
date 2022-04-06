/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programador.poo.ejercicio_1;

/**
 *
 * @author Federico Mamoris
 */
public class Perro {

    private String nombre;
    private String raza;
    private String color;

    public Perro() {
    }

    public Perro(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + '}';
    }

    public void ladrar() {
        System.out.println("Guau");
    }
}
