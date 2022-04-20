package com.sofka.project1;

/**
 * Muestra los números impares y pares del 1 al 100 con el ciclo while
 *
 * @autor Duvan Botero
 */

public class Ejercicio_5 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println("El numero " + num + " es par");
            } else if (num % 2 != 0)
                System.out.println("El numero " + num + " es impar");

            num++;
        }
    }
}
