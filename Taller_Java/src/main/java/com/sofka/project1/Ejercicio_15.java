package com.sofka.project1;

import java.util.Scanner;

/**
 * programa que muestre un menú de opciones
 * el sistema solo va a salir cuando se digite el numero 8
 * mientras se digite una de las cinco opciones debe seguir mostrado el menu
 * * si el usuario digita un numero que no esta en el menu se debe arrojar un mensaje de error
 *
 * @author Duvan Botero
 */

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = -1;

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