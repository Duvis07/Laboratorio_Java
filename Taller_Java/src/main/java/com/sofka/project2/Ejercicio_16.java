package com.sofka.project2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);
        System.out.println("<<<Bienvenido al programa>>>");

        System.out.println("Por favor ingresa tu nombre");
        String nombre = sc.next();

        System.out.println("Por favor ingresa tu  edad");
        int edad = sc.nextInt();

        System.out.println("Por favor ingresa tu sexo indicando Mujer(M) o hombre(H)");
        char sexo = sc.next().charAt(0);

        System.out.println("Por favor ingresa tu peso");
        double peso = sc.nextDouble();

        System.out.println("Por favor ingresa tu altura");
        double altura = sc.nextDouble();


        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        persona1.setNombre("Alfredo");
        persona1.setEdad(70);
        persona1.setSexo('H');
        persona1.setPeso(86);
        persona1.setAltura(1.70);

        persona2.setPeso(90.5);
        persona2.setAltura(1.50);

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

    public static void MuestraMayorDeEdad(Persona p) {

        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }


    }


}


