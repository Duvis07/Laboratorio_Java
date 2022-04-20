package com.sofka.project1;

/**
 * Muestra los números impares y pares del 1 al 100 con el ciclo for
 *
 * @autor Duvan Botero
 */

public class Ejercicio_6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("El numero " + i + " es par");
            } else if (i % 2 != 0)
                System.out.println("El numero " + i + " es impar");


        }
    }
}

