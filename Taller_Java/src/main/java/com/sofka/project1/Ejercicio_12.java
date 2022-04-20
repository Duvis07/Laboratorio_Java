package com.sofka.project1;

import java.util.Scanner;

/**
 * Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
 *
 * @author Duvan Botero
 */

public class Ejercicio_12 {
    public static void main(String[] args) {
        System.out.println("<<<Bienvenido al programa>>>");
        Scanner sn = new Scanner(System.in);

        System.out.println("Escribe la palabra 1");
        String palabra1 = sn.next();

        System.out.println("Escribe la palabra 2");
        String palabra2 = sn.next();


        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las palabra " + palabra1 + " y "+ palabra2 + " son iguales ");
        } else {
            System.out.println("Las palabra " + palabra1 + " y "+ palabra2 + " son diferentes ");

        }
        if (palabra1.length() == palabra2.length()) {
            if (palabra1.equalsIgnoreCase(palabra2)) {
                System.out.println("la palabra " + palabra1 + " y la palabra " + palabra2 + " son iguales en longitud");
            } else {
                for (int i = 0; i < palabra1.length(); i++) {
                    if (palabra1.charAt(i) != palabra2.charAt(i)) {
                        System.out.println("Las palabras no son iguales en la posicion " + i);
                    }
                }
            }
        } else {
            System.out.println("La palabra " + palabra1 + " tiene una longitud de: " + palabra1.length());
            System.out.println("La palabra " + palabra2 + " tiene una longitud de: " + palabra2.length());
            System.out.println("Las palabras son diferentes en longitud");

        }

    }
}