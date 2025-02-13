package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int edad;
        try (
            Scanner input = new Scanner(System.in)) {
            System.out.print("Ingresa tu edad: ");
            edad = input.nextInt();
        }
        if (edad >= 0 && edad <= 12) {
            System.out.println("Eres un niño porque estas entre los (0 - 12) años");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un adolecente porque estas entre los (13 - 17) años");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un adulto porque estas entre los (18 - 59) años");
        } else {
            System.out.println("Eres un adulto mayor ya que tienes (60+) años");
        }

    }
}