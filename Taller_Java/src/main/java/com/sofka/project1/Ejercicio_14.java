package com.sofka.project1;

import java.util.Scanner;

/**
 * programa que pide un numero  y  imprime los números
 * desde el numero introducido hasta 1000 con saldos de 2 en 2.
 *
 * @author Duvan Botero
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        Integer num;

        Scanner leer = new Scanner(System.in);
        System.out.println("<<<Bienvenido al programa>>>");
        System.out.println("Ingresa un numero por favor");
        num = leer.nextInt();

        for (num = num; num < 1000; num += 2) {
            System.out.print("[" + num + "],");

        }

    }
}
