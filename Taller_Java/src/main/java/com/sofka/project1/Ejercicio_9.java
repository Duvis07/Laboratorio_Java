package com.sofka.project1;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        String frase="La sonrisa sera la mejor arma contra la tristeza";

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingresa una frase");
        String oracion = leer.nextLine();

        String frase_final = frase.replace("a", "e");

        System.out.println(frase_final + " " + oracion);
    }
}
