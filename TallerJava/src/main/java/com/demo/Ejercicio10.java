package com.demo;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        double capitalInicial;
        double tasaInteresAnual;
        int plazoAnios;
        int opcion;
        double saldo;
        double nuevoSaldo;
        double interesGanado;
        int t;
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el monto de inversión: ");
            capitalInicial = sc.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (%): ");
            tasaInteresAnual = sc.nextDouble() / 100;

            System.out.print("Ingrese el plazo de inversión (en años): ");
            plazoAnios = sc.nextInt();

            System.out.println("""
                    Seleccione la frecuencia de capitalización:
                    1. Mensual
                    2. Trimestral
                    3. Semestral
                    4. Anual
                    """);
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> n = 12;
                case 2 -> n = 4;
                case 3 -> n = 2;
                case 4 -> n = 1;
                default -> {
                    System.out.println("Opción no válida.");
                    return;
                }
            }

            System.out.printf("%-6s %-15s %-15s %-15s%n", "Año", "Capital Inicial", "Interés Ganado", "Saldo Final");
            System.out.println("------------------------------------------------------------");

            saldo = capitalInicial;
            for (t = 1; t <= plazoAnios; t++) {
                nuevoSaldo = saldo * Math.pow(1 + (tasaInteresAnual / n), n);
                interesGanado = nuevoSaldo - saldo;

                System.out.printf("%-6d %-15.2f %-15.2f %-15.2f%n", t, saldo, interesGanado, nuevoSaldo);
                saldo = nuevoSaldo;
            }

            sc.close();
        }
    }
}