package com.sofka.project1;

import java.util.Scanner;

/**
 * un algoritmo que permite de acuerdo a una frase pasada por consola,
 * indicar cual es la longitud de una frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
 *
 * @author Duvan Botero
 */

public class Ejercicio_11 {
    public static void main(String[] args) {
        int contador = 0;
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido al programa");

        System.out.println("Por favor ingresa una palabra");
        String palabra = leer.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            if ((palabra.charAt(i) == 'a')) {
                contadorA++;
            } else if ((palabra.charAt(i) == 'e')) {
                contadorE++;
            } else if ((palabra.charAt(i) == 'i')) {
                contadorI++;
            } else if ((palabra.charAt(i) == 'o')) {
                contadorO++;
            } else if ((palabra.charAt(i) == 'u')) {
                contadorU++;
            }

        }
        System.out.println("La longitud de la palabra es: " + palabra.length());
        System.out.println("vocal A --> " + contadorA);
        System.out.println("vocal E --> " + contadorE);
        System.out.println("vocal I --> " + contadorI);
        System.out.println("vocal O --> " + contadorO);
        System.out.println("vocal U--> " + contadorU);

    }


}
