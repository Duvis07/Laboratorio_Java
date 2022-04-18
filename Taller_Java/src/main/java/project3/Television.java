package project3;

public class Television extends Electrodomestico{
    double resolucion;
    boolean sintonizador_TDT = false;
    public static final double resolucion_Def = 20;

    public Television() {

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

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }
}
