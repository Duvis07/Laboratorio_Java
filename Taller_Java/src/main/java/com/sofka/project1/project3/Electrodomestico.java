package com.sofka.project1.project3;

import static javafx.scene.input.KeyCode.F;

/**
 * Esta clase contiene  atributos que son precio base, color, consumo energético, peso
 * Los constructores que se implementarán serán:
 * Un constructor por defecto.
 * Un constructor con el precio y peso.
 * Un constructor con todos los atributo
 * Los métodos que implementara serán:comprobarConsumoEnergetico(char letra),comprobarColor(String color)
 * precioFinal()
 *
 * @author Duvan Botero
 */

public class Electrodomestico {
    public static final String color_Def = "Blanco";
    public static final char consumoEnergetico_Def = 'F';
    public static final double precioBase_Def = 100;
    public static final double peso_Def = 5;
    String color;
   char consumoEnergetico ;
    double precioBase;
    double peso;

    /**
     * Un constructor por defecto.
     */
    public Electrodomestico() {

    }

    /**
     * Un constructor con el precio y peso
     *
     * @param precioBase
     * @param peso
     */
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    /**
     * Un constructor con todos los atributos.
     *
     * @param color
     * @param consumoEnergetico
     * @param precioBase
     * @param peso
     */

    public Electrodomestico(String color, char consumoEnergetico, double precioBase, double peso) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.precioBase = precioBase;
        this.peso = peso;

    }

    /**
     * Métodos get de todos los atributos.
     *
     * @return
     */
    public String getColor() {
        return color;
    }


    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }


    public double getPrecioBase() {
        return precioBase;
    }


    public double getPeso() {
        return peso;
    }

    /**
     * comprueba que el color es correcto, sino lo es usa el color por defecto
     *
     * @param color
     */
    public void comprobarColor(String color) {
        String[] colores = {"blancos", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                encontrado = true;

            } else if (encontrado) {
                this.color = color;

            } else {
                this.color = color_Def;
            }

        }
    }

    /**
     * comprueba que la letra es correcta, sino es correcta usara la letra por defecto
     *
     * @param letra
     */
   private void comprobarConsumoEnergetico(char letra) {
        if (consumoEnergetico =='F') {
            consumoEnergetico = 'F';
        } else if (consumoEnergetico == 'A') {
            consumoEnergetico = 'A';
        } else if (consumoEnergetico == 'B') {
            consumoEnergetico = 'B';
        } else if (consumoEnergetico == 'C') {
            consumoEnergetico = 'C';
        } else if (consumoEnergetico == 'D') {
            consumoEnergetico = 'D';
        } else if (consumoEnergetico == 'E') {
            consumoEnergetico = 'E';
        } else {
            consumoEnergetico = 'F';
        }

    }

    /**
     * según el consumo energético, aumentara su precio, y según su tamaño, también
     *
     * @return
     */
    public double precioFinal() {
        double max = 0;
        switch (consumoEnergetico) {
            case 'A':
                max += 100;
                break;
            case 'B':
                max += 80;
                break;
            case 'C':
                max += 60;
                break;
            case 'D':
                max += 50;
                break;
            case 'E':
                max += 30;
                break;
            case 'F':
                max += 10;
                break;
        }
        if (peso >= 0 && peso < 19) {
            max += 10;
        } else if (peso >= 20 && peso < 49) {
            max += 50;
        } else if (peso >= 50 && peso < 79) {
            max += 80;

        } else if (peso > 80) {
            max += 100;
        }

        return precioBase + max;
    }

}
