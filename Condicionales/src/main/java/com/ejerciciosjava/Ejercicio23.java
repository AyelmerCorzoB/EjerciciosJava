package com.ejerciciosjava;

import java.util.Scanner;

/*
 * Escribe un programa que convierta la edad de un perro a años humanos:
 * - Los dos primeros años de un perro equivalen a 10.5 años humanos cada uno.
 * - cada año adicional equivale a 4 años humanos.
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        int edadPerro = 0;
        double edadHumana = 0;
        boolean valido = false;
        String mensaje = "Ingrese la edad de su perro (número entero positivo): ";

        try (Scanner input = new Scanner(System.in)) {
            while (!valido) {
                System.out.print(mensaje);
                if (input.hasNextInt()) {
                    edadPerro = input.nextInt();

                    if (edadPerro >= 0) {
                        valido = true;
                    } else {
                        System.out.println("La edad no puede ser negativa. Inténtelo de nuevo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                    input.next();
                }
            }
            if (edadPerro == 1) {
                edadHumana = 10.5;
            } else if (edadPerro == 2) {
                edadHumana = 21.0;
            } else if (edadPerro > 2) {
                edadHumana = 21.0 + (edadPerro - 2) * 4;
            }

            System.out.println("La edad de su perro en años humanos es: " + edadHumana);
        }
    }
}