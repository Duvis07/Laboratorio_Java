package project3;

public class Electrodomestico {
    public static final String color_Def = "Blanco";
    public static final String consumoEnergetico_Def = "F";
    public static final double precioBase_Def = 100;
    public static final double peso_Def = 5;
    String color;
    String consumoEnergetico;
    double precio_base;
    double peso;

    //constructor por defecto
    public Electrodomestico() {
    }

    //constructor con precioBase y el peso
    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    //Un constructor con todos los atributos.
    public Electrodomestico(String color, String consumoEnergetico, double precio_base, double peso) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.precio_base = precio_base;
        this.peso = peso;

    }

    public String getColor() {
        return color;
    }


    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }


    public double getPrecio_base() {
        return precio_base;
    }


    public double getPeso() {
        return peso;
    }


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
    public void comprobarConsumoEnergetico(char letra) {
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean encontrado = false;



    }


    public double precioFinal() {
        double max = 0;
        switch (consumoEnergetico) {
            case "A":
                max += 100;
                break;
            case "B":
                max += 80;
                break;
            case "C":
                max += 60;
                break;
            case "D":
                max += 50;
                break;
            case "E":
                max += 30;
                break;
            case "F":
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

        return precio_base + max;
    }

}
