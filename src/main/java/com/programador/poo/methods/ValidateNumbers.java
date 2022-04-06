/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programador.poo.methods;

/**
 *
 * @author Federico Mamoris
 */
public class ValidateNumbers {

    public static boolean validateNumbersInString(String str) {
        return str.matches("[+-]?\\d*(\\.\\d+)?");
    }
}
