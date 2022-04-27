package com.sofka.project1;

import java.util.Scanner;

/**
 * Se calcula el precio final con IVA de un producto con un Iva 21%.
 *
 * @autor Duvan Botero
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        final double iva = 0.21;
        Scanner leer = new Scanner(System.in);
        System.out.println("---Bienvenido al programa---");
        System.out.println("Por favor ingresa el nombre de un producto");
        String nombreProducto = leer.nextLine();
        System.out.println("Por favor ingresa el precio del producto");
        Double precioInicial = leer.nextDouble();
        Double calcularIva = precioInicial * iva;
        Double precioFinal = precioInicial + calcularIva;

        System.out.println("El " + nombreProducto + " tiene un Iva de: " + calcularIva +
                " y un precio total de " + precioFinal + " pesos"
        );

    }
}
