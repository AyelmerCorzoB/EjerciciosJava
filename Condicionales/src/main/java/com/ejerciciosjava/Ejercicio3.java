package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int nota;
        try (
            Scanner input = new Scanner(System.in)) {
            System.out.print("Ingresa tu nota: ");
            nota = input.nextInt();
        }
        if (nota >= 90 && nota <= 100) {
            System.out.println("A (90 -100)");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("B (80 - 89)");
        } else if (nota >=70 && nota <= 79) {
            System.out.println("C (70 - 79)");
        } else if (nota >= 60 && nota <= 69) {
            System.out.println("D (60 - 69)");
        }else {
            System.out.println("F (0 - 59)");
        }

    }
}