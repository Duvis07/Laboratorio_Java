package com.sofka.project1;
import java.util.Scanner;

/**
 * aplicación que al ingresar una frase por teclado elimina los espacios que esta contenga
 *
 * @author Duvan Botero
 */

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingresa una frase");
        String frase = leer.nextLine();

        String result = frase.replaceAll("\\s+", "");
        System.out.println(result);
    }
}