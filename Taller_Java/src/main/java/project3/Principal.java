package project3;

/**
 * En esta clase se crea un array de Electrodomesticos de 10 posiciones.
 * Asigna a cada posición un objeto de las clases anteriores con los valores .
 * Tambien se recorre este array y se ejecuta el método precioFinal().
 *
 * @author Duvan Botero
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("<<<Bienvenido al programa>>>");
        Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];

        listaElectrodomesticos[0] = new Electrodomestico("verde", 'F', 100, 9);
        listaElectrodomesticos[1] = new Lavadora(400, 30);
        listaElectrodomesticos[2] = new Television("verde", 'E', 200, 20, 9, false);
        listaElectrodomesticos[3] = new Electrodomestico(300, 3);
        listaElectrodomesticos[4] = new Electrodomestico("amarillo", 'B', 200, 4);
        listaElectrodomesticos[5] = new Lavadora("gris", 'C', 500, 2.4, 6);
        listaElectrodomesticos[6] = new Television(600, 70);
        listaElectrodomesticos[7] = new Lavadora("roja", 'A', 700, 23, 15);
        listaElectrodomesticos[8] = new Television("morado", 'C', 800, 45, 20, true);
        listaElectrodomesticos[9] = new Electrodomestico(900, 10);


        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;


        for (int i = 0; i < listaElectrodomesticos.length; i++) {

            if (listaElectrodomesticos[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                sumaLavadoras += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Television) {
                sumaTelevisiones += listaElectrodomesticos[i].precioFinal();
            }
        }
        double sumaTotal = sumaElectrodomesticos + sumaLavadoras + sumaTelevisiones;

        System.out.println("La suma del precio de los electrodomesticos es de: " + sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de: " + sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de: " + sumaTelevisiones);
        System.out.println("La suma del precio total de los electrodomesticos es de: " + sumaTotal);

    }
}