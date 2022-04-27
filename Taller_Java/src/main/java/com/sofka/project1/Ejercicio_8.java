package com.sofka.project1;

import java.util.Scanner;

/**
 * Crea una aplicación por consola que nos pida un día de la
 * semana y mediante un switch case que nos diga si es un día laboral o no.
 *
 * @autor Duvan Botero
 */

public class Ejercicio_8 {
    public static void main(String[] args) {
        Integer dia;
        Scanner leer = new Scanner(System.in);
        System.out.println("<<<Bienvenido al programa>>>");
        System.out.println("Por favor ingresa el  dia que quieres consultar");
        System.out.println(
                "1:Lunes\n" +
                        "2:Martes\n" +
                        "3:Miercoles\n" +
                        "4:Jueves\n" +
                        "5:Viernes\n" +
                        "6:Sabado\n" +
                        "7:Domingo\n" +
                        "8:Salir del programa\n");
        dia = leer.nextInt();
        switch (dia) {
            case 1:
                System.out.println("El dia lunes es de trabajo laboral");
                break;
            case 2:
                System.out.println("El dia martes es de trabajo laboral");
                break;
            case 3:
                System.out.println("El dia miercoles es de trabajo laboral");
                break;
            case 4:
                System.out.println("El dia jueves es de trabajo laboral");
                break;
            case 5:
                System.out.println("El dia viernes es de trabajo laboral");
                break;
            case 6:
                System.out.println("El dia sabado es de descanso");
                break;
            case 7:
                System.out.println("El dia domingo es de descanso");
                break;
            case 8:
                System.out.println("Haz salido del programa");
                break;

            default:
                System.out.println("Error no ingresaste el dia de forma correcta ");


        }


    }
}
