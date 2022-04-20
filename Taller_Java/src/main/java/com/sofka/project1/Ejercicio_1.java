package com.sofka.project1;

/**
 * @author Duvan Botero
 * Se valida si un numero es mayor o igual
 * @num1
 * @num2
 */

public class Ejercicio_1 {
    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 10;

        if (num1 > num2) {
            System.out.println("El numero uno es mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El numero dos es mayor es: " + num2);
        } else if (num1 == num2) {
            System.out.println("Ambos numeros son iguales");
        }

    }
}
