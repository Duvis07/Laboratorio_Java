package com.sofka.project1;

import java.util.Scanner;

/**
 * @autor Duvan Botero
 * se ingresa 2 numeros por consola y se indica  si son mayores, menores o iguales.
 */


public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("---Bienvenido al programa---");
        System.out.println("Por favor ingresa primer numero:");
        Integer num1 = leer.nextInt();
        System.out.println("Por favor ingresa el segundo numero:");
        Integer num2 = leer.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es el mayor: " + num1);
        } else if (num2 > num1) {
            System.out.println("El segundo numero es el mayor: " + num2);
        } else if (num1 == num2) {
            System.out.println("Ambos numeros son iguales");
        }
    }
}


