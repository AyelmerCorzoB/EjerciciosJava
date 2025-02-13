package com.demo;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        double saldoInicial;
        double cantidadFija;
        double tasaInteresAnual;
        int numeroMeses;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingresa el saldo inicial de la cuenta: ");
            saldoInicial = sc.nextDouble();
            System.out.println("Ingrese el deposito mensual fijo: ");
            cantidadFija = sc.nextDouble();
            System.out.println("Ingrese la tasa de interes anual (%): ");
            tasaInteresAnual = sc.nextDouble();
            double tasaInteresMensual = (tasaInteresAnual / 100) / 12;

            System.out.println("Ingrese el numero de meses de simulacion: ");
            numeroMeses = sc.nextInt();

            double saldoFinal = saldoInicial;
            double saldoTotal;
            double interesGenerado;

            System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Mes", "Saldo Inicial", "Depósito", "Interés",
                    "Saldo Final");

            for (int mes = 1; mes <= numeroMeses; mes++) {
                saldoTotal = saldoFinal + cantidadFija;
                interesGenerado = saldoTotal * tasaInteresMensual;
                saldoFinal = saldoTotal + interesGenerado;

                System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15.2f\n", mes,
                        saldoFinal - cantidadFija - interesGenerado, cantidadFija, interesGenerado, saldoFinal);
            }
        }

        System.out.println("-------------------------------------------------------------------------------");

    }
}
