package com.ejerciciosjava;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        int ica = 0;
        boolean valido = false;
        String mensaje = "Ingresa el indice de calidad del aire (ICA):";

        try (Scanner input = new Scanner(System.in)) {
            while (!valido) {
                System.out.print(mensaje);
                if (input.hasNextInt()) {
                    ica = input.nextInt();

                    if (ica >= 0) {
                        valido = true;
                    } else {
                        System.out.println("Por favor, ingrese un índice de calidad del aire no negativo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                    input.next();
                }
            }

            if (ica >= 0 && ica <= 50) {
                System.out.println("El índice de calidad del aire (ICA) es bueno: " + ica);
            } else if (ica >= 51 && ica <= 100) {
                System.out.println("El índice de calidad del aire (ICA) es Moderado: " + ica);
            } else if (ica >= 101 && ica <= 150) {
                System.out.println("El índice de calidad del aire (ICA) es No saludable para grupos sensibles: " + ica);
            } else if (ica >= 151 && ica <= 200) {
                System.out.println("El índice de calidad del aire (ICA) es No saludable: " + ica);
            } else if (ica >= 201 && ica <= 300) {
                System.out.println("El índice de calidad del aire (ICA) es Muy no saludable: " + ica);
            } else {
                System.out.println("El índice de calidad del aire (ICA) es Peligroso: " + ica);
            }
        }
    }
}