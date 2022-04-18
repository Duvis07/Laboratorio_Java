package com.sofka.project1;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Integer num;

        Scanner leer = new Scanner(System.in);
        System.out.println("<<<Bienvenido al programa>>>");
        System.out.println("Ingresa un numero por favor");
        num = leer.nextInt();

        for (num = num; num < 100; num += 2) {
            System.out.print("[" + num + "],");

        }

    }
}
