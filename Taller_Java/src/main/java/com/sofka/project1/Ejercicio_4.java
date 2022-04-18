package com.sofka.project1;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        final Double iva = 0.19;

        Scanner leer = new Scanner(System.in);
        System.out.println("---Bienvenido al programa---");
        System.out.println("Por favor ingresa nombre de un producto");
        String nombre_Producto = leer.nextLine();
        System.out.println("Por favor ingresa el precio de un producto");
        Double precio_Inicial = leer.nextDouble();

        Double con_Iva = precio_Inicial * iva;
        Double precio_Final = precio_Inicial + con_Iva;


        System.out.println("El " + nombre_Producto + " tiene un  Iva de: " + con_Iva +
                " y un precio total de " + precio_Final + " pesos"
        );


    }
}
