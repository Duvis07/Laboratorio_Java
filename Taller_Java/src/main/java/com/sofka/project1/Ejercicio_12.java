package com.sofka.project1;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        System.out.println("<<<Bienvenido al programa>>>");
        Scanner sn = new Scanner(System.in);

        System.out.println("Escribe la palabra 1");
        String palabra1 = sn.next();

        System.out.println("Escribe la palabra 2");
        String palabra2 = sn.next();


        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras no son iguales");

        }

    }}