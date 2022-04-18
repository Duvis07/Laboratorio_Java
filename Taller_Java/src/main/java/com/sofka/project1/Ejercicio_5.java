package com.sofka.project1;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Integer num = 1;

        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println("El numero " + num + " es par");
            } else if (num % 2 != 0)
                System.out.println("El numero " + num + " es impar");

            num++;
        }
    }
}
