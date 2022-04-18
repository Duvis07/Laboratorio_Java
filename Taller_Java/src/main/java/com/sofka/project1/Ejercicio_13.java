package com.sofka.project1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio_13 {
    public static void main(String[] args) {

        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("(AAAA/MM/DD) (HH:MM:SS)-> " + date1.format(LocalDateTime.now()));


        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println("(AAAA/MM/DD) (HH:MM:SS)-> " + date2.format(LocalDateTime.now()));
    }
}