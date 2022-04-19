package project3;

public class Lavadora extends Electrodomestico{
    int carga;
    public static  final int  carga_def= 5;

    public Lavadora() {

    }

    public Lavadora(double precio_base, double peso) {
        super(precio_base, peso);

    }

    public Lavadora(String color, String consumoEnergetico, double precio_base, double peso, int carga) {
        super(color, consumoEnergetico, precio_base, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    public double precioFinal(){
        if(carga>30){
            super.precio_base=precio_base + 50;
        }else  if (carga<29){
            super.precio_base=precio_base;
        }

        return precioFinal();
    }
}
