package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingresa un número entero y revisaremos si es divisible por 2 o por 3:");
            if (!input.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                return;
            }
            int numero = input.nextInt();
            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println(numero + " es divisible por 2 y por 3.");
            } else if (numero % 2 == 0) {
                System.out.println(numero + " es divisible por 2 solamente.");
            } else if (numero % 3 == 0) {
                System.out.println(numero + " es divisible por 3 solamente.");
            } else {
                System.out.println(numero + " no es divisible ni por 2 ni por 3.");
            }
        }
    }
}
