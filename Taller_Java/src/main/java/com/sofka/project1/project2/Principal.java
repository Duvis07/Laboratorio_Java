package com.sofka.project1.project2;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);
        System.out.println("<<<Bienvenido al programa>>>");

        System.out.println("Por favor ingresa tu nombre");
        String nombre = sc.next();

        System.out.println("Por favor ingresa tu edad");
        int edad = sc.nextInt();

        System.out.println("Por favor ingresa tu sexo indicando Mujer(M) o hombre(H)");
        char sexo = sc.next().charAt(0);

        System.out.println("Por favor ingresa tu peso");
        double peso = sc.nextDouble();

        System.out.println("Por favor ingresa tu altura");
        double altura = sc.nextDouble();

/**
 * Crea 3 objetos de la clase anterior
 * primer objeto obtendrá las anteriores variables pedidas por teclado
 * el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto
 * El ultimo objeto utiliza los métodos set para darle a los atributos un valor.
 */

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona("Maria", 30, 'M');
        Persona persona3 = new Persona();


        persona3.setNombre("Alfredo");
        persona3.setEdad(70);
        persona3.setSexo('H');
        persona3.setPeso(86);
        persona3.setAltura(1.70);


        System.out.println("<<<Datos persona1>>>");
        muestraPeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());

        System.out.println("<<<Datos persona2>>>");
        muestraPeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());

        System.out.println("<<<Datos persona3>>>");
        muestraPeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }

    /**
     * Para cada objeto, deberá comprobar si está en su peso ideal
     * @param p
     */
    public static void muestraPeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {

            case Persona.peso_Ideal:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.bajo_Peso:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.sobre_Peso:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }

    /**
     * Indicar para cada objeto si es mayor de edad
     * @param p
     */
    public static void MuestraMayorDeEdad(Persona p) {

        if (p.MayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }


    }


}


