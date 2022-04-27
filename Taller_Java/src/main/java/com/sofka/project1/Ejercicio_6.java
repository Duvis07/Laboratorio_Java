package com.sofka.project1;

/**
 * Muestra los números impares y pares del 1 al 100 con el ciclo for
 *
 * @autor Duvan Botero
 */

public class Ejercicio_6 {
    public static void main(String[] args) {
        System.out.println("<<<Bienvenido al Programa>>>");

        for (Integer index = 1; index <= 100; index++) {
            if (index % 2 == 0) {
                System.out.println("El numero " + index + " es par");
            } else if (index % 2 != 0)
                System.out.println("El numero " + index + " es impar");


        }
    }
}

