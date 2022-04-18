package com.sofka.project1;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer select = -1;

        System.out.println("****** GESTION CINEMATOGRAFICA ********");
        while (select != 8) {
            try {
                System.out.println("Elige opción:\n" + "1-NUEVO ACTOR\n" + "2-BUSCAR ACTOR\n" + "3-ELIMINAR ACTOR\n" + "4-MODIFICAR ACTOR\n" + "5-VER TODOS LOS ACTORES\n" + "6-VER PELICULAS DE LOS ACTORES\n" + "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" + "8-SALIR\n");

                select = Integer.parseInt(scanner.nextLine());


                switch (select) {
                    case 1:
                        System.out.println("Nuevo actor");
                        break;
                    case 2:
                        System.out.println("Buscar actor");
                        break;
                    case 3:
                        System.out.println("Eliminar actor");
                        break;
                    case 4:
                        System.out.println("Modificar actor");
                        break;
                    case 5:
                        System.out.println("Ver todos los actores");
                        break;
                    case 6:
                        System.out.println("Ver peliculas de los actores");
                        break;
                    case 7:
                        System.out.println("Ver categoria de las peliculas de los actores");
                        break;
                    case 8:
                        System.out.println("Haz salido del Sistema");
                        break;
                    default:
                        System.out.println("Opcion invalida intentalo de nuevo");
                        break;
                }

                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Uoop! Error!");
            }
        }

    }
}