package project3;

import project3.Electrodomestico;

/**
 * Esta clase cuenta con atributos como carga, además de los atributos heredados.
 * Los constructores que se implementarán serán:
 * Un constructor por defecto.
 * Un constructor con el precio y peso.
 * Un constructor con la carga y el resto de atributos heredados.
 * Los métodos que se implementara serán:Método get de carga,precioFinal()
 *
 * @author Duvan Botero
 */

public class Lavadora extends Electrodomestico {
    int carga;
    public static final int carga_def = 5;

    /**
     *Un constructor por defecto
     */
    public Lavadora() {

    }

    /**
     * Un constructor con el precio y peso
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);

    }

    /**
     * Un constructor con la carga y el resto de atributos heredados
     * @param color
     * @param consumoEnergetico
     * @param precioBase
     * @param peso
     * @param carga
     */
    public Lavadora(String color, char consumoEnergetico, double precioBase, double peso, int carga) {
        super(color, consumoEnergetico, precioBase, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    /**
     * Metododo que hace la condicion que si tiene una carga mayor de 30 kg, aumentara el precio 50 €,
     * sino es así no se incrementara el precio
     * @return
     */
    public double precioFinal() {
        double max = super.precioFinal();
        if (carga > 30) {
            max += 50;

        }
        return max;
    }
}