/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programador.poo.utils;

/**
 *
 * @author Federico Mamoris
 */
public class ValidateNumbers {

    /**
     *
     * @param String This is the paramter to String method
     * @return boolean if String is only numbers or false.
     */
    public static boolean validateNumbersInString(String str) {
        String regex = "\\d+";
        return (str.matches(regex));
//return !str.matches("[a-zA-Z@._]*");
        // return str.matches("[+-]?\\d*(\\.\\d+)?");
    }
}
