package com.sofka.project1;
import java.util.Scanner;

/**
 * Reemplaza todas las a del String frase por una e y adicionalmente,
 * concatena la frase enviada por el usuario
 *
 * @autor Duvan Botero
 */

public class Ejercicio_9 {
    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingresa una frase");
        String fraseUsuario = leer.nextLine();
        frase = frase.replace("a", "e");
        fraseUsuario = fraseUsuario.replace("a", "e");
        System.out.println(frase + " " + fraseUsuario);
    }
}
