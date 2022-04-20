package com.sofka.project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * aplicación que calcula el área de un círculo(pi*R2).
 * @autor Duvan Botero
 */

public class Ejercicio_3 {
    public static void main(String[] args) throws IOException {

        System.out.println("--Bienvenido al programa----");

        final double PI = 3.141;
        double area;
        double radio;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Escribe el valor del radio: ");
        entrada = bufer.readLine();
        radio = Double.parseDouble(entrada);
        area = PI * radio * radio;

        System.out.println("El área del círculo es: " + area);

    }
}