package com.sofka.project1;

import java.util.Scanner;

/**
 * comprueba mediante un while que un numero es mayor o igual que cero,
 * si no lo es lo volverá a pedir al usuario
 *
 * @autor Duvan Botero
 */

public class Ejercicio_7 {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("<<<Bienvenido al programa>>>");
        System.out.println("Por favor ingrese un numero mayor a cero");
        num = leer.nextInt();

        System.out.println("El numero ingresado es: " + num);
        while (num <= 0) {
            System.out.println("Por favor intentalo de nuevo ingresa un numero mayor a cero");
            num = leer.nextInt();
            System.out.println("El numero ingresado es: " + num);

        }

    }
}
