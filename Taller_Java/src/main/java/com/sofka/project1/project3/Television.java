package com.sofka.project1.project3;

public class Television extends Electrodomestico {
    double resolucion;
    boolean sintonizador_TDT = false;
    public static final double resolucion_Def = 20;

    public Television(int i, int i1, char e, String negro, int i2, boolean b) {

    }

    public Television(double precio_base, double peso) {
        super(precio_base, peso);

    }


    public Television(String color, String consumoEnergetico, double precio_base, double peso, double resolucion) {
        super(color, consumoEnergetico, precio_base, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    //
    public double precioFinal() {
        double max = super.precioFinal();
        if (resolucion > 40) {
            max += precio_base * 0.3;
        } else if (sintonizador_TDT) {
            max += 50;
        }

        return max;
    }
}
